package studentDomen;

public class Teacher extends Person {
    private String acadDegree;
    public Teacher(String firstName, String secondName, int age, String address, String acadDegree) {
        super(firstName, secondName, age, address);
        this.acadDegree = acadDegree;
    }

    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }




    public String getAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }


    @Override
    public String toString() {
        return "Teacher{" +"firstname='" + super.getFirstName() + '\'' +
                "second name='"+super.getSecondName()+
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\''+
                "acadDegree='" + acadDegree + '\'' +
                '}';
    }
}
