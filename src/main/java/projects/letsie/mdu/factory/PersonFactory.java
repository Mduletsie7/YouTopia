package projects.letsie.mdu.factory;

import projects.letsie.mdu.domain.Person;
import projects.letsie.mdu.util.Helper;

public class PersonFactory {
    public static Person createPerson(
            String firstName,
            String lastName,
            String DOB,
            String Gender,
            String Title,
            String emailAddress,
            String phoneNumber,
            String Address,
            String City,
            String postalCode,
            String Province) {
        if (
                Helper.isNullOrEmpty(firstName)
                || Helper.isNullOrEmpty(lastName)
                || Helper.isNullOrEmpty(DOB)
                || Helper.isNullOrEmpty(Gender)
                || Helper.isNullOrEmpty(Title)
                || Helper.isNullOrEmpty(phoneNumber)
                || Helper.isNullOrEmpty(Address)
                || Helper.isNullOrEmpty(City)
                || Helper.isNullOrEmpty(postalCode)
                || Helper.isNullOrEmpty(Province)) {
            return null;
        }

//        String accountNumber = Helper.generateId();
            String accountNumber = Helper.generateAccountNumber();
            String accountPin = Helper.generateAccountPin();

        if (!Helper.isValidEmail(emailAddress)) {
            return null;
        }

        Person person = new Person.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setDOB(DOB)
                .setGender(Gender)
                .setTitle(Title)
                .setEmailAddress(emailAddress)
                .setPhoneNumber(phoneNumber)
                .setAddress(Address)
                .setCity(City)
                .setPostalCode(postalCode)
                .setProvince(Province)
                .setAccountNumber(accountNumber)
                .setAccountPin(accountPin)
                .build();

        return person;
    }
}
