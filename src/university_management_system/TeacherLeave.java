
package university_management_system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class TeacherLeave extends JFrame implements ActionListener {
    Choice cEmpId, ctime;
    JDateChooser dcdate;
    JButton Submit,Cancel;
    
    TeacherLeave(){
         setSize(500, 550);
         setLocation(450 , 100);
         setLayout(null);
         getContentPane().setBackground(Color.white);
         
         JLabel heading = new JLabel("Apply Leave (Teacher)");
         heading.setBounds(40,50, 300 , 30);
        add(heading);
        heading.setFont(new Font("Tahoma", Font.BOLD , 20));
                
                JLabel lblrollno = new JLabel("Search by Employee Id");
                lblrollno.setBounds(60,100, 200 , 20);
                lblrollno.setFont(new Font("Tahoma", Font.PLAIN , 18));
                add(lblrollno); 
        
       
        cEmpId = new Choice();
        cEmpId.setBounds( 60 , 130 , 200 , 20);
        add(cEmpId);
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next()){
                cEmpId.add(rs.getString("empId"));
            }
           
        }catch(Exception e){
            e.printStackTrace();
        }
        
                JLabel lbldate = new JLabel("Date");
                lbldate.setBounds(60,180, 200 , 20);
                lbldate.setFont(new Font("Tahoma", Font.PLAIN , 18));
                add(lbldate); 
                
                 dcdate = new JDateChooser();
                 dcdate.setBounds(60 , 210 , 200 , 24);
                 add(dcdate);
                 
                  JLabel lbltime = new JLabel("Time Duration");
                lbltime.setBounds(60,260, 200 , 20);
                lbltime.setFont(new Font("Tahoma", Font.PLAIN , 18));
                add(lbltime); 
        
       
        ctime = new Choice();
        ctime.setBounds( 60 , 290 , 200 , 20);
        // ctime.add("Choose"); 
        ctime.add("Full Day");
        ctime.add("Half Day");
        add(ctime);
        
         Submit = new JButton("Submit");  
          Submit.setBounds(60 , 350 , 100 , 25);
             Submit.setBackground(Color.black);
             Submit.setForeground(Color.white);
            Submit.addActionListener(this);
             Submit.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(Submit);
       
    
                  Cancel = new JButton("Cancel");  
           Cancel.setBounds(200 , 350 , 100 , 25);
             Cancel.setBackground(Color.black);
             Cancel.setForeground(Color.white);
           Cancel.addActionListener(this);
             Cancel.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(Cancel);
   

                 
                
         
         setVisible(true);
     }  
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Submit){
            String rollno = cEmpId.getSelectedItem();
            String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
            String duration  = ctime.getSelectedItem();
            String query = "insert into teacherleave values('"+rollno+"', '"+date+"', '"+duration+"')";
            
            
            try{
                Conn c = new Conn();
                
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Leave Confirmed");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
    
        new TeacherLeave();
    }
    
}
