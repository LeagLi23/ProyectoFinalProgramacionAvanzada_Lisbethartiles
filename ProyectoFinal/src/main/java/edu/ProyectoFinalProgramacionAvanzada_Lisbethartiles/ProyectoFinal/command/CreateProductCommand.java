package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.CreateProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateProductCommand extends Command<CreateProductResponse> {

    private boolean explote;
}
