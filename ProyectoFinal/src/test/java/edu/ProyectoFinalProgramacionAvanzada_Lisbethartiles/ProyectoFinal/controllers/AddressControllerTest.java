package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.controllers;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.controller.AddressController;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.address.CreateAddressRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolationException;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AddressControllerTest {

    @Autowired
    private AddressController addressController;

    @Test
    void checkCreateAddressRequestTest() {
        CreateAddressRequest createAddressRequest = CreateAddressRequest.builder()
                .name(null)
                .build();
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            try {
                addressController.create(createAddressRequest);
            } catch (Exception ex) {
                ex.printStackTrace();
                throw ex;
            }
        });
    }

    @Test
    void checkCreateAddressRequest_minNameSizeTest() {
        CreateAddressRequest createAddressRequest = CreateAddressRequest.builder()
                .name("123")
                .build();
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            try {
                addressController.create(createAddressRequest);
            } catch (Exception ex) {
                ex.printStackTrace();
                throw ex;
            }
        });
    }

    @Test
    void checkCreateAddressRequest_maxNameSizeTest() {
        CreateAddressRequest createAddressRequest = CreateAddressRequest.builder()
                .name("0123456789A")
                .build();
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            try {
                addressController.create(createAddressRequest);
            } catch (Exception ex) {
                ex.printStackTrace();
                throw ex;
            }
        });
    }

}