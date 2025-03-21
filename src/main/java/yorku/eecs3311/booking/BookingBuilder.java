package yorku.eecs3311.booking;

public class BookingBuilder {
	
    private int bookingID;
    private String lotName;
    private int spaceID;
    private int startHour;
    private int dur;

    public BookingBuilder setBookingID(int bookingID) {
        this.bookingID = bookingID;
        return this;
    }

    public BookingBuilder setLotName(String lotName) {
        this.lotName = lotName;
        return this;
    }

    public BookingBuilder setSpaceID(int spaceID) {
        this.spaceID = spaceID;
        return this;
    }

    public BookingBuilder setStartHour(int startHour) {
        this.startHour = startHour;
        return this;
    }

    public BookingBuilder setDur(int dur) {
        this.dur = dur;
        return this;
    }

    public Booking build() {
        return new Booking(bookingID, lotName, spaceID, startHour, dur);
    }
    
}
