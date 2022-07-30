package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.payment;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod.DeletePaymentMethodCommand;
import lombok.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeletePaymentMethodRequest {

    private Long id;

    public DeletePaymentMethodCommand toCommand() {
        return DeletePaymentMethodCommand.builder()
                .id(id)
                .build();
    }

}
