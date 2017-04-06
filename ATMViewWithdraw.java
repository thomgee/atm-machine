import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

//This is the View for the Withdraw screen
public class ATMViewWithdraw extends JFrame {
        
        
        //Declare int for deposit amount
        int withdrawAmount;
        
        //GUI set up as per ATMView class
        JFrame appFrameWithdraw = new JFrame();
        
        JPanel instructions = new JPanel();
        JPanel balancePanel = new JPanel();
        JPanel input = new JPanel();
        JPanel keyPad = new JPanel();
        
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
        
        JLabel instr = new JLabel("Enter withdraw amount");
        JLabel balance = new JLabel();
        
        JTextArea PIN = new JTextArea(10,80);
        
        
        //Create same GUI as ATMView class
        public void createGUIWithdraw(){
        
            appFrameWithdraw.setSize(1000,1000);
            appFrameWithdraw.setVisible(true);
            appFrameWithdraw.setDefaultCloseOperation(EXIT_ON_CLOSE);
            appFrameWithdraw.setLocationRelativeTo(null);
            appFrameWithdraw.setLayout(new GridLayout(4,5));
        
            instructions.setBorder(new TitledBorder("Instructions"));
            instructions.setSize(50,50);
        
            balancePanel.setBorder(new TitledBorder("Balance"));
            balancePanel.setSize(50,50);
            
            input.setBorder(new TitledBorder("Input"));
            input.setSize(100,100);
            
            keyPad.setBorder(new TitledBorder("Keypad"));
            keyPad.setSize(200,200);
            keyPad.setLayout(new GridLayout(4,4));
            
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
            
            withdraw5.setEnabled(false);
            withdraw10.setEnabled(false);
            withdraw20.setEnabled(false);
            withdraw50.setEnabled(false);
            withdrawX.setEnabled(false);
            deposit.setEnabled(false);
            quit.setEnabled(true);
            
            ATMControllerWithdraw listener = new ATMControllerWithdraw();
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
            
            instructions.add(instr);
            
            balancePanel.add(balance);
            
            input.add(PIN);
            input.add(withdraw5);
            input.add(withdraw10);
            input.add(withdraw20);
            input.add(withdraw50);
            input.add(withdrawX);
            input.add(deposit);
            input.add(quit);
            
            appFrameWithdraw.add(instructions);
            appFrameWithdraw.add(balancePanel);
            appFrameWithdraw.add(input);
            appFrameWithdraw.add(keyPad);

        }
        
        //Controller subclass for Withdraw View
        public class ATMControllerWithdraw implements ActionListener{
        
            //Create object of ATMView class to go back on quit button pressed
            ATMView view = new ATMView();
            
            //Create object of ATMController class to change balance in that class
            ATMController control = new ATMController();
        
            @Override
            
            //Method as per ATMView class until enter button event
            public void actionPerformed(ActionEvent e) {
                
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
                    
                } else if (e.getSource() == enter){
                    System.out.println("enter was pressed");
                    System.out.println(PIN.getText());
                    
                    
                    //Checks that withdraw amount is more than 0, less than 1000 and less than user's balance
                    if (Integer.valueOf(PIN.getText()) > 0 && Integer.valueOf(PIN.getText()) < 1000 && Integer.valueOf(PIN.getText()) < control.getBalance()){
                    
                        //Set withdraw amount to value typed by user
                        withdrawAmount = Integer.valueOf(PIN.getText());
                    
                        //Notifies user of amount withdrawn
                        instr.setText("£"+withdrawAmount+" withdrawn"); 
                        
                        //Options are enabled
                        withdraw5.setEnabled(true);
                        withdraw10.setEnabled(true);
                        withdraw20.setEnabled(true);
                        withdraw50.setEnabled(true);
                        withdrawX.setEnabled(true);
                        deposit.setEnabled(true);
                        quit.setEnabled(true);
                        
                        //Notifies user of new balance
                        balance.setText("£" + control.getBalance());
                        
                    //Else notify user invalid withdraw amount
                    } else instr.setText("Invalid withdraw amount - Please try again");
                    PIN.setText("");
                    
                //Same as ATMView class
                } else if (e.getSource() == clear){
                    System.out.println("clear was pressed");
                    PIN.setText("");
                    
                } else if (e.getSource() == withdraw5){
                    System.out.println("withdraw 5 was pressed");
                    if (control.getBalance() >= 5){
                        control.getBalance() = control.getBalance() - 5;
                        balance.setText("£" + control.getBalance());
                        instr.setText("£5 withdrawn");
                    } else {
                        instr.setText("Insufficient funds - please choose another option");
                    }
                    
                } else if (e.getSource() == withdraw10){
                    System.out.println("withdraw 10 was pressed");
                    if (control.getBalance() >= 10){
                        control.getBalance() = control.getBalance() - 10;
                        balance.setText("£" + control.getBalance());
                        instr.setText("£10 withdrawn");
                    } else {
                        instr.setText("Insufficient funds - please choose another option");
                    }
                    
                } else if (e.getSource() == withdraw20){
                    System.out.println("withdraw 20 was pressed");
                    if (control.getBalance() >= 20){
                        control.getBalance() = control.getBalance() - 20;
                        balance.setText("£" + control.getBalance());
                        instr.setText("£20 withdrawn");
                    } else {
                        instr.setText("Insufficient funds - please choose another option");
                    }
                    
                } else if (e.getSource() == withdraw50){
                    System.out.println("withdraw 50 was pressed");
                    if (control.getBalance() >= 50){
                        control.getBalance() = control.getBalance() - 50;
                        balance.setText("£" + control.getBalance());
                        instr.setText("£50 withdrawn");
                    } else {
                        instr.setText("Insufficient funds - please choose another option");
                    }
                    
                } else if (e.getSource() == withdrawX){
                    System.out.println("withdraw X was pressed");
                    appFrameWithdraw.dispose();
                    ATMViewWithdraw withdrawView = new ATMViewWithdraw();
                    withdrawView.createGUIWithdraw();
                    withdrawView.setVisible(true);
                    
                } else if (e.getSource() == deposit){
                    System.out.println("deposit was pressed");
                    appFrameWithdraw.dispose();
                    ATMViewDeposit depositView = new ATMViewDeposit();
                    depositView.createGUIDeposit();
                    depositView.setVisible(true);
                    
                //ATMView frame opened on quit button pressed
                } else if (e.getSource() == quit){
                    System.out.println("quit was pressed");
                    instr.setText("");
                    appFrameWithdraw.dispose();
                    view.createGUI();
                    view.setVisible(true);
                }
        }
    }
        
}
