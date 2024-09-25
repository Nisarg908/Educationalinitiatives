import manager.ScheduleManager;
import model.TaskFactory;
import java.util.Scanner;

public class AstronautScheduleApp {

    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        TaskFactory factory = new TaskFactory();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nAstronaut Schedule Organizer");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter start time (HH:mm):");
                    String startTime = scanner.nextLine();
                    System.out.println("Enter end time (HH:mm):");
                    String endTime = scanner.nextLine();
                    System.out.println("Enter priority (Low/Medium/High):");
                    String priority = scanner.nextLine();
                    try {
                        manager.addTask(factory.createTask(description, startTime, endTime, priority));
                        System.out.println("Task added successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    System.out.println("Enter task description to remove:");
                    String removeDescription = scanner.nextLine();
                    try {
                        manager.removeTask(removeDescription);
                        System.out.println("Task removed successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    manager.viewTasks();
                    break;
                case "4":
                    System.out.println("Enter task description to mark as completed:");
                    String completeDescription = scanner.nextLine();
                    try {
                        manager.markTaskAsCompleted(completeDescription);
                        System.out.println("Task marked as completed.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
        System.out.println("Application closed.");
    }
}
