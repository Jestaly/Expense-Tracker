package App;

import java.util.*;

public class ExpenseTracker {

    Scanner scanner = new Scanner(System.in);
    String month;

    public ExpenseTracker() {
    }

    public void addExpense() {
        System.out.println("adding expense.");
        System.out.print("Month: ");
        month = scanner.nextLine();
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
