package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.product.GetProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;
 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetProductCommand extends Command<GetProductResponse> {

    private Long id;

}