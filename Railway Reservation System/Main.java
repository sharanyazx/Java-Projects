public class Main {
    public static void main(String[] args) {
        // Create an ExpressTrain object (using the abstract Train class via its subclass)
        Train express = new ExpressTrain(201, "Vande Bharat", "Coimbatore", "Chennai", 5);

        // Display train details before booking
        System.out.println("---------------Train Details--------------- ");
        express.displayDetails();

        // Create a Passenger object
        Passenger passenger = new Passenger("Sharanya ");

        // Book a seat for the passenger on the train
        passenger.bookTrain(express);

        // Display updated train details after booking
        System.out.println("---------------Updated Train Details After Booking---------------");
        express.displayDetails();

        // Cancel the booking for the passenger
        passenger.cancelBooking();

        // Display train details after cancellation
        System.out.println("---------------Updated Train Details After Cancellation---------------");
        express.displayDetails();
    }
}
