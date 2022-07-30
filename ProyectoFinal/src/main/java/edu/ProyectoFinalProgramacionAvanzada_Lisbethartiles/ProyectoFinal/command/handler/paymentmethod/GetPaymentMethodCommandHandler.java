package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.paymentmethod;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod.GetPaymentMethodCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.PaymentMethodDTO;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.GetPaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
 
@Component
@RequiredArgsConstructor
@CommandEvent(command = GetPaymentMethodCommand.class)
@Slf4j

public class GetPaymentMethodCommandHandler implements CommandHandler<GetPaymentMethodResponse, GetPaymentMethodCommand> {

    private final PaymentMethodRepository paymentMethodRepository;

    @Override
    public GetPaymentMethodResponse handle(GetPaymentMethodCommand getPaymentMethodCommand) {
        log.debug("Get PaymentMethod {}", getPaymentMethodCommand.getId());
        PaymentMethodDTO paymentMethodDTO = paymentMethodRepository.findById(getPaymentMethodCommand.getId()).orElseThrow().toDTO();
        return GetPaymentMethodResponse.builder()
                .paymentMethods(List.of(paymentMethodDTO))
                .build();
    }
}