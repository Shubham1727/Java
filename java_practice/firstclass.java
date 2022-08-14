class vehicledemo {
    int fuelcap, kmp, avg;

    void range() {

        System.out.println("Range = " + kmp * avg);
    }
}
class firstclass {
       public static void main(String args[]) {

        vehicledemo car = new vehicledemo();
        car.kmp = 25;
        car.avg = 21;
        car.range();        
    }

    
}
