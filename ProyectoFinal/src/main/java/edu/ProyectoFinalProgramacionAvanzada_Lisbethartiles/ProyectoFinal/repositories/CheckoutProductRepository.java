package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.CheckoutProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface CheckoutProductRepository extends JpaRepository<CheckoutProduct, Long> {
}
