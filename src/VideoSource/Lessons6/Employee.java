package VideoSource.Lessons6;

public class Employee {

    public Employee(String Surname) {
        surname = Surname;
    }

    Employee(int Id) {
        id = Id;
    }

    private Employee(double Salary) {
        salary = Salary;
    }

    public void getId() {
        System.out.println("Id: " + id);
    }

    public void getSurname() {
        System.out.println("surname: " + surname);
    }

    public void getSalary() {
        System.out.println("salary: " + salary);
    }

    int id;
    public String surname;
    int age;
    private double salary;
    String departament;
}

class EmployeTest {
    public static void main(String[] args) {


    }
}
