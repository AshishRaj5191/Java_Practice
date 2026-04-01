package lab_assignment_04.unit1.task12;

public class StudentDataCleaner {

    public static String cleanName(String input) {

        input = input.trim();

        input = input.replaceAll("\\s+", " ");

        input = input.toLowerCase();

        StringBuilder result = new StringBuilder();

        String[] words = input.split(" ");

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String messy = " suMan kUmAr   daS ";

        String clean = cleanName(messy);

        System.out.println("Cleaned Name: " + clean);
    }
}