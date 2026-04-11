import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            showMenu();
            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter task: ");
                input.nextLine(); // clear buffer
                String task = input.nextLine();
                tasks.add(task);
                System.out.println("Task added: " + task);
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available.");
                } else {
                    System.out.println("\n=== YOUR TASKS ===");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to delete.");
                } else {
                    System.out.println("\n=== YOUR TASKS ===");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }

                    System.out.print("Enter task number to delete (0 to cancel): ");
                    int index = input.nextInt();
                    input.nextLine(); // clear buffer

                    if (index == 0) {
                        System.out.println("Cancelled.");
                    } else if (index >= 1 && index <= tasks.size()) {
                        String removed = tasks.remove(index - 1);
                        System.out.println("Deleted: " + removed);
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option");
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n=== TASK MANAGER ===");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Task");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
}