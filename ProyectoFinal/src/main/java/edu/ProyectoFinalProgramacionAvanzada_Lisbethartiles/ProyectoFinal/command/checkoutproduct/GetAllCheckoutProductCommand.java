package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkoutproduct;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkoutproduct.GetCheckoutProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
 
@Builder
@AllArgsConstructor
@Getter
@Setter

public class GetAllCheckoutProductCommand extends Command<GetCheckoutProductResponse> {


}