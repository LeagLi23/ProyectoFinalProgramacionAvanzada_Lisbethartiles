package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.payment;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod.UpdatePaymentMethodCommand;
import lombok.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdatePaymentMethodRequest {

    private Long id;
    private String name;
    private String description;

    public UpdatePaymentMethodCommand toCommand() {
        return UpdatePaymentMethodCommand.builder()
                .name(name)
                .description(description)
                .build();
    }
}
