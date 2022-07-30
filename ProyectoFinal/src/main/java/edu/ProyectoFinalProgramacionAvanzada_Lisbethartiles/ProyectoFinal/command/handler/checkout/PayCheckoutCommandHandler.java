package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.checkout;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkout.PayCheckoutCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.SagaOrchestrator;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.Saga;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.SagaFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@RequiredArgsConstructor
@CommandEvent(command = PayCheckoutCommand.class)
@Slf4j
public class PayCheckoutCommandHandler implements CommandHandler<PayCheckoutResponse, PayCheckoutCommand> {

    private final SagaOrchestrator sagaOrchestrator;

    @Value("${pattern.saga.timeout}")
    private int timeout;

    @Override
    public PayCheckoutResponse handle(PayCheckoutCommand payCheckoutCommand) {
        Saga<PayCheckoutResponse> saga = SagaFactory.payCheckoutSaga(UUID.randomUUID(), payCheckoutCommand);
        return sagaOrchestrator.orchestrate(saga, timeout);
    }
}
