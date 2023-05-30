public class GameApp {
    public static void main(String[] args) {
        GameCollection collection = new GameCollection();
        collection.addGame(new Game("Super Mario Bros."));
        collection.addGame(new Game("The Last of Us Part II"));
        collection.addGame(new Game("Resident Evil 4 Remake"));

        GameIterator iterator = collection;

        while (iterator.hasNext()) {
            Game game = iterator.next();
            System.out.println(game.getName());
        }
    }
}
