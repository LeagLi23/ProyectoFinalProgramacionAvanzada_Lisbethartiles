package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.handler;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Checkout;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.exceptions.CheckoutNoFoundException;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

  
@RequiredArgsConstructor
@Component
public class PayCheckoutFinDataHandler implements SagaStepHandler<PayCheckoutResponse> {

    private final CheckoutRepository checkoutRepository;

    @Override
    public void handle(SagaPayload<PayCheckoutResponse> sagaPayload) {
        PayCheckoutCommand command = sagaPayload.getProperty(PayCheckoutCommand.COMMAND);
        Checkout checkout = checkoutRepository.findById(command.getId()).orElseThrow(() -> new CheckoutNoFoundException(command.getId()));

        sagaPayload.addProperty(PayCheckoutCommand.CHECKOUT, checkout);
    }
}
