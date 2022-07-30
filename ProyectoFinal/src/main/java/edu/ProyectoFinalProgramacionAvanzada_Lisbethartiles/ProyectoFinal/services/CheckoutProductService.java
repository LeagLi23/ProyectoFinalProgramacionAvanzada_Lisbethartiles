package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.services;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkoutproduct.GetAllCheckoutProductCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkoutproduct.GetCheckoutProductCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkoutproduct.GetCheckoutProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandBus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

 
@Service
@RequiredArgsConstructor
public class CheckoutProductService {

    private final CommandBus commandBus;

    public GetCheckoutProductResponse getAll() {

        return commandBus.sendCommand(GetAllCheckoutProductCommand.builder().build());
    }

    public GetCheckoutProductResponse get(Long id) {
        return commandBus.sendCommand(GetCheckoutProductCommand.builder().id(id).build());
    }

}