package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;
 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DeleteProductCommand extends Command<DeleteProductResponse> {

    private long id;

}