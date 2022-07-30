package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.step;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.CreateProductCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.exceptions.BadSagaException;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.CreateProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class SagaCreateProductResponseStepTrueFinal implements SagaStep<CreateProductResponse> {

    @Override
    public String getName() {
        return "Demo Step true final";
    }

    @Override
    public SagaStepHandler<CreateProductResponse> getHandler() {
        return sagaPayload -> {
            CreateProductCommand command = sagaPayload.getProperty(new SagaPayLoadKey<>("id", CreateProductCommand.class));
            log.info("Running {} Handler", getName());
            if (command.isExplote()) {
                throw new BadSagaException();
            }
            sagaPayload.setResult(CreateProductResponse.builder().product().build());
        };
    }

    @Override
    public SagaStepCompensator<CreateProductResponse> getCompensator() {
        return null;
    }
}
