package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.PaymentMethodDTO;
import lombok.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMethodResponse {

    private PaymentMethodDTO paymentMethod;
}
