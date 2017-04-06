import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;


public class ATM extends JFrame {

    
    //Default constructor - set header "Cash Machine"
    public ATM() {
        super("Cash Machine");
    }
    
    //Main method
    public static void main(String[] args) {
    
        //Create an object of ATMView class and use it to call method to create the GUI
        ATMView view = new ATMView();
        view.createGUI();
        
    }
    
}
