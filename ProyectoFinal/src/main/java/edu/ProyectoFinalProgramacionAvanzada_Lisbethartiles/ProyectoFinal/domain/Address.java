package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.AddressDTO;
import lombok.*;

import javax.persistence.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column
    private String main;
    @Column
    private String name;
    @Column
    private String secondary;
    @Column
    private String description;
    @Column
    private Long telephone;


    public AddressDTO toDTO() {
        return AddressDTO.builder()
                .id(id)
                .main(main)
                .name(name)
                .secondary(secondary)
                .description(description)
                .telephone(telephone)
                .build();
    }

}
