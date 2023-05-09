public class CarRentalFacade {

    private final CarRentalSystem sistemaAluguelCarro;

    public CarRentalFacade() {
        sistemaAluguelCarro = new CarRentalSystem();
    }

    public void alugarCarro() {
        sistemaAluguelCarro.alugarCarro();
    }
}
