public class Application extends JFrame{
 
	private ShowPanel oShowPanel;
	private EnterPanel oEnterPanel;
	
	public Application(){
		super("Example");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(200, 300);
		this.ignition();
		this.setVisible(true); // makes itself visible
	}
 
	private void ignition() {
		this.setLayout(new GridLayout(2, 1));
 
		// create data object
		Student oStudent = new Student();
		// pass Object to JPanels
		oEnterPanel = new EnterPanel(oStudent);
		oShowPanel = new ShowPanel(oStudent);
		
		// Student is observed by ShowPanel
		oStudent.addObserver(oShowPanel);
		
		// add Panels to GUI
		this.add(oEnterPanel, 0);
		this.add(oShowPanel, 1);
	}
 
	/**
	 * &lt;p>simple JPanel, which owns a text field and a button.&lt;br>
	 * Clicking the button sets the name of the Object Student.&lt;/br>&lt;/p>
	 */
	public class EnterPanel extends JPanel{
 
		public EnterPanel(Student oStudent){
			super();
			this.ignition(oStudent);
		}
 
		private void ignition(final Student oStudent) {
			this.setLayout(new GridLayout(3, 1));
			
			this.add(new JLabel("Enter name:"));
			final JTextField oText = new JTextField();
			this.add(oText);
			JButton oButton = new JButton("Click me hard!");
			oButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent oEvent) {
					oStudent.setName(oText.getText());
				}
			});
			this.add(oButton);
		}
	}
	
	/**
	 * &lt;p>ShowPanel observes the data Object Student. &lt;br>
	 * When notified, it updates the Label to present the name.&lt;/br>&lt;/p>
	 */
	private class ShowPanel extends JPanel implements Observer {
		
		JLabel oLabel;
		public ShowPanel(Student oStudent){
			this.ignition(oStudent);
		}
 
		private void ignition(Student oStudent) {
			this.setLayout(new GridLayout(2, 1));
			this.add(new JLabel("Name is:"));
			
			oLabel= new JLabel();
			this.add(oLabel);
		}
 
		@Override
		public void update(Observable oObservable, Object oObject) {
			// we do not figure who kicked us, we just repaint.
			System.out.println("TEST");
			Student oStudent = ((Student)oObservable); // cast
			this.oLabel.setText(oStudent.getName()); // renew value
		}
	}
	
	/**
	 * &lt;p>data Object, which holds the name of one student.&lt;br>
	 * Classic POJO which extends Observable. The setter notifies the Observers.&lt;/br>&lt;/p>
	 */
	public class Student extends Observable{
		private String strName;
		public Student() { /* doany() */}
		
		public void setName(String strName) {
			this.strName = strName;
			setChanged();
			notifyObservers();
		}
 
		public String getName() {
			return strName;
		}
	}
	
	// entry point
	public static void main(String[] args) {
		new Application(); // create Object
	}
}