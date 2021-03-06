package se.cag.labs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class VerifyTest {

    private static final String CUSTOMER_ID = "1122333";
    private static final String NAME = "Ross";

    @Mock
    private CustomerDao daoMock;

    @InjectMocks
    private CustomerService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    /**
     * Övning 4A. Test av verify.
     *
     * Testa att uppdatera en existerande kund och att CustomerDao.update() har anropats.
     * Kontrollera även att save() INTE anropas när man gör en update.
     *
     *
     */
    @Test
    public void updateCustomer_shouldCallCorrectMethods() {


        service.updateCustomer(new Customer(NAME, CUSTOMER_ID));

    }

    /**
     * Övning 4B. Test av verify.
     *
     * Testa att lägga till en ny kund service.addCustomer() och verifiera att
     *  - CustomerDao.exists() anropas
     *  - CustomerDao.save() anropas
     */
    @Test
    public void saveCustomer_shouldCallCorrectMethods() {

        service.addCustomer(new Customer(NAME, CUSTOMER_ID));

    }
}
