package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.GetPaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetPaymentMethodCommand extends Command<GetPaymentMethodResponse> {

    private Long id;

}