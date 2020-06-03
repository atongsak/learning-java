/*
    Add a parameterized method that computes the fuel required for a given distance.
 */

class VehicleCF {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon
    // Return the range.
    int range() {
        return mpg * fuelcap;
    }
    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

public class CompFuel {
    public static void main(String[] args) {
        VehicleCF minivan = new VehicleCF();
        VehicleCF sportscar = new VehicleCF();
        double gallons;
        int dist = 252000;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " +
                            gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " +
                gallons + " gallons of fuel.");
    }
}
// At end of Adding a Parameterized Method to Vehicle.
