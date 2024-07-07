import java.util.Scanner;

public class madlibs {

    public static void main(String[] args) {
        try (// Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in)) {
            // Define story template with placeholders for words
            String story = "One sunny %u, I went to the %a with my %s. We saw a %t %w. It was %v! We %x all day long and had a %s time!";

            // Prompt user for different word categories
            System.out.println("Enter a noun (place): ");
            String place = scanner.nextLine();

            System.out.println("Enter a noun (building): ");
            String building = scanner.nextLine();

            System.out.println("Enter an adjective (descriptive word): ");
            String adjective = scanner.nextLine();

            System.out.println("Enter a noun (animal): ");
            String animal = scanner.nextLine();

            System.out.println("Enter another adjective (descriptive word): ");
            String anotherAdjective = scanner.nextLine();

            System.out.println("Enter a verb (past tense): ");
            String verb = scanner.nextLine();

            System.out.println("Enter an adjective (descriptive word): ");
            String finalAdjective = scanner.nextLine();

            // Replace placeholders with user-provided words
            String completedStory = story.replace("%s", place)
                    .replace("%t", building)
                    .replace("%u", adjective)
                    .replace("%a", animal)
                    .replace("%v", anotherAdjective)
                    .replace("%w", verb)
                    .replace("%x", finalAdjective);

            // Print the completed story
            System.out.println("\nYour Mad Lib Story:");
            System.out.println(completedStory);
        }
    }
}
