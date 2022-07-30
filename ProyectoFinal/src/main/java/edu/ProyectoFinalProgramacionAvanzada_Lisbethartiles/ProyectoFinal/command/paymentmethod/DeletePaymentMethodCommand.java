package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.DeletePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DeletePaymentMethodCommand extends Command<DeletePaymentMethodResponse> {

    private long id;

}