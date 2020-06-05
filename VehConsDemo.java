// Add a constructor

class VehicleC {
    int passengers;
    int fuelcap;
    int mpg;

    // This is a constructor for Vehicle.
    VehicleC(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

public class VehConsDemo {
    public static void main(String[] args) {

        // construct complete vehicles
        VehicleC minivan = new VehicleC(7,16, 21);
        VehicleC sportscar = new VehicleC(2,14,12);
        double gallons;
        int dist = 252;

//        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs "
                            + minivan.fuelneeded(dist) + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs "
                            + gallons + " gallons of fuel.");
    }
}
// Ended at the beginning of The This Keyword
