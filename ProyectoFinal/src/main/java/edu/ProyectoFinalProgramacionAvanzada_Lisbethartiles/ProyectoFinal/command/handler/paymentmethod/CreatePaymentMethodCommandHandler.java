package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.paymentmethod;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod.CreatePaymentMethodCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.PaymentMethod;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.CreatePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
 
@Component
@RequiredArgsConstructor
@CommandEvent(command = CreatePaymentMethodCommand.class)
@Slf4j

public class CreatePaymentMethodCommandHandler implements CommandHandler<CreatePaymentMethodResponse, CreatePaymentMethodCommand> {

    private final PaymentMethodRepository paymentMethodRepository;

    @Override
    public CreatePaymentMethodResponse handle(CreatePaymentMethodCommand createPaymentMethodCommand) {
        PaymentMethod paymentMethod = paymentMethodRepository.save(createPaymentMethodCommand.toPaymentMethod());
        log.info("PaymentMethod {} created", paymentMethod.getId());
         return CreatePaymentMethodResponse.builder()
                .paymentMethod(paymentMethod.toDTO())
                .build();
    }
}