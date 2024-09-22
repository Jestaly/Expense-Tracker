package App;

import java.util.*;

public class ExpenseTracker {

    Scanner scanner = new Scanner(System.in);

    // HARD CODED YUNG 10, TO BE CHANGED SOON
    private int counter = 1;
    private int[] year;
    private int[] month;
    private int[] day;
    private String[] description;
    private double[] amount;

    public ExpenseTracker() {
    }

    // ADD EXPENSE FUNCTION
    public void addExpense() {

        System.out.println("Adding Expense.");
        // String choice_2 = "";

        // year = new int[counter];
        // month = new int[counter];
        // day = new int[counter];
        // description = new String[counter];
        // amount = new double[counter];
        for (int i = 0; i < counter; i++) {
            System.out.println("Expense " + (counter) + ":");
            System.out.print("Year: ");
            year[counter - 1] = scanner.nextInt();
            System.out.print("Month: ");
            month[counter - 1] = scanner.nextInt();
            System.out.print("Day: ");
            day[counter - 1] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Description: ");
            description[counter - 1] = scanner.nextLine();
            System.out.print("Amount: ");
            amount[counter - 1] = scanner.nextDouble();
            counter++;
        }

        System.out.println(year[0] + " " + month[0] + " " + day[0] + " " + description[0] + " " + amount[0]);

        // System.out.println("Would you like to add another Expense? [Y/N]: ");
        // choice_2 = scanner.nextLine();

        // if (choice_2.equals("Y")) {
        // System.out.println("Adding another Expense.");
        // addExpense();
        // } else if (choice_2.equals("N")) {
        // System.out.println(year[0] + " " + month[0] + " " + day[0] + " " +
        // description[0] + " " + amount[0]);
        // System.out.println("Going back to Main Menu.");
        // }

    }

    // DELETE EXPENSE FUNCTION
    public void deleteExpense() {
        System.out.println("deleting expense.");
    }

    // VIEW LIST OF EXPENSE FUNCTION
    public void viewExpenseList() {
        System.out.println("viewing expense list.");
        System.out.println();
        for (int i = 0; i < counter; i++) {
            System.out.println(year[i] + " " + month[i] + " " + day[i] + " " + description[i] + " " + amount[i]);
        }

    }

    // VIEW TOTAL EXPENSES FUNCTION
    public void viewTotalExpense() {
        System.out.println("viewing total expense.");
    }

    // VIEW SPECIFIC MONTH EXPENSES FUNCTION
    public void viewMonthExpense() {
        System.out.println("viewing month expense.");
    }

    // ---------------------------------------------------

}
