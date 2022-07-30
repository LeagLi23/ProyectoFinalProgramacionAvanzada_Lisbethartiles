package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.UpdateAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;
 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UpdateAddressCommand extends Command<UpdateAddressResponse> {

    private Long id;
    private String main;
    private String Name;
    private String secondary;
    private String Description;
    private Long telephone;

}