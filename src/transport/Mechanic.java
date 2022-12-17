package transport;

public class Mechanic <T extends Transport> {
    private final String fullName;
    private String company;

    @Override
    public String toString() {
        return  fullName + ", компания: " + company + ".";
    }

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }
    public boolean service(T t) {
        return t.service();
    }
    public void repair(T t){
        t.repair();
    }
}
