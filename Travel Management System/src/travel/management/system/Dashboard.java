package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame {

    Dashboard() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        JButton addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        p2.add(addPersonalDetails);

        JButton updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 70, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        p2.add(updatePersonalDetails);

        JButton viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 120, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        p2.add(viewPersonalDetails);

        JButton deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 170, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        p2.add(deletePersonalDetails);

        JButton checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0, 220, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0, 110));
        p2.add(checkpackages);

        JButton bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 270, 300, 50);
        bookpackage.setBackground(new Color(0, 0, 102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0, 0, 0, 120));
        p2.add(bookpackage);

        JButton viewpackage = new JButton("View Package");
        viewpackage.setBounds(0, 320, 300, 50);
        viewpackage.setBackground(new Color(0, 0, 102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0, 0, 0, 120));
        p2.add(viewpackage);

        JButton viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 370, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 130));
        p2.add(viewhotels);

        JButton bookhotel = new JButton("Book Hotels");
        bookhotel.setBounds(0, 420, 300, 50);
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0, 0, 0, 140));
        p2.add(bookhotel);

        JButton viewbookedhotel = new JButton("View Booked Hotels");
        viewbookedhotel.setBounds(0, 470, 300, 50);
        viewbookedhotel.setBackground(new Color(0, 0, 102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotel.setMargin(new Insets(0, 0, 0, 70));
        p2.add(viewbookedhotel);

        JButton destinations = new JButton("Destinations");
        destinations.setBounds(0, 520, 300, 50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        p2.add(destinations);

        JButton payments = new JButton("Payments");
        payments.setBounds(0, 570, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 155));
        p2.add(payments);

        JButton calculator = new JButton("Calculator");
        calculator.setBounds(0, 620, 300, 50);
        calculator.setBackground(new Color(0, 0, 102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        p2.add(calculator);

        JButton about = new JButton("About");
        about.setBounds(0, 670, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/dashboard.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Travel And Tourism Management System");
        text.setBounds(500, 70, 1000, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 50));
        image.add(text);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
