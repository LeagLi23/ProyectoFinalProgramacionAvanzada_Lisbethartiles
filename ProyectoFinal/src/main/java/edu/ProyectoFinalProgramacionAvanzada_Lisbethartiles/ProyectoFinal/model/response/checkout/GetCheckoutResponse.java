package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkout;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.CheckoutProductDTO;
import lombok.*;

import java.util.List;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetCheckoutResponse {

    private List<CheckoutProductDTO> checkouts;
}
