public class FlightReservationFacade {

    private final FlightReservationSystem sistemaReservaVoo;

    public FlightReservationFacade() {
        sistemaReservaVoo = new FlightReservationSystem();
    }

    public void reservarVoo() {
        sistemaReservaVoo.reservarVoo();
    }
}
