import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMController {
	private ATMModel model;
	private ATMView view;
    private ActionListener actionListener;
    
	public ATMController(ATMModel model, ATMView view)
	{
		this.model = model;
		this.view = view;  
	}

	public void control()
	{
		actionListener = new ActionListener() {
		    //Method which controls the login phase, checks PIN is correct
			public void actionPerformed(ActionEvent actionEvent) {                  
			    linkBtns(actionEvent);
			}
		};
	      
		view.one.addActionListener(actionListener); 
		view.two.addActionListener(actionListener);
		view.three.addActionListener(actionListener);
		view.four.addActionListener(actionListener);
		view.five.addActionListener(actionListener);
		view.six.addActionListener(actionListener);
		view.seven.addActionListener(actionListener);
		view.eight.addActionListener(actionListener);
		view.nine.addActionListener(actionListener);
		view.zero.addActionListener(actionListener);
		view.enter.addActionListener(actionListener);
		view.clear.addActionListener(actionListener);
		view.withdraw5.addActionListener(actionListener);
		view.withdraw10.addActionListener(actionListener);
		view.withdraw20.addActionListener(actionListener);
		view.withdraw50.addActionListener(actionListener);
		view.withdrawX.addActionListener(actionListener);
		view.deposit.addActionListener(actionListener);
		view.quit.addActionListener(actionListener);
	}

    private void linkBtns(ActionEvent e){
        
        //Logs button presses in terminal
        if (e.getSource() == view.one){
            System.out.println("1 was pressed");
            view.PIN.setText(view.PIN.getText() + "1");
            
        } else if (e.getSource() == view.two){
            System.out.println("2 was pressed");
            view.PIN.setText(view.PIN.getText() + "2");
            
        } else if (e.getSource() == view.three){
            System.out.println("3 was pressed");
            view.PIN.setText(view.PIN.getText() + "3");
            
        } else if (e.getSource() == view.four){
            System.out.println("4 was pressed");
            view.PIN.setText(view.PIN.getText() + "4");
            
        } else if (e.getSource() == view.five){
            System.out.println("5 was pressed");
            view.PIN.setText(view.PIN.getText() + "5");
            
        } else if (e.getSource() == view.six){
            System.out.println("6 was pressed");
            view.PIN.setText(view.PIN.getText() + "6");
            
        } else if (e.getSource() == view.seven){
            System.out.println("7 was pressed");
            view.PIN.setText(view.PIN.getText() + "7");
            
        } else if (e.getSource() == view.eight){
            System.out.println("8 was pressed");
            view.PIN.setText(view.PIN.getText() + "8");
            
        } else if (e.getSource() == view.nine){
            System.out.println("9 was pressed");
            view.PIN.setText(view.PIN.getText() + "9");
            
        } else if (e.getSource() == view.zero){
            System.out.println("0 was pressed");
            view.PIN.setText(view.PIN.getText() + "0");
        
        //PIN check kicks in when enter is pressed
        } else if (e.getSource() == view.enter){
            System.out.println("enter was pressed");
            System.out.println(view.PIN.getText());
            
            //If string in JTextArea = "1234"
            if ("1234".equals(view.PIN.getText())){
                
                //Notifies user that PIN is correct
            	view.instr.setText("PIN Correct - Please choose one of the options below"); 
                
                model.setBalance(10);
                
                //Options are enabled
                view.withdraw5.setEnabled(true);
                view.withdraw10.setEnabled(true);
                view.withdraw20.setEnabled(true);
                view.withdraw50.setEnabled(true);
                view.withdrawX.setEnabled(true);
                view.deposit.setEnabled(true);
                view.quit.setEnabled(true);
                
                //Balance updated
                view.balance.setText("£" + model.getBalance());
                
            //Else notify user PIN incorrect
            } else view.instr.setText("Invalid PIN - Please try again");
            
            //Clear contents of JTextArea
            view.PIN.setText("");
            
        //Clear contents of JTextArea
        } else if (e.getSource() == view.clear){
            System.out.println("clear was pressed");
            view.PIN.setText("");
            
        //Withdraw £5
        } else if (e.getSource() == view.withdraw5){
            System.out.println("withdraw 5 was pressed");
            
            //Makes sure balance is more than £5
            if (model.getBalance() >= 5){
            	model.setBalance(model.getBalance() - 5);
                
                //Update the balance label
                view.balance.setText("£" + model.getBalance());
                
                //Notify user £5 withdrawn
                view.instr.setText("£5 withdrawn");
                
            //Else notify user Insufficient funds
            } else {
            	view.instr.setText("Insufficient funds - please choose another option");
            }
            
        //Same as before but for £10
        } else if (e.getSource() == view.withdraw10){
            System.out.println("withdraw 10 was pressed");
            if (model.getBalance() >= 10){
            	model.setBalance(model.getBalance() - 10);
                view.balance.setText("£" + model.getBalance());
                view.instr.setText("£10 withdrawn");
            } else {
            	view.instr.setText("Insufficient funds - please choose another option");
            }
          
        //Same as before but for £20
        } else if (e.getSource() == view.withdraw20){
            System.out.println("withdraw 20 was pressed");
            if (model.getBalance() >= 20){
                model.setBalance(model.getBalance() - 20);
                view.balance.setText("£" + model.getBalance());
                view.instr.setText("£20 withdrawn");
            } else {
            	view.instr.setText("Insufficient funds - please choose another option");
            }
            
        //Same as before but for £50
        } else if (e.getSource() == view.withdraw50){
            System.out.println("withdraw 50 was pressed");
            if (model.getBalance() >= 50){
                model.setBalance(model.getBalance() - 50);
                view.balance.setText("£" + model.getBalance());
                view.instr.setText("£50 withdrawn");
            } else {
            	view.instr.setText("Insufficient funds - please choose another option");
            }
            
        //On button press, takes you to a different JFrame
        } else if (e.getSource() == view.withdrawX){
            System.out.println("withdraw X was pressed");
            
            //Closes current JFrame
            //view.appFrame.dispose();
            
            ATMWithdrawModel withdrawModel = new ATMWithdrawModel();

            //Create an object of ATMViewWithdraw class and use it to call method to create the GUI
            //Create Withdraw View GUI
            ATMViewWithdraw withdrawView = new ATMViewWithdraw();
            view.setVisible(true);
            ATMWithdrawController withdrawController = new ATMWithdrawController(withdrawModel, withdrawView);
            withdrawController.control();
            
        //Same as withdrawX but for Deposit View
        } else if (e.getSource() == view.deposit){
            System.out.println("deposit was pressed");
            
            //view.appFrame.dispose();
            
            ATMDepositModel model = new ATMDepositModel();

            //Create an object of ATMViewDeposit class and use it to call method to create the GUI
            //Create Deposit View GUI
            ATMViewDeposit view = new ATMViewDeposit();
            view.setVisible(true);
            ATMDepositController controller = new ATMDepositController(model, view);
            controller.control();
            
        //Pressing quit logs the user out
        } else if (e.getSource() == view.quit){
            System.out.println("quit was pressed");
            
            //Prompted to enter PIN
            view.instr.setText("Enter your pin and press enter");
            
            //Disables options
            view.withdraw5.setEnabled(false);
            view.withdraw10.setEnabled(false);
            view.withdraw20.setEnabled(false);
            view.withdraw50.setEnabled(false);
            view.withdrawX.setEnabled(false);
            view.deposit.setEnabled(false);
            view.quit.setEnabled(false);
            
            //Balance no long visible
            view.balance.setText("");
        }
    }
    
    //Create object of ATMViewDeposit to use to subtract withdraw amount from balance
//    ATMViewWithdraw withdrawView = new ATMViewWithdraw();
//    
//    //Create object of ATMViewDeposit to use to add deposit amount to balance
//    ATMViewDeposit depositView = new ATMViewDeposit();
     
}
