package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.paymentmethod;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod.GetAllPaymentMethodCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.PaymentMethod;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.PaymentMethodDTO;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.GetPaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
 
@Component
@RequiredArgsConstructor
@CommandEvent(command = GetAllPaymentMethodCommand.class)
@Slf4j

public class GetAllPaymentMethodCommandHandler implements CommandHandler<GetPaymentMethodResponse, GetAllPaymentMethodCommand> {

    private final PaymentMethodRepository paymentMethodRepository;

    @Override
    public GetPaymentMethodResponse handle(GetAllPaymentMethodCommand getAllPaymentMethodCommand) {
        log.debug("Get PaymentMethods {}", getAllPaymentMethodCommand.toString());
        List<PaymentMethodDTO> PaymentMethodDTOS = paymentMethodRepository.findAll().stream().map(PaymentMethod::toDTO).collect(Collectors.toList());
        return GetPaymentMethodResponse.builder()
                .paymentMethods(PaymentMethodDTOS)
                .build();
    }
}