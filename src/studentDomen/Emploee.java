package studentDomen;

public class Emploee extends  User{
    private String special;
    public Emploee(String firstName, String secondName, int age, String address, String special) {
        super(firstName, secondName, age, address);
        this.special=special;
    }



    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "firstname='" + super.getFirstName() + '\'' +
                "second name='"+super.getSecondName()+
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                "special='" + special + '\'' +
                '}';
    }
}
