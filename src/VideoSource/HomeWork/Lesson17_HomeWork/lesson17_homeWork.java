package VideoSource.HomeWork.Lesson17_HomeWork;

public class lesson17_homeWork {
    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                  if (sb1.charAt(i) != sb2.charAt(i)) {
                        return result = false;

                }
            }
        } else {
            result = false;
        }
        return result;
    }
}

class test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sad");
        StringBuilder sb2 = new StringBuilder("sa d");
        lesson17_homeWork sb3 = new lesson17_homeWork();
        System.out.println(sb3.ravenstvo(sb, sb2));
    }
}
