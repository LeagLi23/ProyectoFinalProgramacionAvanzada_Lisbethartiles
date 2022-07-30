package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
 
@Builder
@AllArgsConstructor
@Getter
@Setter

public class GetAllAddressCommand extends Command<GetAddressResponse> {

    private int pageSize;
    private int page;
    private String name;

}