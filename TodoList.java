import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> tasks;
    private Scanner scanner;

    public TodoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = getChoice();
            handleChoice(choice);
        }
    }

    private void showMenu() {
        System.out.println("-");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Task");
        System.out.println("4. Exit");
    }

    private int getChoice() {
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                viewTasks();
                break;
            case 3:
                deleteTask();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void addTask() {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    private void viewTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private void deleteTask() {
        viewTasks();
        System.out.print("Enter task number to delete: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
