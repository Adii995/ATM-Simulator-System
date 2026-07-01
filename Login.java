package BankManagementSystem;
import java.awt.Color;
import java.sql.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener {
	
	  static final long serialVersionUID = 1L; 
	 
	    JButton Login,Signup,Clear;
	    JTextField cardTextField;
	    JPasswordField PinTextField;
	
	Login(){
		setTitle("AUTOMATED TELLER MACHINE");
		setLayout(null);
		ImageIcon i1 = new ImageIcon(Login.class.getResource("/icon/logo.jpg"));
		Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel label=new JLabel(i3);
		label.setBounds(70,10,100,100);
		add(label);
		
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200, 40, 400, 40);
		add(text);
		
		JLabel CardNo = new JLabel("Card No:");
		CardNo.setFont(new Font("Raleway",Font.BOLD,28));
		CardNo.setBounds(120, 150, 400, 40);
		add(CardNo);
		
	    cardTextField= new JTextField();
		cardTextField.setBounds(300,150,250,30);
		cardTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(cardTextField);
		
		JLabel Pin = new JLabel("PIN:");
		Pin.setFont(new Font("Raleway",Font.BOLD,38));
		Pin.setBounds(120, 220, 250, 30);
		add(Pin);
		
	    PinTextField= new JPasswordField();
		PinTextField.setBounds(300,220,230,30);
		PinTextField.setFont(new Font("Arial",Font.BOLD,14));
		add(PinTextField);
		
	    Login = new JButton("SIGN IN");
		Login.setBounds(300,300,100,30);
		Login.setBackground(Color.BLACK);
		Login.setForeground(Color.WHITE);
		Login.addActionListener(this);
		add(Login);
		
	    Clear = new JButton("CLEAR");
		Clear.setBounds(430,300,100,30);
		Clear.setBackground(Color.BLACK);
		Clear.setForeground(Color.WHITE);
		Clear.addActionListener(this);
		add(Clear);
		
		Signup = new JButton("SIGN UP");
		Signup.setBounds(300,350,230,30);
		Signup.setBackground(Color.BLACK);
		Signup.setForeground(Color.WHITE);
		Signup.addActionListener(this);
		add(Signup);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(800, 480);
		setVisible(true);
		setLocation(350,200);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == Clear) {
			cardTextField.setText("");
			PinTextField.setText("");
		}
        if(ae.getSource() == Login) {
          DbConnection c = new DbConnection();
          String cardnumber = cardTextField.getText();
          String pinnumber = PinTextField.getText();
          
          String query = "select * from login where cardnumber = '"+cardnumber+"' and pin='"+pinnumber+"'";
		
           try {
        	 ResultSet rs =  c.s.executeQuery(query);
			 if(rs.next()) {
				 setVisible(false);
				 new Transactions(pinnumber).setVisible(true);
			 }else {
				 JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
			 }
		} catch (Exception e) {
		    System.out.println(e);
		}
		}
        if(ae.getSource() == Signup) {
			setVisible(false);
			new SignupOne("").setVisible(true);
		}
		
	}
	public static void main(String[] args) {
		new Login();
	
	}

}
