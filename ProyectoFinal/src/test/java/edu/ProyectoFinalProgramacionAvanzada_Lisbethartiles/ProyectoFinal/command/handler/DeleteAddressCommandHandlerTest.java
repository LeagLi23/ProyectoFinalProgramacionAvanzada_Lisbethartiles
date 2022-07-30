package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.DeleteAddressCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.address.DeleteAddressCommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.adress.DeleteAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.AddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

 
@SpringBootTest
class DeleteAddressCommandHandlerTest {

    @Mock
    private AddressRepository addressRepository;

    @BeforeEach
    void setup() {
    }

    @Test
    void deleteAddressTest() {
        DeleteAddressCommand deleteAddressCommand = DeleteAddressCommand.builder()
                .id(1L)
                .build();
        Mockito.doNothing().when(addressRepository).deleteById(ArgumentMatchers.eq(1L));
        DeleteAddressCommandHandler deleteAddressCommandHandler = new DeleteAddressCommandHandler(addressRepository);
        DeleteAddressResponse deleteAddressResponse = deleteAddressCommandHandler.handle(deleteAddressCommand);
        assertNotNull(deleteAddressResponse);
    }

}