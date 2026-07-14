package BankManagementSystem;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import java.util.*;

public class SignupTwo extends JFrame implements ActionListener {
	
	 static final long serialVersionUID = 1L;

	long random;
	JTextField pan,Aadhar;
	JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,Income;
	
	JButton next;
	
	JRadioButton male,female,other,married,unmarried;
	JDateChooser dateChooser;
	String formno;
	SignupTwo(String formno){
		this.formno=formno;
		setLayout(null);
		
		
		
		Random ran = new Random();
	    random=(Math.abs(ran.nextLong() % 900L)+1000L);
	    
	    setTitle("APPLICATION FORM - PAGE 2 - "+random);
	    
	    /*JLabel formno=new JLabel("APPLICATION FORM-PAGE 2"+random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno); */
		
		
		JLabel AdditionalDetails=new JLabel("Page 2: Additional Details");
		AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		AdditionalDetails.setBounds(290,80,400,30);
		add(AdditionalDetails);
		
		JLabel name=new JLabel("Religion");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,200,30);
		add(name);
		
		String valReligion [] = {"Hindu","Muslim","Sikh","Christian","Other"};
	    religion = new JComboBox(valReligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.WHITE);
		add(religion);
	
		
		JLabel fname=new JLabel("Category:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
		String Category [] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(Category);
		category.setBounds(300,190,400,30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel dob=new JLabel("Income:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		String Incomcategory [] = {"Null","< 1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
	    Income = new JComboBox(Incomcategory);
		Income.setBounds(300,240,400,30);
		Income.setBackground(Color.WHITE);
		add(Income);
		
		JLabel Gender=new JLabel("Educational:");
		Gender.setFont(new Font("Raleway",Font.BOLD,20));
		Gender.setBounds(100,290,200,30);
		add(Gender);
		
		JLabel email=new JLabel("Qualification:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,315,200,30);
		add(email);
		
		String EducationValues [] = {"Non Graduation","Graduation","Post Graduation","Doctrate","Other"};
	    education = new JComboBox(EducationValues);
		education.setBounds(300,315,400,30);
		education.setBackground(Color.WHITE);
		add(education);
		
		JLabel marital=new JLabel("Occupation:");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
		String occupationalValues [] = {"Salaried","Self-Employed","Bussiness","Student","Retired","other"};
         occupation = new JComboBox(occupationalValues);
		 occupation.setBounds(300,390,400,30);
		 occupation.setBackground(Color.WHITE);
		add( occupation);
		
		JLabel address=new JLabel("PAN Number:");
		address.setFont(new Font("Raleway",Font.BOLD,20));
		address.setBounds(100,440,200,30);
		add(address);
		
	    pan = new JTextField();
	    pan.setFont(new Font("Raleway",Font.BOLD,14));
	    pan.setBounds(300,440,400,30);
		add(pan);
		
		JLabel AadharN=new JLabel("Aadhar Number:");
		AadharN.setFont(new Font("Raleway",Font.BOLD,20));
		AadharN.setBounds(100,490,200,30);
		add(AadharN);
		
		Aadhar = new JTextField();
		Aadhar.setFont(new Font("Raleway",Font.BOLD,14));
		Aadhar.setBounds(300,490,400,30);
		add(Aadhar);
		
		JLabel state=new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,540,200,30);
		add(state);
		
		syes = new JRadioButton("Yes");
		syes.setBounds(300,540,100,30);
		syes.setBackground(Color.WHITE);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(450,540,200,30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup emaritalgroup = new ButtonGroup();
		emaritalgroup.add(syes);
		emaritalgroup.add(sno);
		
		JLabel pincode=new JLabel("Existing Account:");
		pincode.setFont(new Font("Raleway",Font.BOLD,20));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		eyes = new JRadioButton("Yes");
		eyes.setBounds(300,590,100,30);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setBounds(450,590,100,30);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		ButtonGroup existingAcco = new ButtonGroup();
		existingAcco.add(eyes);
		existingAcco.add(eno);
		
		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setBackground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		
		String formno =""+ random;
		String sreligion = (String) religion.getSelectedItem();
		String scategory =(String) category.getSelectedItem();
		String sincome = (String) Income.getSelectedItem();
		String seducation = (String) education.getSelectedItem();
		String soccupation = (String) occupation.getSelectedItem();
		String seniorcitizen = null;
		if(syes.isSelected()) {
			seniorcitizen = "Yes";
		} else if(sno.isSelected()) {
			seniorcitizen = "No";
		}
		String exisitingaccount = null;
		if(eyes.isSelected()) {
			exisitingaccount = "Yes";
		}else if(eno.isSelected()) {
			exisitingaccount = "No";
		} 
		
		String span = pan.getText();
		String sAadhar = Aadhar.getText();
		
		
		
		
		try {
				DbConnection c = new DbConnection();
				String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sAadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupThree(formno).setVisible(true);
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new SignupTwo("");
	}

}
