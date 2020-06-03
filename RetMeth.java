// Add range to Vehicle.
class Vehicle4 {
    int passengers;
    int fuelcap;
    int mpg;

    // Return the range.
    int range() {
        return fuelcap * mpg;
    }
}

public class RetMeth {
    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportscar = new Vehicle4();

        int range1, range2;

        // assign values to field in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 25;

        // get the ranges
        // range1 = minivan.range();
        // range2 = sportscar.range();

        System.out.println("Minivan can carry " + minivan.passengers +
                " with range of " + minivan.range() + " Miles");

        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with range of " + sportscar.range() + " Miles");

        if(minivan.range() > sportscar.range()) {
            System.out.println("Minivan has greater range");
        } else {
            System.out.println("Sportscar has greater range");
        }

    }
}
