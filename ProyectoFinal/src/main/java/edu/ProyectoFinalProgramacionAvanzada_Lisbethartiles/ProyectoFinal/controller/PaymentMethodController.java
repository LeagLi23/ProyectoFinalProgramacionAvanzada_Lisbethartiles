package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.controller;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.payment.CreatePaymentMethodRequest;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.payment.DeletePaymentMethodRequest;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.payment.UpdatePaymentMethodRequest;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.CreatePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.DeletePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.GetPaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.payment.UpdatePaymentMethodResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.services.PaymentMethodService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

 
@RestController
@RequiredArgsConstructor
@RequestMapping("/payment/methods")
public class PaymentMethodController {

    private final PaymentMethodService paymentMethodService;

    @GetMapping
    public ResponseEntity<GetPaymentMethodResponse> get() {
        return ResponseEntity.ok(paymentMethodService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetPaymentMethodResponse> get(@PathVariable Long id) {
        return ResponseEntity.ok(paymentMethodService.get(id));
    }

    @PostMapping
    public ResponseEntity<CreatePaymentMethodResponse> create(@RequestBody CreatePaymentMethodRequest createPaymentMethodRequest) {
        return ResponseEntity.ok(paymentMethodService.create(createPaymentMethodRequest));
    }

    @PutMapping
    public ResponseEntity<UpdatePaymentMethodResponse> update(@RequestBody UpdatePaymentMethodRequest updatePaymentMethodRequest) {
        return ResponseEntity.ok(paymentMethodService.update(updatePaymentMethodRequest));
    }

    @DeleteMapping
    public ResponseEntity<DeletePaymentMethodResponse> delete(@RequestBody DeletePaymentMethodRequest deletePaymentMethodRequest) {
        return ResponseEntity.ok(paymentMethodService.delete(deletePaymentMethodRequest));
    }
}
