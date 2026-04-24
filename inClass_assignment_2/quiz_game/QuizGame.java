package inClass_assignment_2.quiz_game;
import java.util.*;

public class QuizGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of player " + (i + 1) + ": ");
            players[i] = new Player(sc.nextLine());
        }

        List<Question> questions = QuestionBank.getQuestions();

        // 🎮 Game Loop
        for (Question q : questions) {

            // ✅ Check: koi player bacha hai ya nahi
            boolean anyPlayerLeft = false;

            for (Player p : players) {
                if (!p.isEliminated) {
                    anyPlayerLeft = true;
                    break;
                }
            }

            // ❌ Agar sab eliminate ho gaye → game stop
            if (!anyPlayerLeft) {
                break;
            }

            System.out.println("\n--- New Question ---");

            for (Player p : players) {
                if (p.isEliminated) continue;

                System.out.println(p.name + ": " + q.getQuestion());

                for (String opt : q.getOptions()) {
                    System.out.println(opt);
                }

                char ans = sc.next().toUpperCase().charAt(0);

                switch (ans) {
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                        if (ans == q.getCorrectOption()) {
                            p.score++;
                        } else {
                            p.isEliminated = true;
                        }
                        break;

                    default:
                        p.isEliminated = true;
                }
            }
        }

        // 🔽 Sorting (Comparable use ho raha hai)
        Arrays.sort(players);

        // 🏆 Final Result
        System.out.println("\n======================");
        System.out.println("      FINAL RESULTS");
        System.out.println("======================");

        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i].name +
                    " - Score: " + players[i].score +
                    (players[i].isEliminated ? " (Eliminated)" : ""));
        }

        sc.close();
    }
}