
// Subclass that extends the abstract Train class
class ExpressTrain extends Train {
    // Constructor calls the parent class constructor using super
     ExpressTrain(int trainNumber,String trainName, String source, String destination, int seatsAvailable)
     {
        // super class to call parents functionality to child class
        super(trainNumber, trainName, source, destination, seatsAvailable);
     }

    // abstract method to display train details
    //@Override
    public void displayDetails() {
        System.out.println("Train Number: " + getTrainNumber());
        System.out.println("Train Name: " + getTrainName());
        System.out.println("Route: " + getSource() + " to " + getDestination());
        System.out.println("Available Seats: " + getSeatsAvailable());
    }
}
