package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
