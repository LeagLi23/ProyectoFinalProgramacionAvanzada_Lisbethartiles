package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
