import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel nLabel;
  JLabel factorialLabel;

  JTextField input;
  JTextField output;

  JButton calcButton;
  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the mainPanel
    mainPanel = new JPanel();

    mainPanel.setLayout(null);

    nLabel = new JLabel("n");
    nLabel.setBounds(20, 20, 20, 20);
    factorialLabel = new JLabel("factorial(n)");
    factorialLabel.setBounds(120, 20, 80, 20);

    // initialize the input text fields
    input = new JTextField();
    output = new JTextField();

    // location and size 
    input.setBounds(50, 20, 50, 20);
    output.setBounds(210, 20, 100, 20);

    // initialize the button
    calcButton = new JButton("CALC");
    calcButton.setBounds(320, 20, 80, 20);

    calcButton.addActionListener(this);

    calcButton.setActionCommand("CALC");

    mainPanel.add(calcButton);

    mainPanel.add(input);
    mainPanel.add(output);

    mainPanel.add(nLabel);
    mainPanel.add(factorialLabel);

    frame.add(mainPanel);
  
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();


    String inputText = input.getText();
    int inputInt = Integer.parseInt(inputText);
    int product = 1;

    // create for loop and declare 
    for(int mutiply = inputInt; mutiply >= 1; mutiply--){

    } 

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
