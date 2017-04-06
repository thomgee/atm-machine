import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

//Following MVC architecture, this is the View of the ATM
public class ATMView extends JFrame {


        //Create JFrame object
        JFrame appFrame = new JFrame();
        
        //Create JPanel objects
        JPanel instructions = new JPanel();
        JPanel balancePanel = new JPanel();
        JPanel input = new JPanel();
        JPanel keyPad = new JPanel();
        
        //Create JButton objects
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton enter = new JButton("Enter");
        JButton clear = new JButton("Clear");
        JButton withdraw5 = new JButton("Withdraw £5");
        JButton withdraw10 = new JButton("Withdraw £10");
        JButton withdraw20 = new JButton("Withdraw £20");
        JButton withdraw50 = new JButton("Withdraw £50");
        JButton withdrawX = new JButton("Withdraw £X");
        JButton deposit = new JButton("Deposit");
        JButton quit = new JButton("Quit");
        
        //Create JLabel objects
        JLabel instr = new JLabel("Enter your PIN and press enter");
        JLabel balance = new JLabel();
        
        //Create JTextArea object
        JTextArea PIN = new JTextArea(10,80);
        
        //Method to create GUI using declared objects
        public void createGUI(){
            
            //Sets up the frame
            appFrame.setSize(1000,1000);
            appFrame.setVisible(true);
            appFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            appFrame.setLocationRelativeTo(null);
            appFrame.setLayout(new GridLayout(4,5));
            
            //Sets up instructions panel
            instructions.setBorder(new TitledBorder("Instructions"));
            instructions.setSize(50,50);
            
            //Sets up balance panel
            balancePanel.setBorder(new TitledBorder("Balance"));
            balancePanel.setSize(50,50);
            
            //Sets up input panel
            input.setBorder(new TitledBorder("Input"));
            input.setSize(100,100);
            
            //Sets up keypad panel
            keyPad.setBorder(new TitledBorder("Keypad"));
            keyPad.setSize(200,200);
            keyPad.setLayout(new GridLayout(4,4));
            
            //Sets up jbuttons, size doesn't matter as grid layout
            one.setSize(10,10);
            two.setSize(10,10);
            three.setSize(10,10);
            four.setSize(10,10);
            five.setSize(10,10);
            six.setSize(10,10);
            seven.setSize(10,10);
            eight.setSize(10,10);
            nine.setSize(10,10);
            zero.setSize(10,10);
            enter.setSize(10,10);
            clear.setSize(10,10);
            withdraw5.setSize(10,10);
            withdraw10.setSize(10,10);
            withdraw20.setSize(10,10);
            withdraw50.setSize(10,10);
            withdrawX.setSize(10,10);
            deposit.setSize(10,10);
            quit.setSize(10,10);
            
            //Options disabled until login
            withdraw5.setEnabled(false);
            withdraw10.setEnabled(false);
            withdraw20.setEnabled(false);
            withdraw50.setEnabled(false);
            withdrawX.setEnabled(false);
            deposit.setEnabled(false);
            quit.setEnabled(false);
            
            //Add action listener to buttons, to be used in controller subclass
            ATMController listener = new ATMController();
            one.addActionListener(listener);
            two.addActionListener(listener);
            three.addActionListener(listener);
            four.addActionListener(listener);
            five.addActionListener(listener);
            six.addActionListener(listener);
            seven.addActionListener(listener);
            eight.addActionListener(listener);
            nine.addActionListener(listener);
            zero.addActionListener(listener);
            enter.addActionListener(listener);
            clear.addActionListener(listener);
            withdraw5.addActionListener(listener);
            withdraw10.addActionListener(listener);
            withdraw20.addActionListener(listener);
            withdraw50.addActionListener(listener);
            withdrawX.addActionListener(listener);
            deposit.addActionListener(listener);
            quit.addActionListener(listener);
            
            //Adds buttons to keypad panel
            keyPad.add(one);
            keyPad.add(two);
            keyPad.add(three);
            keyPad.add(four);
            keyPad.add(five);
            keyPad.add(six);
            keyPad.add(seven);
            keyPad.add(eight);
            keyPad.add(nine);
            keyPad.add(clear);
            keyPad.add(zero);
            keyPad.add(enter);
            
            //Adds instruction label to instruction panel
            instructions.add(instr);
            
            //Adds balance label to balance panel
            balancePanel.add(balance);
            
            //Adds the option buttons and PIN text area to input panel
            input.add(PIN);
            input.add(withdraw5);
            input.add(withdraw10);
            input.add(withdraw20);
            input.add(withdraw50);
            input.add(withdrawX);
            input.add(deposit);
            input.add(quit);
            
            //Adds all panels to JFrame
            appFrame.add(instructions);
            appFrame.add(balancePanel);
            appFrame.add(input);
            appFrame.add(keyPad);

        }
        
        
        //Controller as a subclass of View
        public class ATMController implements ActionListener{
        
            //Create object of ATMViewDeposit to use to subtract withdraw amount from balance
            ATMViewWithdraw withdrawView = new ATMViewWithdraw();
            
            //Create object of ATMViewDeposit to use to add deposit amount to balance
            ATMViewDeposit depositView = new ATMViewDeposit();
        
            //Declare user's bank balance
            private int balanceSum;
            
            //Setter method
            public void setBalance(int balanceSum, int d, int w){
                depositView.depositAmount = d;
                withdrawView.withdrawAmount = w;
                
                this.balanceSum = balanceSum + depositView.depositAmount - withdrawView.withdrawAmount;
            }
            
            //Getter method
            public int getBalance(){
                return balanceSum;
            }
            
            //Method overwritten, implements interface
            @Override
             
            //Method which controlls the login phase, checks PIN is correct
            public void actionPerformed(ActionEvent e) {
                
                //Logs button presses in terminal
                if (e.getSource() == one){
                    System.out.println("1 was pressed");
                    PIN.setText(PIN.getText() + "1");
                    
                } else if (e.getSource() == two){
                    System.out.println("2 was pressed");
                    PIN.setText(PIN.getText() + "2");
                    
                } else if (e.getSource() == three){
                    System.out.println("3 was pressed");
                    PIN.setText(PIN.getText() + "3");
                    
                } else if (e.getSource() == four){
                    System.out.println("4 was pressed");
                    PIN.setText(PIN.getText() + "4");
                    
                } else if (e.getSource() == five){
                    System.out.println("5 was pressed");
                    PIN.setText(PIN.getText() + "5");
                    
                } else if (e.getSource() == six){
                    System.out.println("6 was pressed");
                    PIN.setText(PIN.getText() + "6");
                    
                } else if (e.getSource() == seven){
                    System.out.println("7 was pressed");
                    PIN.setText(PIN.getText() + "7");
                    
                } else if (e.getSource() == eight){
                    System.out.println("8 was pressed");
                    PIN.setText(PIN.getText() + "8");
                    
                } else if (e.getSource() == nine){
                    System.out.println("9 was pressed");
                    PIN.setText(PIN.getText() + "9");
                    
                } else if (e.getSource() == zero){
                    System.out.println("0 was pressed");
                    PIN.setText(PIN.getText() + "0");
                
                //PIN check kicks in when enter is pressed
                } else if (e.getSource() == enter){
                    System.out.println("enter was pressed");
                    System.out.println(PIN.getText());
                    
                    //If string in JTextArea = "1234"
                    if ("1234".equals(PIN.getText())){
                        
                        //Notifies user that PIN is correct
                        instr.setText("PIN Correct - Please choose one of the options below"); 
                        
                        balanceSum = 10;
                        
                        //Options are enabled
                        withdraw5.setEnabled(true);
                        withdraw10.setEnabled(true);
                        withdraw20.setEnabled(true);
                        withdraw50.setEnabled(true);
                        withdrawX.setEnabled(true);
                        deposit.setEnabled(true);
                        quit.setEnabled(true);
                        
                        //Balance updated
                        balance.setText("£" + getBalance());
                        
                    //Else notify user PIN incorrect
                    } else instr.setText("Invalid PIN - Please try again");
                    
                    //Clear contents of JTextArea
                    PIN.setText("");
                    
                //Clear contents of JTextArea
                } else if (e.getSource() == clear){
                    System.out.println("clear was pressed");
                    PIN.setText("");
                    
                //Withdraw £5
                } else if (e.getSource() == withdraw5){
                    System.out.println("withdraw 5 was pressed");
                    
                    //Makes sure balance is more than £5
                    if (balanceSum >= 5){
                        balanceSum = balanceSum - 5;
                        
                        //Update the balance label
                        balance.setText("£" + getBalance());
                        
                        //Notify user £5 withdrawn
                        instr.setText("£5 withdrawn");
                        
                    //Else notify user Insufficient funds
                    } else {
                        instr.setText("Insufficient funds - please choose another option");
                    }
                    
                //Same as before but for £10
                } else if (e.getSource() == withdraw10){
                    System.out.println("withdraw 10 was pressed");
                    if (balanceSum >= 10){
                        balanceSum = balanceSum - 10;
                        balance.setText("£" + getBalance());
                        instr.setText("£10 withdrawn");
                    } else {
                        instr.setText("Insufficient funds - please choose another option");
                    }
                  
                //Same as before but for £20
                } else if (e.getSource() == withdraw20){
                    System.out.println("withdraw 20 was pressed");
                    if (balanceSum >= 20){
                        balanceSum = balanceSum - 20;
                        balance.setText("£" + getBalance());
                        instr.setText("£20 withdrawn");
                    } else {
                        instr.setText("Insufficient funds - please choose another option");
                    }
                    
                //Same as before but for £50
                } else if (e.getSource() == withdraw50){
                    System.out.println("withdraw 50 was pressed");
                    if (balanceSum >= 50){
                        balanceSum = balanceSum - 50;
                        balance.setText("£" + getBalance());
                        instr.setText("£50 withdrawn");
                    } else {
                        instr.setText("Insufficient funds - please choose another option");
                    }
                    
                //On button press, takes you to a different JFrame
                } else if (e.getSource() == withdrawX){
                    System.out.println("withdraw X was pressed");
                    
                    //Closes current JFrame
                    appFrame.dispose();
                    
                    //Create Withdraw View GUI
                    withdrawView.createGUIWithdraw();
                    withdrawView.setVisible(true);
                    
                //Same as withdrawX but for Deposit View
                } else if (e.getSource() == deposit){
                    System.out.println("deposit was pressed");
                    appFrame.dispose();
                    depositView.createGUIDeposit();
                    depositView.setVisible(true);
                    
                //Pressing quit logs the user out
                } else if (e.getSource() == quit){
                    System.out.println("quit was pressed");
                    
                    //Prompted to enter PIN
                    instr.setText("Enter your pin and press enter");
                    
                    //Disables options
                    withdraw5.setEnabled(false);
                    withdraw10.setEnabled(false);
                    withdraw20.setEnabled(false);
                    withdraw50.setEnabled(false);
                    withdrawX.setEnabled(false);
                    deposit.setEnabled(false);
                    quit.setEnabled(false);
                    
                    //Balance no long visible
                    balance.setText("");
                }
        }
    }
        
}
