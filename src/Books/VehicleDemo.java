package Books;

class Vehicle {
    int passengers;//количество пассажиров
    int fuelcap;//емкость топливного бака
    int mpg;//потребление топлива в милях на галон
Vehicle(int p,int f,int m){
    passengers=p;
    fuelcap=f;
    mpg=m;
}
    int range() {
        return fuelcap * mpg;
    }

    double fuelnided(int miles) {
        return (double) miles / mpg;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);



        int dist = 252;
        double gallons;

        int range1 = minivan.range();
//        System.out.println("Минивен с "+minivan.passengers+" пассажирами проедет "+ minivan.range());
        System.out.println("Минивен с " + minivan.passengers + " пассажирами проедет " + range1);
        gallons=minivan.fuelnided(dist);
        System.out.println("Для преодаления "+dist+" миль потребуется "+gallons+" галонов топлива");
    }
}
