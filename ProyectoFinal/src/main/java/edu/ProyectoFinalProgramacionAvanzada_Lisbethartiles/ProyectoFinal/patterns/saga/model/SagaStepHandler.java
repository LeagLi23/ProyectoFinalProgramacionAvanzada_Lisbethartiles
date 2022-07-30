package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model;

public interface SagaStepHandler<T> {

    void handle(SagaPayload<T> sagaPayload);
}
