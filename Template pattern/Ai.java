package projekt;
//Template pattern, Strategy pattern
public class Ai extends Player {
    private Strategy strategy;

    Ai(Strategy strategy){
        this.strategy = strategy;
    }
    void play(Board playground){
        this.strategy.choose_move(playground, color);
    }
}
