package VideoSource.Lesson10;

import VideoSource.HomeWork.Lesson8_HomeWork;
import VideoSource.Lesson9.*;
import VideoSource.Lesson8.*;
import VideoSource.Lesson9.Car;

/**
 * @author Viktor
 * @version 1.1
 * @since 1.0
 * This is Main class,here I will write my code
 */
public class A {
    /**
     * @param args comand line values
     */
    public static void main(String[] args) {
        /**
         * This is import package Lesson8 class Car
         * this is some description with some link{@link VideoSource.Lesson9.Car}
         * @see VideoSource.Lesson9.Car
         */

        VideoSource.Lesson8.Car c1 = new VideoSource.Lesson8.Car();
    }

    /**
     * This is field will return i
     *
     * @param i some int value
     * @param s some other String value
     * @return i from params
     * @throws RuntimeException if someting goes wrong this exception will be throw
     */
    int getMyFields(int i, String s) throws RuntimeException {
        return i;
    }

    /**
     * @deprecated please une newMethod
     */
    void oldMethod() {

    }

    void newMethod() {

    }
}
