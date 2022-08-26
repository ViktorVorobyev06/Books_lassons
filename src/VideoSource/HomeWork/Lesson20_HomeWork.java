package VideoSource.HomeWork;

import VideoSource.Lesson20.ArrayList_Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Lesson20_HomeWork {
    public static ArrayList<String> abc(String... s) {
        ArrayList<String> array = new ArrayList<>();
        for (String s1:s){
            if(!array.contains(s1)){
                array.add(s1);
            }
        }
        Collections.sort(array);
        System.out.println(array);
        return array;
    }


    public static void main(String[] args) {
            abc("s","a","s","d");
    }
}
