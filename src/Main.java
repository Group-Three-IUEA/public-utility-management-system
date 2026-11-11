import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Public Utility Management System - Waste Collection");
        JTabbedPane tabs = new JTabbedPane();

        tabs.addTab("Dashboard", new JPanel());

        tabs.addTab("Customer Complaints", new JPanel());
      tabs.addTab("Billing Services", new JPanel());

        frame.add(tabs, BorderLayout.CENTER);
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}