import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMWithdrawController {
	private ATMWithdrawModel model;
	private ATMViewWithdraw view;
    private ActionListener actionListener;
    
	public ATMWithdrawController(ATMWithdrawModel model, ATMViewWithdraw view)
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
                
            } else if (e.getSource() == view.enter){
                System.out.println("enter was pressed");
                System.out.println(view.PIN.getText());
                
                
                //Checks that withdraw amount is more than 0, less than 1000 and less than user's balance
               // if (Integer.valueOf(PIN.getText()) > 0 && Integer.valueOf(PIN.getText()) < 1000 && Integer.valueOf(PIN.getText()) < control.getBalance()){
                
                    //Set withdraw amount to value typed by user
                    model.setWithdraw(Integer.valueOf(view.PIN.getText()));
                
                    //Notifies user of amount withdrawn
                    view.instr.setText("£" + model.getWithdraw() + " withdrawn"); 
                    
                    //Options are enabled
                    view.withdraw5.setEnabled(true);
                    view.withdraw10.setEnabled(true);
                    view.withdraw20.setEnabled(true);
                    view.withdraw50.setEnabled(true);
                    view.withdrawX.setEnabled(true);
                    view.deposit.setEnabled(true);
                    view.quit.setEnabled(true);
                    
                    //Notifies user of new balance
                  //  balance.setText("£" + control.getBalance());
                    
                //Else notify user invalid withdraw amount
//                } else instr.setText("Invalid withdraw amount - Please try again");
//                PIN.setText("");
                
            //Same as ATMView class
            } else if (e.getSource() == view.clear){
                System.out.println("clear was pressed");
                view.PIN.setText("");
                
            } else if (e.getSource() == view.withdraw5){
                System.out.println("withdraw 5 was pressed");
//                if (control.getBalance() >= 5){
//                    control.getBalance() = control.getBalance() - 5;
//                    balance.setText("£" + control.getBalance());
//                    instr.setText("£5 withdrawn");
//                } else {
                view.instr.setText("Insufficient funds - please choose another option");
//                }
                
            } else if (e.getSource() == view.withdraw10){
                System.out.println("withdraw 10 was pressed");
//                if (control.getBalance() >= 10){
//                    control.getBalance() = control.getBalance() - 10;
//                    balance.setText("£" + control.getBalance());
//                    instr.setText("£10 withdrawn");
//                } else {
                view.instr.setText("Insufficient funds - please choose another option");
//                }
                
            } else if (e.getSource() == view.withdraw20){
                System.out.println("withdraw 20 was pressed");
//                if (control.getBalance() >= 20){
//                    control.getBalance() = control.getBalance() - 20;
//                    balance.setText("£" + control.getBalance());
//                    instr.setText("£20 withdrawn");
//                } else {
                view.instr.setText("Insufficient funds - please choose another option");
//                }
                
            } else if (e.getSource() == view.withdraw50){
                System.out.println("withdraw 50 was pressed");
//                if (control.getBalance() >= 50){
//                    control.getBalance() = control.getBalance() - 50;
//                    balance.setText("£" + control.getBalance());
//                    instr.setText("£50 withdrawn");
//                } else {
                view.instr.setText("Insufficient funds - please choose another option");
//                }
                
            } else if (e.getSource() == view.withdrawX){
                System.out.println("withdraw X was pressed");
                view.appFrameWithdraw.dispose();
                ATMViewWithdraw withdrawView = new ATMViewWithdraw();
                withdrawView.setVisible(true);
                
            } else if (e.getSource() == view.deposit){
                System.out.println("deposit was pressed");
                view.appFrameWithdraw.dispose();
                ATMViewDeposit depositView = new ATMViewDeposit();
                depositView.setVisible(true);
                
            //ATMView frame opened on quit button pressed
            } else if (e.getSource() == view.quit){
                System.out.println("quit was pressed");
                view.instr.setText("");
                view.appFrameWithdraw.dispose();
                view.setVisible(true);
            }
        }
    }

