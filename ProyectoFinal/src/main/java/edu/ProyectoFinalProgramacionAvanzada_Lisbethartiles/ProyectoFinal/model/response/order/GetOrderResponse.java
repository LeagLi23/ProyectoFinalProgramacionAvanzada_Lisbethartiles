package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.order;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.OrderDTO;
import lombok.*;

import java.util.List;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetOrderResponse {

    private List<OrderDTO> orders;
}
