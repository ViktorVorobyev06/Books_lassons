package VideoSource.HomeWork.Lesson22_HomeWork;

public class Student {
    private StringBuilder name;
    private int cource;
    private int grade;

    //    Student(StringBuilder name,int cource,double grade){
//        this.name=name;
//        this.cource=cource;
//        this.grade=grade;
//    }
    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
            return name2;

    }

    public void setName(StringBuilder name) {
        if (name.length() > 3)
        this.name = name;
    }

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        if (cource >= 1 && cource <= 4) {
            this.cource = cource;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10)
            this.grade = grade;
    }

    public void showInfo() {
        System.out.println("Name: " + getName() + " Uchitca na kurse: " + getCource() + " Ocenka: " + getGrade());
    }
}

class Test5 {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Ivan"));
        st.setCource(4);
        st.setGrade(5);
        st.showInfo();
    }
}


