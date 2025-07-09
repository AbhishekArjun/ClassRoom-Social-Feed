import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Feed classroomFeed = new Feed();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("===== Classroom Social Feed =====");

        do {
            System.out.println("\n1. Add Post");
            System.out.println("2. View Feed");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter your message: ");
                    String content = scanner.nextLine();
                    classroomFeed.addPost(author, content);
                    System.out.println("✅ Post added!");
                    break;

                case 2:
                    System.out.println("\n===== Classroom Feed =====");
                    classroomFeed.displayFeed();
                    break;

                case 3:
                    System.out.println("👋 Exiting... Thank you!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
