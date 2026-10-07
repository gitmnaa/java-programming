import java.util.ArrayList;
import java.util.List;

class Expense {
    String name;
    double amount;

    Expense(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        List<Expense> expenses = new ArrayList<>();

        expenses.add(new Expense("Food", 25000));
        expenses.add(new Expense("Transport", 15000));
        expenses.add(new Expense("Internet", 50000));

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.amount;
            System.out.println(expense.name + ": " + expense.amount);
        }

        System.out.println("Total: " + total);
    }
}
