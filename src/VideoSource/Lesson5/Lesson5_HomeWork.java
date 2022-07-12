package VideoSource.Lesson5;

class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    Employee(int id1, String surname1, int age1, double salary1, String departament1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        departament = departament1;
    }

/*
    double uvelichSalary() {
        return salary *= 2;
    }
*/
    double uvelichSalary() {
        salary *= 2;
        return salary;
    }

}

class BankAccountTest {
    int id;
    String name;
    double balace;

    void popolnenieScheta(double b) {
         balace += b;
        System.out.println(balace);
    }

    void snytieieSoScheta(double b) {
        balace -= b;
        System.out.println(balace);
    }
}

public class Lesson5_HomeWork {
    public static void main(String[] args) {
      /*  BankAccountTest bA=new BankAccountTest();

        bA.balace=200.0;

        bA.popolnenieScheta(300.0);
        bA.snytieieSoScheta(100.0);
*/

        Employee emp = new Employee(1, "Viktor", 25, 300000.0, "IT");

        System.out.println(emp.uvelichSalary());

    }
}
