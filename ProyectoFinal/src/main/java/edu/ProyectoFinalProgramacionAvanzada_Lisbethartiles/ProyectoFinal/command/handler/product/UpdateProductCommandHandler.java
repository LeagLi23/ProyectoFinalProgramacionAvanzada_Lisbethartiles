package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.product.UpdateProductCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Product;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.product.UpdateProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

 
@Component
@RequiredArgsConstructor
@CommandEvent(command = UpdateProductCommand.class)
@Slf4j
public class UpdateProductCommandHandler implements CommandHandler<UpdateProductResponse, UpdateProductCommand> {

    private final ProductRepository productRepository;

    @Override
    public UpdateProductResponse handle(UpdateProductCommand updateProductCommand) {
        Product product = productRepository.findById(updateProductCommand.getId()).orElseThrow();
        product.setAvailableQuantity(updateProductCommand.getAvailableQuantity());
        product.setDescription(updateProductCommand.getDescription());
        product.setPrice(updateProductCommand.getPrice());
        productRepository.save(product);
        log.info("Product {} updated", updateProductCommand.getId());
        return UpdateProductResponse.builder().product(product.toDTO()).build();
    }
}
