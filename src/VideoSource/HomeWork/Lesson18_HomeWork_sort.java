package VideoSource.HomeWork;

public class Lesson18_HomeWork_sort {
    public static String[] abc(String[]... arr) {
        int length = 0;
        for (String[] array2 : arr) {
            length += array2.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] array2 : arr) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static int[] sortirovka(int arr[]) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                a = arr[i];
                arr[i] = min;
                arr[index] = a;
            }
        }
        return arr;
    }

    public static void showArray(String[][] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + ",");
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            if (i != arr.length - 1) {
                System.out.print("},");
            } else {
                System.out.print("}");
            }
            System.out.print(" }");
        }
    }


    public static void main(String[] args) {
//        int[] arr = {1, 4, 7, 2, 5, 8};
//        sortirovka(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        String array[][]={{"apple","orange"},{"hello","bye","ok"},{"car"}};
//        showArray(array);
//        System.out.println();
//        showArray(new String[][]{{"man","women"},{"male","female"}});
//        System.out.println();
        String[] target=abc(new String[]{"ok","privet","poka"},new String[]{"ok","hello","bye"});

        for (String s:args) {
            for (int i=0;i< target.length;i++){
                if(s.equals(target[i])){
                    target[i]=null;
                }
            }
        }
        for (String s:target){
            System.out.println(s+" ");
        }
        System.out.println();
    }
}




