package travel.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class DeleteCustomer extends JFrame {
    private JPanel contentPane;
    private JLabel lIdType, lIdNumber, lName, lGender, lCountry, lAddress, lPhone, lEmail;
    private JLabel usernameLabel;

    public DeleteCustomer(String username) {
        setBounds(580, 220, 850, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        // Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/delete.png"));
        Image i3 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        JLabel l1 = new JLabel(new ImageIcon(i3));
        l1.setBounds(500, 100, 300, 300);
        contentPane.add(l1);

        JLabel lblTitle = new JLabel("DELETE CUSTOMER DETAILS");
        lblTitle.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblTitle.setBounds(118, 11, 300, 53);
        contentPane.add(lblTitle);

        JLabel lb3 = new JLabel("Username:");
        lb3.setBounds(35, 70, 200, 14);
        contentPane.add(lb3);

        usernameLabel = new JLabel(username);
        usernameLabel.setBounds(271, 70, 200, 14);
        contentPane.add(usernameLabel);

        addLabel("ID Type:", 110, lIdType = new JLabel());
        addLabel("ID Number:", 150, lIdNumber = new JLabel());
        addLabel("Name:", 190, lName = new JLabel());
        addLabel("Gender:", 230, lGender = new JLabel());
        addLabel("Country:", 270, lCountry = new JLabel());
        addLabel("Permanent Address:", 310, lAddress = new JLabel());
        addLabel("Phone:", 350, lPhone = new JLabel());
        addLabel("Email:", 390, lEmail = new JLabel());

        loadCustomerInfo(username);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(100, 430, 120, 30);
        btnDelete.setBackground(Color.BLACK);
        btnDelete.setForeground(Color.WHITE);
        contentPane.add(btnDelete);
        btnDelete.addActionListener(e -> deleteCustomer(username));

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(260, 430, 120, 30);
        btnBack.setBackground(Color.BLACK);
        btnBack.setForeground(Color.WHITE);
        contentPane.add(btnBack);
        btnBack.addActionListener(e -> setVisible(false));

        getContentPane().setBackground(Color.WHITE);
    }

    private void addLabel(String labelText, int y, JLabel label) {
        JLabel l = new JLabel(labelText);
        l.setBounds(35, y, 200, 14);
        contentPane.add(l);
        label.setBounds(271, y, 400, 14);
        contentPane.add(label);
    }

    private void loadCustomerInfo(String username) {
        try {
            DBConnection c = new DBConnection();
            ResultSet rs = c.s.executeQuery("SELECT * FROM customer WHERE username = '" + username + "'");

            if (rs.next()) {
                lIdType.setText(rs.getString("id_type"));
                lIdNumber.setText(rs.getString("id_number"));
                lName.setText(rs.getString("name"));
                lGender.setText(rs.getString("gender"));
                lCountry.setText(rs.getString("country"));
                lAddress.setText(rs.getString("address"));
                lPhone.setText(rs.getString("phone"));
                lEmail.setText(rs.getString("email"));
            } else {
                clearLabels();
                JOptionPane.showMessageDialog(null, "No customer data found.");
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }

    private void clearLabels() {
        lIdType.setText("");
        lIdNumber.setText("");
        lName.setText("");
        lGender.setText("");
        lCountry.setText("");
        lAddress.setText("");
        lPhone.setText("");
        lEmail.setText("");
    }

    private void deleteCustomer(String username) {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete customer '" + username + "'?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                DBConnection c = new DBConnection();
                c.s.executeUpdate("DELETE FROM account WHERE username = '" + username + "'");
                c.s.executeUpdate("DELETE FROM customer WHERE username = '" + username + "'");
                c.s.executeUpdate("DELETE FROM bookhotel WHERE username = '" + username + "'");
                c.s.executeUpdate("DELETE FROM bookpackage WHERE username = '" + username + "'");

                JOptionPane.showMessageDialog(null, "Customer deleted successfully.");
                clearLabels();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error deleting customer: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new DeleteCustomer("tahmid_alvee").setVisible(true); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
