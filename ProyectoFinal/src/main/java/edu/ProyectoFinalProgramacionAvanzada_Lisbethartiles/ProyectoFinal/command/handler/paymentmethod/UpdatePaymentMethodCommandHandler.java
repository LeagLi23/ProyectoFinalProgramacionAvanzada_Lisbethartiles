package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.paymentmethod;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod.UpdatePaymentMethodCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.PaymentMethod;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.UpdatePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
 
@Component
@RequiredArgsConstructor
@CommandEvent(command = UpdatePaymentMethodCommand.class)
@Slf4j

public class UpdatePaymentMethodCommandHandler implements CommandHandler<UpdatePaymentMethodResponse, UpdatePaymentMethodCommand> {

    private final PaymentMethodRepository paymentMethodRepository;

    @Override
    public UpdatePaymentMethodResponse handle(UpdatePaymentMethodCommand updatePaymentMethodCommand) {
        PaymentMethod paymentMethod = paymentMethodRepository.findById(updatePaymentMethodCommand.getId()).orElseThrow();
        paymentMethod.setName(updatePaymentMethodCommand.getName());
        paymentMethod.setDescription(updatePaymentMethodCommand.getDescription());
        paymentMethodRepository.save(paymentMethod);
        log.info("PaymentMethod {} updated", updatePaymentMethodCommand.getId());
         return UpdatePaymentMethodResponse.builder()
                .paymentMethod(paymentMethod.toDTO())
                .build();
    }
}