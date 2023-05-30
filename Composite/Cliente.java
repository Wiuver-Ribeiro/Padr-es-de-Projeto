public class Cliente {
    private String id;
    private String nivelAssinatura;

    public Cliente(String id, String nivelAssinatura) {
        this.id = id;
        this.nivelAssinatura = nivelAssinatura;
    }

    public String getId() {
        return id;
    }

    public String getNivelAssinatura() {
        return nivelAssinatura;
    }
}
