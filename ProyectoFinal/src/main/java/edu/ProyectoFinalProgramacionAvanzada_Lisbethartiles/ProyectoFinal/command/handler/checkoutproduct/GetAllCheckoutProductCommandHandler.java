package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.checkoutproduct;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkoutproduct.GetAllCheckoutProductCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.CheckoutProduct;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.CheckoutProductDTO;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkoutproduct.GetCheckoutProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.CheckoutProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

 
@Component
@RequiredArgsConstructor
@CommandEvent(command = GetAllCheckoutProductCommand.class)
@Slf4j

public class GetAllCheckoutProductCommandHandler implements CommandHandler<GetCheckoutProductResponse, GetAllCheckoutProductCommand> {

    private final CheckoutProductRepository checkoutProductRepository;

    @Override
    public GetCheckoutProductResponse handle(GetAllCheckoutProductCommand getAllCheckoutProductCommand) {
        log.debug("Get CheckoutProducts {}", getAllCheckoutProductCommand.toString());
        List<CheckoutProductDTO> checkoutproductDTOS = checkoutProductRepository.findAll().stream().map(CheckoutProduct::toDTO).collect(Collectors.toList());
        return GetCheckoutProductResponse.builder()
                .checkoutProducts(checkoutproductDTOS)
                .build();
    }
}