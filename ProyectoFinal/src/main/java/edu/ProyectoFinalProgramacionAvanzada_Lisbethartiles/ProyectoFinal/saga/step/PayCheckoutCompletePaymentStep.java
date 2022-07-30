package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.step;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.compensator.PayCheckoutCompletePaymentCompensator;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.handler.PayCheckoutCompletePaymentHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

 
@RequiredArgsConstructor
@Component
@Slf4j
public class PayCheckoutCompletePaymentStep implements SagaStep<PayCheckoutResponse> {

    private final PayCheckoutCompletePaymentHandler payCheckoutCompletePaymentHandler;
    private final PayCheckoutCompletePaymentCompensator payCheckoutCompletePaymentCompensator;

    @Override
    public String getName() {
        return "Complete Payment";
    }

    @Override
    public SagaStepHandler<PayCheckoutResponse> getHandler() {
        return payCheckoutCompletePaymentHandler;
    }

    @Override
    public SagaStepCompensator<PayCheckoutResponse> getCompensator() {
        return payCheckoutCompletePaymentCompensator;
    }
}
