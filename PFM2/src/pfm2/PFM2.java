package pfm2;

import java.util.Comparator;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// Transaction class representing an individual transaction
class Transaction {
    private final String description;
    private final double amount;
    private final String category;
    private final Date date;

    // Constructor to initialize a transaction
    public Transaction(String description, double amount, String category, Date date) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Getter methods for transaction attributes
    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public Date getDate() {
        return date;
    }
}

// TransactionComparator class to define the comparison logic for transactions
class TransactionComparator implements Comparator<Transaction> {
    // Comparison logic for sorting transactions by date
    @Override
    public int compare(Transaction t1, Transaction t2) {
        return t1.getDate().compareTo(t2.getDate());
    }
}

// Main class containing the main method
public class PFM2 {

    public static void main(String[] args) {
        
        // Ensure GUI operations are executed on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            // Create an instance of the main window and make it visible
            pfmWindow frame = new pfmWindow();
            frame.setVisible(true);
        });
    }
}

// Subclass of JFrame representing the main window of the application
class pfmWindow extends JFrame {

    // Constructor for the main window
    public pfmWindow() {
        setTitle(""); // Set the title of the window (replace with an actual title)
        setSize(817, 439); // Set the size of the window
        setResizable(false); // Disable window resizing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed
        setLocationRelativeTo(null); // Center the window on the screen
    }
}
