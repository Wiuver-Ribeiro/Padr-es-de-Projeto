public class VideoPlatformExample {
    public static void main(String[] args) {
        // Create the video platform
        VideoPlatform platform = new VideoPlatform();

        // Create and register users as observers
        User user1 = new User("Wiuver Ribeiro");
        User user2 = new User("Lara Kamilly");
        User user3 = new User("Pedro Sergio");
        User user4 = new User("Vlastemuller Paiva");
        User user5 = new User("Cleiton Antonio");

        platform.registerObserver(user1);
        platform.registerObserver(user2);
        platform.registerObserver(user3);
        platform.registerObserver(user4);
        platform.registerObserver(user5);

        // Add new content to the platform and notify users
        platform.addNewContent("Novo filme disponível: As melhores táticas de conquistar um cliente");
        platform.addNewContent("Nova série adicionada: The Rain - Melhor Série");
        platform.addNewContent("Novo documentário: O Maiores Ataques Hackers da História");
    }
}
