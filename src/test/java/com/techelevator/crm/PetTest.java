package com.techelevator.crm;

import com.techelevator.Billable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void should_return_list_of_vaccinations() {
        Pet pet = new Pet("Spud McKensie", "dog");

        List<String> vaxx = new ArrayList<>();

        vaxx.add("Parvo");
        vaxx.add("Distemper");
        vaxx.add("Rabies");

        pet.setVaccinations(vaxx);
        pet.listVaccinations();
        Assert.assertEquals("Parvo, Distemper, Rabies", pet.listVaccinations());
    }

}