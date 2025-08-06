package travel.management.system;

import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable {

    Thread t;
    JProgressBar bar;
    String username;

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int max = bar.getMaximum();
                int value = bar.getValue();

                if (value < max) {
                    bar.setValue(bar.getValue() + 1);
                } else {
                    setVisible(false);
                    new Dashboard(username);  
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Loading(String username) {
        this.username = username;  
        t = new Thread(this);

        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(new Color(28, 27, 62));
        setLayout(null);

        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(new Color(255, 193, 7));
        text.setFont(new Font("Tahoma", Font.BOLD, 35));
        add(text);

        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading, please wait...");
        loading.setBounds(230, 130, 150, 30);
        loading.setForeground(new Color(255, 87, 34));
        loading.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(loading);

        JLabel lblusername = new JLabel("Welcome " + username);
        lblusername.setBounds(20, 310, 400, 40);
        lblusername.setForeground(new Color(3, 169, 244));
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lblusername);

        t.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Loading("");  
    }
}
