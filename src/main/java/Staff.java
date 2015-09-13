/**
 * Created by SHANE on 2015/09/08.
 */
public class Staff {

    private String name;
    private String surname;
    private int age;
    private String role;

    public Staff(String name, String surname, int age,String role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.role=role;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
