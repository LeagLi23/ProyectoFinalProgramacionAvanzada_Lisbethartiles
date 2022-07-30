package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.handler;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Order;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayload;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

  
@RequiredArgsConstructor
@Component
public class PayCheckoutSaveOrderHandler implements SagaStepHandler<PayCheckoutResponse> {

    private final OrderRepository orderRepository;

    @Override
    public void handle(SagaPayload<PayCheckoutResponse> sagaPayload) {
        Order order = sagaPayload.getProperty(PayCheckoutCommand.ORDER);
        orderRepository.save(order);
    }
}
