import java.util.ArrayList;
import java.util.List;

public class GameCollection implements GameIterator {
    private List<Game> games;
    private int position;

    public GameCollection() {
        games = new ArrayList<>();
        position = 0;
    }

    public void addGame(Game game) {
        games.add(game);
    }

    @Override
    public boolean hasNext() {
        return position < games.size();
    }

    @Override
    public Game next() {
        Game game = games.get(position);
        position++;
        return game;
    }
}
