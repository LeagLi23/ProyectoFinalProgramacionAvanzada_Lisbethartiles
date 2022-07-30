package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.UpdatePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UpdatePaymentMethodCommand extends Command<UpdatePaymentMethodResponse> {

    private Long id;
    private String name;
    private String description;


}