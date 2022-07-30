package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Address;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByNameContainingIgnoreCase(String name, PageRequest pageable);

}
