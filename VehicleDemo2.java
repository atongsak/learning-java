// This program creates two Vehicle objects.
class Vehicle2 {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon
}
// This class declares an object of type Vehicle.
public class VehicleDemo2 {
    public static void main(String args[]) {
        // this is the process:
        // 1) declare reference to object and
        // 2) allocate a Vehicle object
        // Vehicle2 minivan;
        // minivan = new Vehicle2();
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // compute the ranges assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers +
                            " with a range of " + range1);

        System.out.println("Sportscar can carry " + sportscar.passengers +
                            " with a range of " + range2);
    }
    // I left off at How Objects Are Created in 4 Introducing Classes, Objects, and Methods

}
