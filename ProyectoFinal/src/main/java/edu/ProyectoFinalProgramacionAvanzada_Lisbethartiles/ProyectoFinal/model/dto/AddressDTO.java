package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto;

import lombok.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class AddressDTO {

    private String id;

    private String main;

    private String name;

    private String secondary;

    private String description;

    private Long telephone;

}
