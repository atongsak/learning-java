// Add range to Vehicle.
class Vehicle3 {
    int passengers;
    int fuelcap;
    int mpg;

    // Display the range.
    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}
public class AddMeth {
    public static void main(String args[]) {
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sports car
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range(); // display range of minivan

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range(); // display range of sportscar
    }

}
// Stopped at Returning From A Method on CH 4
