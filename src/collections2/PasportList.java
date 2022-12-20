package collections2;

import java.util.Set;

public class PasportList {
    private Set<Passport> passports;

    public PasportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public void addPassport(Passport passport){
        Passport copy = getPassport(passport.getNumber());
        if (copy != null){
            passports.remove(copy);
            passports.add(passport);
        }
    }

    public Passport getPassport(String number){
        for (Passport passport : passports){
            if (passport.getNumber().equals(number)){
                return passport;
            }
        }
        return null;
    }

    public Set<Passport> getPassports() {
        return passports;
    }

    public void setPassports(Set<Passport> passports) {
        this.passports = passports;
    }

    @Override
    public String toString() {
        return "PasportList " + passports;
    }
}
