// Abstract class to hide common train functionality
abstract class Train {
    // Encapsulated data --> hides data using private access specifier
    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private int seatsAvailable;

    // Constructor to initialize train details
    Train(int trainNumber, String trainName, String source, String destination, int seatsAvailable) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    // Abstract method to display train details (must be implemented by subclasses)
    public abstract void displayDetails();

    // Getter methods
    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    // Method to book a seat
    public boolean bookSeat() {
        if (seatsAvailable > 0) {
            seatsAvailable--; // Reduce available seats by one
            System.out.println("Seat booked successfully on " + trainName);
            return true;
        } else {
            System.out.println("No seats available on " + trainName);
            return false;
        }
    }

    // Method to cancel a seat booking
    public void cancelSeat() {
        seatsAvailable++; // Increase available seats by one
        System.out.println("Seat cancellation successful on " + trainName);
    }
}
