package App;

import java.util.*;

public class ExpenseTracker {

    Scanner scanner = new Scanner(System.in);

    // HARD CODED YUNG 10, TO BE CHANGED SOON
    private int[] year = new int[10];
    private int[] month = new int[10];
    private int[] day = new int[10];
    private String[] description = new String[10];
    private double[] amount = new double[10];

    public ExpenseTracker() {
    }

    public void addExpense() {
        System.out.println("Adding Expense.");
        int counter = 0;
        String choice_2 = "";
        for (int i = counter; i < 10; i++) {

            System.out.print("Year: ");
            year[i] = scanner.nextInt();
            System.out.print("Month: ");
            month[i] = scanner.nextInt();
            System.out.print("Day: ");
            day[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Description: ");
            description[i] = scanner.nextLine();
            System.out.print("Amount: ");
            amount[i] = scanner.nextDouble();
            System.out.println("Would you like to add another Expense? [Y/N]: ");
            if (choice_2.equals("Y")) {
                System.out.println("Adding another Expense.");
                continue;
            } else if (choice_2.equals("N")) {
                System.out.println("Going back to Main Menu.");
                break;
            }
            counter++;
        }

    }

    public void deleteExpense() {
        System.out.println("deleting expense.");
    }

    public void viewExpenseList() {
        System.out.println("viewing expense list.");
        System.out.println();
        System.out.println(year + " " + month + " " + day + " " + description + " " + amount);
    }

    public void viewTotalExpense() {
        System.out.println("viewing total expense.");
    }

    public void viewMonthExpense() {
        System.out.println("viewing month expense.");
    }

    // ---------------------------------------------------

}
