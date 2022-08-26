package VideoSource.Lesson23;

public class Test6 {
}

class Animal2 {
    String showName() {
        return "some Animal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse2 extends Animal2 {
    String showName() {
        return "Jerry";
    }
    void showInfoAboutMouse() {
        System.out.println("Name of animal: " + showName());
    }

    public static void main(String[] args) {
        Mouse2 a = new Mouse2();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}
