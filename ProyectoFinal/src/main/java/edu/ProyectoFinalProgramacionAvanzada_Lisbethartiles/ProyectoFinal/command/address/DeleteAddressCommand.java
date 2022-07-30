package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;
 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DeleteAddressCommand extends Command<DeleteAddressResponse> {

    private long id;

}