package transport;

public class Sponsor {
    private final String name;
    private final int money;

    public Sponsor(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
    public void moneyToRace(){
        System.out.println(name + " проспонсировал звезд на " + money + "$");
    }

    @Override
    public String toString() {
        return name +", сумма поддержки: " + money +"$";
    }
}
