package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.PaymentMethod;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.CreatePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CreatePaymentMethodCommand extends Command<CreatePaymentMethodResponse> {

    private String name;
    private String description;

    public PaymentMethod toPaymentMethod() {
        return PaymentMethod.builder()
                .name(name)
                .description(description)
                .build();
    }

}