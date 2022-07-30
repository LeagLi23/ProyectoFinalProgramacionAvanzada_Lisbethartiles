package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.product.CreateProductCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Product;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.product.CreateProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

 
@Component
@RequiredArgsConstructor
@CommandEvent(command = CreateProductCommand.class)
@Slf4j
public class CreateProductCommandHandler implements CommandHandler<CreateProductResponse, CreateProductCommand> {

    private final ProductRepository productRepository;

    @Override
    public CreateProductResponse handle(CreateProductCommand createProductCommand) {
        Product product = productRepository.save(createProductCommand.toProduct());
        log.info("Product {} created", product.getId());
        return CreateProductResponse.builder()
                .product(product.toDTO())
                .build();
    }
}
