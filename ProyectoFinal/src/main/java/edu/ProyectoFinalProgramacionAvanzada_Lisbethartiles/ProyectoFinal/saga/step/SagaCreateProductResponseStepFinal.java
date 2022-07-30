package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.saga.step;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.CreateProductCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.CreateProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStep;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepCompensator;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaStepHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
@Slf4j
public class SagaCreateProductResponseStepFinal implements SagaStep<CreateProductResponse> {

    @Override
    public String getName() {
        return "Demo Step final";
    }

    @Override
    public SagaStepHandler<CreateProductResponse> getHandler() {
        return sagaPayload -> {
            CreateProductCommand command = sagaPayload.getProperty(new SagaPayLoadKey<>("command", CreateProductCommand.class));
            log.info("Running {} Handler", getName());
            System.out.println("Testing Demo Handler");
            BigDecimal decimal = sagaPayload.getProperty(new SagaPayLoadKey<>("decimal", BigDecimal.class));
            log.info("Reading value from step 1: {}", decimal);
        };
    }

    @Override
    public SagaStepCompensator<CreateProductResponse> getCompensator() {
        return null;
    }
}
