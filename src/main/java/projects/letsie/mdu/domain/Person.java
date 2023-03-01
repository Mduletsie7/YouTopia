package projects.letsie.mdu.domain;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String DOB;
    private String Gender;
    private String Title;
    private String emailAddress;
    private String phoneNumber;
    private String Address;
    private String City;
    private String postalCode;
    private String Province;
    private String accountNumber;
    private String accountPin;

    public Person() {}

    // Add private constructor
    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.DOB = builder.DOB;
        this.Gender = builder.Gender;
        this.Title = builder.Title;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.Address = builder.Address;
        this.City = builder.City;
        this.postalCode = builder.postalCode;
        this.Province = builder.Province;
        this.accountNumber = builder.accountNumber;
        this.accountPin = builder.accountPin;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getGender() {
        return Gender;
    }

    public String getTitle() {
        return Title;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return Province;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountPin() {
        return accountPin;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String DOB;
        private String Gender;
        private String Title;
        private String emailAddress;
        private String phoneNumber;
        private String Address;
        private String City;
        private String postalCode;
        private String Province;
        private String accountNumber;
        private String accountPin;

        // SETTERS
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setDOB(String dob) {
            this.DOB = dob;
            return this;
        }
        public Builder setGender(String gender) {
            this.Gender = gender;
            return this;
        }
        public Builder setTitle(String title) {
            this.Title = title;
            return this;
        }
        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder setAddress(String address) {
            this.Address = address;
            return this;
        }
        public Builder setCity(String city) {
            this.City = city;
            return this;
        }
        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder setProvince(String province) {
            this.Province = province;
            return this;
        }
        public Builder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }
        public Builder setAccountPin(String accountPin) {
            this.accountPin = accountPin;
            return this;
        }

        public Builder copy(Person person) {
            this.firstName = person.firstName;
            this.lastName = person.lastName;
            this.DOB = person.DOB;
            this.Gender = person.Gender;
            this.Title = person.Title;
            this.emailAddress = person.emailAddress;
            this.phoneNumber = person.phoneNumber;
            this.Address = person.Address;
            this.City = person.City;
            this.postalCode = person.postalCode;
            this.Province = person.Province;
            this.accountNumber = person.accountNumber;
            this.accountPin = person.accountPin;
            return this;
        }
        public Person build() {
            return new Person(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(DOB, person.DOB) && Objects.equals(Gender, person.Gender) && Objects.equals(Title, person.Title) && Objects.equals(emailAddress, person.emailAddress) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(Address, person.Address) && Objects.equals(City, person.City) && Objects.equals(postalCode, person.postalCode) && Objects.equals(Province, person.Province) && Objects.equals(accountNumber, person.accountNumber) && Objects.equals(accountPin, person.accountPin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, DOB, Gender, Title, emailAddress, phoneNumber, Address, City, postalCode, Province, accountNumber, accountPin);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Title='" + Title + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", Province='" + Province + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountPin='" + accountPin + '\'' +
                '}';
    }
}
