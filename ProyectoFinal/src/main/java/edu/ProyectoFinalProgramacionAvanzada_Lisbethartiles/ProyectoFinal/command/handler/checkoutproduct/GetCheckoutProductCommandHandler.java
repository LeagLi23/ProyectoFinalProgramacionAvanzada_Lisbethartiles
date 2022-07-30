package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.checkoutproduct;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkoutproduct.GetCheckoutProductCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.CheckoutProductDTO;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkoutproduct.GetCheckoutProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.CheckoutProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

 
@Component
@RequiredArgsConstructor
@CommandEvent(command = GetCheckoutProductCommand.class)
@Slf4j

public class GetCheckoutProductCommandHandler implements CommandHandler<GetCheckoutProductResponse, GetCheckoutProductCommand> {

    private final CheckoutProductRepository checkoutProductRepository;

    @Override
    public GetCheckoutProductResponse handle(GetCheckoutProductCommand getCheckoutProductCommand) {
        log.debug("Get CheckoutProduct {}", getCheckoutProductCommand.getId());
        CheckoutProductDTO checkoutProductDTO = checkoutProductRepository.findById(getCheckoutProductCommand.getId()).orElseThrow().toDTO();
        return GetCheckoutProductResponse.builder()
                .checkoutProducts(List.of(checkoutProductDTO))
                .build();
    }
}