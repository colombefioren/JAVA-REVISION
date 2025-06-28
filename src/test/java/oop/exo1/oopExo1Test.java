package oop.exo1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class oopExo1Test {

    Quartier quartier1;
    Quartier quartier2;
    Appartement appartement1;
    Appartement appartement2;
    Appartement appartement3;
    Appartement appartement4;
    Immeuble immeuble1;
    Immeuble immeuble2;

    @BeforeEach
    void setUp(){
        appartement1 = new Appartement(1, "Maison 1", "Maison 1", 100000,Statut.LIBRE, immeuble1);
        appartement2 = new Appartement(2, "Maison 2", "Maison 2", 100000,Statut.EN_COURS_LIBERATION, immeuble1);
        appartement3 = new Appartement(3, "Maison 3", "Maison 3", 100000,Statut.LIBRE, immeuble2);
        appartement4 = new Appartement(4, "Maison 4", "Maison 4", 100000, Statut.OCCUPE,immeuble2);
        immeuble1 = new Immeuble(1,"Cocorita",1, Arrays.asList(appartement1, appartement2));
        immeuble2 = new Immeuble(2,"Sosorita",5, Arrays.asList(appartement3, appartement4));
        quartier1 = new Quartier(1,"Ivandry", Collections.singletonList(immeuble1));
        quartier2 = new Quartier(2,"Tamatave", Collections.singletonList(immeuble2));
    }

    @Test
    void testAppartDansQuartier() {
        assertTrue(quartier1.appartDansQuartier(appartement1));
        assertTrue(quartier1.appartDansQuartier(appartement2));
        assertFalse(quartier1.appartDansQuartier(appartement3));
        assertFalse(quartier1.appartDansQuartier(appartement4));
        assertFalse(quartier2.appartDansQuartier(appartement1));
        assertFalse(quartier2.appartDansQuartier(appartement2));
        assertTrue(quartier2.appartDansQuartier(appartement3));
        assertTrue(quartier2.appartDansQuartier(appartement4));
    }

    @Test
    void testNbrAppart() {
        assertEquals(2, quartier1.nbrAppart());
        assertEquals(2, quartier2.nbrAppart());;
    }
}
