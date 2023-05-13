package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_balance_due() {

        Customer customer = new Customer("George", "Jetson");
        double balanceDue = 0;

        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Grooming", 75.00);
        servicesRendered.put("Walking", 55.00);
        servicesRendered.put("Sitting", 35.00);

        balanceDue = customer.getBalanceDue(servicesRendered);

        Assert.assertEquals(165, balanceDue, 165);
    }
}