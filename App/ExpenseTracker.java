package App;

import java.util.*;

public class ExpenseTracker {

    Scanner scanner = new Scanner(System.in);

    @SuppressWarnings("unused")
    private int year;
    @SuppressWarnings("unused")
    private int month;
    @SuppressWarnings("unused")
    private int day;
    @SuppressWarnings("unused")
    private String description;
    @SuppressWarnings("unused")
    private double amount;

    public ExpenseTracker() {
    }

    public void addExpense() {
        System.out.println("adding expense.");
        System.out.print("Year: ");
        year = scanner.nextInt();
        System.out.print("Month: ");
        month = scanner.nextInt();
        System.out.print("Day: ");
        day = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Description: ");
        description = scanner.nextLine();
        System.out.print("Amount: ");
        amount = scanner.nextDouble();
    }

    public void deleteExpense() {
        System.out.println("deleting expense.");
    }

    public void viewExpenseList() {
        System.out.println("viewing expense list.");
    }

    public void viewTotalExpense() {
        System.out.println("viewing total expense.");
    }

    public void viewMonthExpense() {
        System.out.println("viewing month expense.");
    }

    // ---------------------------------------------------

}
