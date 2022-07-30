package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.handler;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

  
@RequiredArgsConstructor
@Component
public class PayCheckoutCompletePaymentHandler implements SagaStepHandler<PayCheckoutResponse> {

    @Override
    public void handle(SagaPayload<PayCheckoutResponse> sagaPayload) {
        String paymentIntent = sagaPayload.getProperty(PayCheckoutCommand.PAYMENT_INTENT);
        // Aquí terminaría mi payment intent con mastercard para que el balance se procese.
        if (LocalDateTime.now().getMinute() % 2 == 0) { // Condición de fallo dinámico puesto para ejemplo
            throw new RuntimeException("Error on process payment intent " + paymentIntent);
        }
    }
}
