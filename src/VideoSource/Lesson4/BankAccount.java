package VideoSource.Lesson4;

public class BankAccount {
    int id;
    String name;
    double balace;

}
class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Viktor";
        MyAccount.balace=300.35;

        YourAccount.id=2;
        YourAccount.name="Timur";
        YourAccount.balace=1000.55;

        HisAccount.id=3;
        HisAccount.name="Asset";
        HisAccount.balace=1200.5;




    }

}
