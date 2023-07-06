package ch01;

import javax.swing.*;

public class Dialog1 {
    public static void main(String args[])
    {
        //prompt user to enter name;
        String name = JOptionPane.showInputDialog("What is your name?");

        //create the message
        String message = String.format("Welcome, %s, to Java Programming", name);

        //display a dialog with a message
        JOptionPane.showMessageDialog(null, message);

        //prompt user for first num
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number 1"));

        //prompt user for second num
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number 2"));

        message = String.format("%d + %d = %d", num1, num2, (num1 + num2));

        //display a dialog with a message
        JOptionPane.showMessageDialog(null, message);
    }
}
