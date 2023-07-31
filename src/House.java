public class House {
     String address;
     int numberOfFloors;

    public House(String address, int numberOfFloors) {

        this.address = address;
        this.numberOfFloors = numberOfFloors;

        System.out.println("A House object is created at this address: " + address + " and with " + numberOfFloors + " number of floors");

    }
}
