package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.DemoResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DemoCommand extends Command<DemoResponse> {

    private boolean explote;
}
