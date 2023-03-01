package projects.letsie.mdu.factory;

import org.junit.jupiter.api.Test;
import projects.letsie.mdu.domain.Person;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {

    @Test
    public void test() {
        Person person = PersonFactory.createPerson(
            "Mdumisi Kelvin",
            "Letsie",
            "23-02-00",
            "Male",
            "Mr",
            "mdu.letsie7@gmail.com",
            "0676808676",
            "4 De Grendel Road",
            "Cape Town",
            "7441",
            "Western Cape");

            assertNotNull(person);
            System.out.println(person.toString());

    }
@Test
    public void test_fail() {
        Person person = PersonFactory.createPerson(
            "",
            "Letsie",
            "23-02-00",
            "Male",
            "Mr",
            "mdu.letsie7@gmail.com",
            "0676808676",
            "4 De Grendel Road",
            "Cape Town",
            "7441",
            "Western Cape");

            assertNotNull(person);
            System.out.println(person.toString());
    }


}