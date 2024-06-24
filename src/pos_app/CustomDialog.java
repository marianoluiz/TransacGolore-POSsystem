/*
 * Point of Sale System Project - Academic Assignment
 * Author/s: Mariano Luiz B. King, et al.
 *
 * This program was created as part of an academic assignment in Computer Science at Pamantasan ng Lungsod ng Maynila.
 * It is intended for educational purposes only and should not be used for commercial purposes.
 * 
 */

package pos_app;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomDialog extends JDialog {
    private int result = JOptionPane.CLOSED_OPTION;

    public CustomDialog(JFrame parent) {
        super(parent, "Logout", true);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(30, 30, 30, 30));
        JLabel messageLabel = new JLabel("Are you sure you want to log out?");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        messageLabel.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel.add(messageLabel, BorderLayout.NORTH);

        JButton yesButton = new JButton("Yes");
        yesButton.setBackground(Color.GREEN);
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = JOptionPane.YES_OPTION;
                dispose();
            }
        });
        JButton noButton = new JButton("No");
        noButton.setBackground(new Color(255, 153, 153)); 
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = JOptionPane.NO_OPTION;
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(parent);
    }

    public int showDialog() {
        setVisible(true);
        return result;
    }
}
