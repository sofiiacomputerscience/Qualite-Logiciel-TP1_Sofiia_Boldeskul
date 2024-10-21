package isen.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // Les tests ont été validés, car IntelliJ IDEA considère les tests vides comme valides, mais cela ne devrait pas être le cas.
    @Test
    void testConstructor() {
        Person person = new Person(); // Création d'un nouvel objet Personne
        assertEquals("unknown", person.getName()); // Vérifier que le nom par défaut est « unknown »
        assertEquals(22, person.getYears()); // Vérifier que l'âge par défaut est 22
    }
    @Test
    void testSetName() {
        Person person = new Person();
        person.setName("Sofiia"); // Fixer le nom à « Sofiia »
        assertEquals("Sofiia", person.getName()); // Vérifier que le nom a été changé en « Sofiia ».
    }

    @Test
    void testSetYears() {
        Person person = new Person();
        person.setYears(21); // Fixer l'âge à 21
        assertEquals(21, person.getYears()); // Vérifier que l'âge a bien été fixé à 21

    }
}

