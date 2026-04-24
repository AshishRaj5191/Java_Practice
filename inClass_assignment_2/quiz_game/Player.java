package inClass_assignment_2.quiz_game;

public class Player implements Comparable<Player> {
    String name;
    int score = 0;
    boolean isEliminated = false;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Player other) {
        if (other.score == this.score) {
            return this.name.compareTo(other.name);
        }
        return other.score - this.score;
    }
}