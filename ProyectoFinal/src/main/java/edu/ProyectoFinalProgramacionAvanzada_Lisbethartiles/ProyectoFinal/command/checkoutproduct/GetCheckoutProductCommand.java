package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkoutproduct;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkoutproduct.GetCheckoutProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetCheckoutProductCommand extends Command<GetCheckoutProductResponse> {

    private Long id;

}