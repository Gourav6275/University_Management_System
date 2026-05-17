
package university_management_system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class AddTeachar extends JFrame implements ActionListener{
    
    JTextField tfname , tffname , tfaddress , tfphone,tfemail, tfx, tfxii, tfadhar;
    JLabel labelempid;
    JDateChooser dcdob;
    JComboBox cbcourse , cbbranch; 
    JButton Submit , Cancel;
    
    Random ran = new Random();
     long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    AddTeachar(){
        setSize(900 , 700);
        setLocation(350 , 30);
       
         //heading dene ke liye 
        setLayout(null);
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310 , 30 , 500 , 50);
        heading.setFont(new Font("serif" , Font.BOLD , 30));
        add(heading);
        
      //details item debe ke liye 
         JLabel lblname = new JLabel("Name");
        lblname.setBounds(50 , 150 , 100 , 30);
        lblname.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblname);
       
    // details fill kerne ke liye box
        tfname = new JTextField();
        tfname.setBounds(200 ,150 , 150 , 30);
        add(tfname);
       
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400 , 150 , 200 , 30);
        lblfname.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblfname);
       
    // details fill kerne ke liye box
        tffname = new JTextField();
        tffname.setBounds(600 ,150 , 150 , 30);
        add(tffname);
       
        //ROLL NUMBER DALNE KE LIYE
        JLabel lblempid = new JLabel("Employee Id");
        lblempid.setBounds(50 , 200 , 200 , 30);
        lblempid.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblempid);
        
        //RANDOM NUMBER GENERATE KARANE KE LIYE
         labelempid = new JLabel("101" + first4);
        labelempid.setBounds(200 , 200 , 200 , 30);
        labelempid.setFont(new Font("serif" , Font.BOLD , 20));
        add(labelempid);
        
        //DOB 
        JLabel lblDOB = new JLabel("Date of Birth");
        lblDOB.setBounds(400 , 200 , 200 , 30);
        lblDOB.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblDOB);
          
        dcdob = new JDateChooser();
        dcdob.setBounds(600 , 200 , 150 , 30);
        add(dcdob); 
        
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50 , 250 , 200 , 30);
        lbladdress.setFont(new Font("serif" , Font.BOLD , 20));
        add(lbladdress);
       
    // details fill kerne ke liye box
        tfaddress = new JTextField();
        tfaddress.setBounds(200 ,250 , 150 , 30);
        add(tfaddress);
        
        
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400 , 250 , 200 , 30);
        lblphone.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblphone);
       
    // details fill kerne ke liye box
        tfphone = new JTextField();
        tfphone.setBounds(600 ,250 , 150 , 30);
        add(tfphone);
        
        JLabel lblEmail = new JLabel("Email Id");
        lblEmail.setBounds(50 , 300 , 200 , 30);
        lblEmail.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblEmail);
       
    // details fill kerne ke liye box
        tfemail = new JTextField();
        tfemail.setBounds(200 ,300 , 150 , 30);
        add(tfemail);
        
        
        
        JLabel lblx = new JLabel("Class X(%)");
        lblx.setBounds(400 , 300 , 200 , 30);
        lblx.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblx);
       
    // details fill kerne ke liye box
        tfx = new JTextField();
        tfx.setBounds(600 ,300 , 150 , 30);
        add(tfx);
        
      
          JLabel lblxii = new JLabel("Class XII(%)");
        lblxii.setBounds(50 , 350 , 200 , 30);
        lblxii.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblxii);
       
    // details fill kerne ke liye box
        tfxii = new JTextField();
        tfxii.setBounds(200 ,350 , 150 , 30);
        add(tfxii);
      
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400 , 350 , 200 , 30);
        lblaadhar.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblaadhar);
       
    // details fill kerne ke liye box
        tfadhar = new JTextField();
        tfadhar.setBounds(600 ,350 , 150 , 30);
        add(tfadhar);
        
           JLabel lblcourse = new JLabel("Qualification");
        lblcourse.setBounds(50 , 400 , 200 , 30);
        lblcourse.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblcourse);
        
        //DROP DOWN me value dalne ke liye 
        String course[] = {"B.Tech" , "BBA" , "BCA" , "Bsc" ,"Bcom" , "BA", "Msc" , "MBA" , "M.Tech", "MCA" , "MCom" , "MA"};
       //DROP DOWN BANANE KE LIYE  
       cbcourse = new JComboBox(course);
       cbcourse.setBounds(200 , 400 , 150 , 30);
       cbcourse.setBackground(Color.white); 
       add(cbcourse); 
       
       //BRANCH DROP DOWN
           JLabel lblBranch = new JLabel("Department");
        lblBranch.setBounds(400 , 400 , 200 , 30);
        lblBranch.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblBranch);
        
        //DROP DOWN me value dalne ke liye 
        String branch[] = {"CSE" , "AIML" , "AIDS" , "EC" ,"CIVIL" , "Mechanical", "IT"};
       //DROP DOWN BANANE KE LIYE  
       cbbranch = new JComboBox(branch);
       cbbranch.setBounds(600 , 400 , 150 , 30);
       cbbranch.setBackground(Color.white); 
       add(cbbranch );
       
      //BUTTON SUBMIT AND CANCEL
       Submit = new JButton("Submit");  
          Submit.setBounds(250 , 550 , 120 , 30);
             Submit.setBackground(Color.black);
             Submit.setForeground(Color.white);
            Submit.addActionListener(this);
             Submit.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(Submit);
       
    
                  Cancel = new JButton("Cancel");  
           Cancel.setBounds(450 , 550 , 120 , 30);
             Cancel.setBackground(Color.black);
             Cancel.setForeground(Color.white);
           Cancel.addActionListener(this);
             Cancel.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(Cancel);
   
        setVisible(true);
        
    }
    
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Submit){
        String name = tfname.getText();
        String fname = tffname.getText();
        String rollNo = labelempid.getText();
        String DOB = ((JTextField)(dcdob.getDateEditor().getUiComponent())).getText();
        String address = tfaddress.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        String x = tfx.getText();
        String xii = tfxii.getText();
        String aadhar = tfadhar.getText();
        String course = (String) cbcourse.getSelectedItem();
        String branch = (String)cbbranch.getSelectedItem();
        
        try{
            String query = "insert into teacher values('"+name+"', '"+fname+"', '"+rollNo+"' , '"+DOB+"' , '"+address+"' , '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"' , '"+course+"', '"+branch+"')";
       
      Conn con = new Conn();
      con.s.executeUpdate(query);
      
      JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
      setVisible(false);
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        }else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddTeachar();
    }
}