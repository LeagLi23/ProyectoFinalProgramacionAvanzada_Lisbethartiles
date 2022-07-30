package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;
 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetAddressCommand extends Command<GetAddressResponse> {

    private Long id;

}