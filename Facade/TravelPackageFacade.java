public class TravelPackageFacade {

    private final PaymentSystemFacade sistemaPagamento;
    private final FlightReservationFacade reservaVoo;
    private final HotelReservationFacade reservaHotel;
    private final CarRentalFacade aluguelCarro;

    public TravelPackageFacade() {
        sistemaPagamento = new PaymentSystemFacade();
        reservaVoo = new FlightReservationFacade();
        reservaHotel = new HotelReservationFacade();
        aluguelCarro = new CarRentalFacade();
    }

    public void reservarPacote() {
        sistemaPagamento.efetuarPagamento();
        reservaVoo.reservarVoo();
        reservaHotel.reservarHotel();
        aluguelCarro.alugarCarro();
    }
}
