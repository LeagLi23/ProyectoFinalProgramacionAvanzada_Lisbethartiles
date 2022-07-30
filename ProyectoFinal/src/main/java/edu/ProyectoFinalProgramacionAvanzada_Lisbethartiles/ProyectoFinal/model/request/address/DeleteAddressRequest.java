package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.address;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.DeleteAddressCommand;
import lombok.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class DeleteAddressRequest {

    private long id;

    public DeleteAddressCommand toCommand() {
        return DeleteAddressCommand.builder()
                .id(id)
                .build();
    }

}
