public class HotelReservationFacade {

    private final HotelReservationSystem sistemaReservaHotel;

    public HotelReservationFacade() {
        sistemaReservaHotel = new HotelReservationSystem();
    }

    public void reservarHotel() {
        sistemaReservaHotel.reservarHotel();
    }
}
