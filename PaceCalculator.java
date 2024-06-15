import javax.swing.*;
import java.awt.event.*;

public class PaceCalculator extends JFrame implements ActionListener {
    private JLabel distanceLabel, timeLabel, paceLabel;
    private JTextField distanceField, hoursField, minutesField, secondsField;
    private JButton calculateButton;

    public PaceCalculator() {
        // GUI initialization
        setTitle("Pace Calculator");
        setSize(400, 250); // Increased window size from 350x200 to 400x250
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Label and text field for distance
        distanceLabel = new JLabel("Distance (km):");
        distanceLabel.setBounds(20, 20, 100, 20);
        add(distanceLabel);

        distanceField = new JTextField();
        distanceField.setBounds(130, 20, 100, 20);
        distanceField.setHorizontalAlignment(JTextField.CENTER);
        distanceField.setText("0.0"); // Placeholder
        add(distanceField);

        // Label and text fields for time
        timeLabel = new JLabel("Time (hh:mm:ss):");
        timeLabel.setBounds(20, 50, 100, 20);
        add(timeLabel);

        hoursField = new JTextField();
        hoursField.setBounds(130, 50, 30, 20);
        hoursField.setHorizontalAlignment(JTextField.CENTER);
        hoursField.setText("00"); // Placeholder
        add(hoursField);

        minutesField = new JTextField();
        minutesField.setBounds(170, 50, 30, 20);
        minutesField.setHorizontalAlignment(JTextField.CENTER);
        minutesField.setText("00"); // Placeholder
        add(minutesField);

        secondsField = new JTextField();
        secondsField.setBounds(210, 50, 30, 20);
        secondsField.setHorizontalAlignment(JTextField.CENTER);
        secondsField.setText("00"); // Placeholder
        add(secondsField);

        // Label for pace
        paceLabel = new JLabel("Pace:");
        paceLabel.setBounds(20, 80, 300, 20);
        add(paceLabel);

        // Button for calculation
        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(120, 110, 100, 30);
        calculateButton.addActionListener(this);
        add(calculateButton);
    }

    // ActionListener for the Calculate button
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                // Retrieve input values
                double distance = Double.parseDouble(distanceField.getText());
                int hours = Integer.parseInt(hoursField.getText());
                int minutes = Integer.parseInt(minutesField.getText());
                int seconds = Integer.parseInt(secondsField.getText());

                // Calculate total time in minutes
                double totalTime = hours * 60 + minutes + seconds / 60.0;
                // Calculate pace
                double pace = totalTime / distance;

                // Extract minutes and seconds of pace
                int paceMinutes = (int) pace;
                double paceSeconds = (pace - paceMinutes) * 60;

                // Display result
                paceLabel.setText(String.format("Pace: %d:%02d min/km", paceMinutes, (int) paceSeconds));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter numeric values.");
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(this, "Error: Division by zero.");
            }
        }
    }

    // Main method to start the program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PaceCalculator paceCalculator = new PaceCalculator();
            paceCalculator.setVisible(true);
        });
    }
}