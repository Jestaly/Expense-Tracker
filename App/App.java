package App;

import java.util.*;
import App.CommonConstant;

public class App {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker expenseTracker = new ExpenseTracker();

        boolean loop = true;
        System.out.println("---ACTIONS AVAILABLE---");
        System.out.println("Add Expense (A)");
        System.out.println("Delete Expense (D)");
        System.out.println("View Expense List (L)");
        System.out.println("View Total Expense (T)");
        System.out.println("View Month's Expense (M)");

        while (loop == true) {
            System.out.print("Action: ");
            String choice = scanner.nextLine();
            if (choice.toUpperCase().equals(CommonConstant.CHOICE[0])) {
                loop = false;
                expenseTracker.addExpense();
            } else if (choice.toUpperCase().equals(CommonConstant.CHOICE[1])) {
                loop = false;
                expenseTracker.deleteExpense();
            } else if (choice.toUpperCase().equals(CommonConstant.CHOICE[2])) {
                loop = false;
                expenseTracker.viewExpenseList();
            } else if (choice.toUpperCase().equals(CommonConstant.CHOICE[3])) {
                loop = false;
                expenseTracker.viewTotalExpense();
            } else if (choice.toUpperCase().equals(CommonConstant.CHOICE[4])) {
                loop = false;
                expenseTracker.viewMonthExpense();
            } else {
                continue;
            }
        }

        scanner.close();
        // REQUIREMENTS

        // Application should run from the command line and should have the following
        // features:

        // Users can add an expense with a description and amount.
        // Users can update an expense.
        // Users can delete an expense.
        // Users can view all expenses.
        // Users can view a summary of all expenses.
        // Users can view a summary of expenses for a specific month (of current year).

        // Here are some additional features that you can add to the application:

        // Add expense categories and allow users to filter expenses by category.
        // Allow users to set a budget for each month and show a warning when the user
        // exceeds the budget.
        // Allow users to export expenses to a CSV file.

        // IMPLEMENTATION

        // You can implement the application using any programming language of your
        // choice. Here are some suggestions:

        // Use any programming language for any available module for parsing command
        // arguments (e.g. python with the argparse, node.js with commander etc).
        // Use a simple text file to store the expenses data. You can use JSON, CSV, or
        // any other format to store the data.
        // Add error handling to handle invalid inputs and edge cases (e.g. negative
        // amounts, non-existent expense IDs, etc).
        // Use functions to modularize the code and make it easier to test and maintain.
    }
}
