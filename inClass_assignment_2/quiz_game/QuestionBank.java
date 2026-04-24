package inClass_assignment_2.quiz_game;

import java.util.*;

public class QuestionBank {

    public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();

        list.add(new Question(
                "Capital of India?",
                new String[] { "A. Delhi", "B. Mumbai", "C. Kolkata", "D. Chennai" },
                'A'));

        list.add(new Question(
                "2 + 2 = ?",
                new String[] { "A. 3", "B. 4", "C. 5", "D. 6" },
                'B'));
        list.add(new Question(
                "Java me main method ka return type kya hota hai?",
                new String[] { "A. int", "B. void", "C. String", "D. char" },
                'B'));

        list.add(new Question(
                "Java me array indexing kaha se start hoti hai?",
                new String[] { "A. 0", "B. 1", "C. -1", "D. 10" },
                'A'));

        list.add(new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[] { "A. implement", "B. extends", "C. inherits", "D. super" },
                'B'));

        list.add(new Question(
                "Which of these is not a primitive data type in Java?",
                new String[] { "A. int", "B. float", "C. String", "D. boolean" },
                'C'));

        list.add(new Question(
                "Which loop is guaranteed to execute at least once?",
                new String[] { "A. for loop", "B. while loop", "C. do-while loop", "D. none" },
                'C'));

        list.add(new Question(
                "Which symbol is used for single-line comments in Java?",
                new String[] { "A. //", "B. /* */", "C. #", "D. <!-- -->" },
                'A'));

        list.add(new Question(
                "Which method is used to print output in Java?",
                new String[] { "A. print()", "B. echo()", "C. System.out.println()", "D. write()" },
                'C'));

        list.add(new Question(
                "Which data structure uses FIFO?",
                new String[] { "A. Stack", "B. Queue", "C. Tree", "D. Graph" },
                'B'));

        list.add(new Question(
                "Which operator is used for comparison?",
                new String[] { "A. =", "B. ==", "C. !=", "D. Both B and C" },
                'D'));

        list.add(new Question(
                "Which of these is used to handle exceptions?",
                new String[] { "A. try-catch", "B. if-else", "C. for loop", "D. switch" },
                'A'));

        Collections.shuffle(list);
        return list;
    }
}