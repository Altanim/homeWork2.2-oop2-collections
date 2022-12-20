package collections2;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private String name;
    private String surname;
    private String patronymicName;
    private String number;
    private String birthDate;

    public Passport(String name, String surname, String patronymicName, String number, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.patronymicName = patronymicName;
        this.number = number;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "\nPassport of " + name + " " + surname + " " + patronymicName + ". Birth date " + birthDate +
                "\nNumber " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return Objects.equals(getNumber(), passport.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }
}
