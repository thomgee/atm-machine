import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ATMViewWithdraw extends ATMView {
    
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
    public ATMViewWithdraw(){
    
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

}
