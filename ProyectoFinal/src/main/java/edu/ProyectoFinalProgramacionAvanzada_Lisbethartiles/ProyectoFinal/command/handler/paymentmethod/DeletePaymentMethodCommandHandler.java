package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.paymentmethod;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod.DeletePaymentMethodCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.DeletePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
 
@Component
@RequiredArgsConstructor
@CommandEvent(command = DeletePaymentMethodCommand.class)
@Slf4j

public class DeletePaymentMethodCommandHandler implements CommandHandler<DeletePaymentMethodResponse, DeletePaymentMethodCommand> {

    private final PaymentMethodRepository paymentMethodRepository;

    @Override
    public DeletePaymentMethodResponse handle(DeletePaymentMethodCommand deletePaymentMethodCommand) {
        paymentMethodRepository.deleteById(deletePaymentMethodCommand.getId());
        log.info("PaymentMethod {} deleted", deletePaymentMethodCommand.getId());
         return DeletePaymentMethodResponse.builder()
                .build();
    }
}