// Class to represent a Passenger
class Passenger {
    // Encapsulated passenger data
    private String passengerName;
    private Train trainBooked; // The train on which the passenger has booked a seat

    // Constructor to initialize passenger details
    Passenger(String passengerName) {
        this.passengerName = passengerName;
        this.trainBooked = null;
    }

    // Getter for passengerName
    public String getPassengerName() {
        return passengerName;
    }

    // Getter for the booked train
    public Train getTrainBooked() {
        return trainBooked;
    }

    // Method to book a seat on a train
    public void bookTrain(Train train) {
        if (train.bookSeat()) {  // If booking is successful
            this.trainBooked = train;
            System.out.println(passengerName + " booked a seat on " + train.getTrainName());
        }
    }

    // Method to cancel an existing booking
    public void cancelBooking() {
        if (this.trainBooked != null) {
            trainBooked.cancelSeat();
            System.out.println(passengerName + " cancelled the booking on " + trainBooked.getTrainName());
            trainBooked = null;
        } else {
            System.out.println(passengerName + " has no booking to cancel.");
        }
    }
}
