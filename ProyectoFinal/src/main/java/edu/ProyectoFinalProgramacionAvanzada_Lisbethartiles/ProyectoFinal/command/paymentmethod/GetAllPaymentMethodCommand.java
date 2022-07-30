package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.paymentmethod;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.GetPaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

 
@Builder
@AllArgsConstructor
@Getter
@Setter

public class GetAllPaymentMethodCommand extends Command<GetPaymentMethodResponse> {


}