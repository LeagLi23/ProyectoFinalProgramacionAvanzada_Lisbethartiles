package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.address;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.CreateAddressCommand;
import lombok.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class CreateAddressRequest {


    private String main;
    private String name;
    private String secondary;
    private Long telephone;

    public CreateAddressCommand toCommand() {
        return CreateAddressCommand.builder()
                .main(main)
                .secondary(secondary)
                .telephone(telephone)
                .build();
    }


}
