package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Address;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CreateAddressCommand  extends Command<CreateAddressResponse> {

    private String main;
    private String name;
    private String secondary;
    private String description;
    private Long telephone;

    public Address toAddress() {
        return Address.builder()
                .main(main)
                .name(name)
                .secondary(secondary)
                .description(description)
                .telephone(telephone)
                .build();
    }

}