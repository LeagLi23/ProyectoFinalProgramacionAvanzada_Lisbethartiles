package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.product.GetProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
 
@Builder
@AllArgsConstructor
@Getter
@Setter

public class GetAllProductCommand extends Command<GetProductResponse> {


}