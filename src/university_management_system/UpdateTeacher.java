
package university_management_system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class UpdateTeacher extends JFrame implements ActionListener{
    
    JTextField   tfaddress , tfphone,tfemail ,tfcourse , tfbranch ;
    JLabel labelempId;
    JButton Submit , Cancel;
    Choice cEmpId;
    
    
       UpdateTeacher(){
        setSize(900 , 650);
        setLocation(350 , 30);
       
         //heading dene ke liye 
        setLayout(null);
        JLabel heading = new JLabel(" Update Teacher Details");
        heading.setBounds(40 , 10 , 500 , 50);
        heading.setFont(new Font("Tahoma" , Font.ITALIC , 35));
        add(heading);
        
         JLabel lblrollno = new JLabel("Select Employee Id");
        lblrollno.setBounds(50,100, 200 , 20);
        heading.setFont(new Font("serif" , Font.PLAIN , 20));

        add(lblrollno);
        
       
        cEmpId = new Choice();
        cEmpId.setBounds(250 , 100 , 200 , 20);
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
       
        
      //details item debe ke liye 
         JLabel lblname = new JLabel("Name");
        lblname.setBounds(50 , 150 , 100 , 30);
        lblname.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblname);
       
    // details fill kerne ke liye box
        JLabel labelname = new JLabel();
        labelname.setBounds(200 , 150 , 150 , 30);
        labelname.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(labelname);
       
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400 , 150 , 200 , 30);
        lblfname.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblfname);
       
    // details fill kerne ke liye box
        JLabel labelfname = new JLabel();
        labelfname.setBounds(600 ,150 , 150 , 30);
        labelfname.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        add(labelfname);
       
        //ROLL NUMBER DALNE KE LIYE
        JLabel lblrollNumber = new JLabel("Employee Id");
        lblrollNumber.setBounds(50 , 200 , 200 , 30);
        lblrollNumber.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblrollNumber);
        
        //RANDOM NUMBER GENERATE KARANE KE LIYE
         labelempId = new JLabel();
        labelempId.setBounds(200 , 200 , 200 , 30);
        labelempId.setFont(new Font("serif" , Font.BOLD , 20));
        add(labelempId);
        
        //DOB & CALENDER
        JLabel lablDOB = new JLabel("Date of Birth");
        lablDOB.setBounds(400 , 200 , 200 , 30);
        lablDOB.setFont(new Font("serif" , Font.BOLD , 20));
        add(lablDOB);
          
        JLabel labeldob = new JLabel();
        labeldob.setBounds(600 , 200 , 150 , 30);
        labeldob.setFont(new Font("Tahoma" , Font.PLAIN , 19));
        add(labeldob); 
        
        
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
        JLabel lablx = new JLabel();
        lablx.setBounds(600 ,300 , 150 , 30);
        add(lablx);
        
      
          JLabel lblxii = new JLabel("Class XII(%)");
        lblxii.setBounds(50 , 350 , 200 , 30);
        lblxii.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblxii);
       
    // details fill kerne ke liye box
       JLabel labelxii = new JLabel(); 
        labelxii.setBounds(200 ,350 , 150 , 30);
        add(labelxii);
      
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400 , 350 , 200 , 30);
        lblaadhar.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblaadhar);
       
    // details fill kerne ke liye box
       JLabel labelaadhar = new JLabel();
        labelaadhar.setBounds(600 ,350 , 150 , 30);
        add(labelaadhar);
        
           JLabel lblcourse = new JLabel("Education");
        lblcourse.setBounds(50 , 400 , 200 , 30);
        lblcourse.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblcourse);
        
        //DROP DOWN me value dalne ke liye 
       //DROP DOWN BANANE KE LIYE  
       tfcourse = new JTextField();
       tfcourse.setBounds(200 , 400 , 150 , 30);
       add(tfcourse); 
       
       //BRANCH DROP DOWN
           JLabel lblBranch = new JLabel("DepartMent");
        lblBranch.setBounds(400 , 400 , 200 , 30);
        lblBranch.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblBranch);
        
        //DROP DOWN me value dalne ke liye 
       //DROP DOWN BANANE KE LIYE  
       tfbranch = new JTextField();
       tfbranch.setBounds(600 , 400 , 150 , 30);
       tfbranch.setBackground(Color.white); 
       add(tfbranch );
       
       try{
           
           Conn c = new Conn();
           String query = "select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
          ResultSet rs = c.s.executeQuery(query);
          while(rs.next()){
              labelname.setText(rs.getString("name"));
              labelfname.setText(rs.getString("fname"));
              labeldob.setText(rs.getString("DOB"));
              tfaddress.setText(rs.getString("address"));
              tfphone.setText(rs.getString("phone"));
              tfemail.setText(rs.getString("email"));
              lablx.setText(rs.getString("x"));
              labelxii.setText(rs.getString("xii"));
              labelaadhar.setText(rs.getString("aadhar"));
              labelempId.setText(rs.getString("empId"));
              tfcourse.setText(rs.getString("education"));
              tfbranch.setText(rs.getString("department"));
          }
       
       } catch(Exception e){
           e.printStackTrace();
       }
       
       cEmpId.addItemListener(new ItemListener(){
           public void itemStateChanged(ItemEvent ie){
         
         try{
           
           Conn c = new Conn();
           String query = "select * from teacher where empId='"+cEmpId.getSelectedItem()+"'";
          ResultSet rs = c.s.executeQuery(query);
          while(rs.next()){
              labelname.setText(rs.getString("name"));
              labelfname.setText(rs.getString("fname"));
              labeldob.setText(rs.getString("DOB"));
              tfaddress.setText(rs.getString("address"));
              tfphone.setText(rs.getString("phone"));
              tfemail.setText(rs.getString("email"));
              lablx.setText(rs.getString("x"));
              labelxii.setText(rs.getString("xii"));
              labelaadhar.setText(rs.getString("aadhar"));
              labelempId.setText(rs.getString("empId"));
              tfcourse.setText(rs.getString("education"));
              tfbranch.setText(rs.getString("department"));
          }
       
       } catch(Exception e){
           e.printStackTrace();
       }       
               
           }
       });
       
       
       
      //BUTTON SUBMIT AND CANCEL
       Submit = new JButton("Update");  
          Submit.setBounds(250 , 500 , 120 , 30);
             Submit.setBackground(Color.black);
             Submit.setForeground(Color.white);
            Submit.addActionListener(this);
             Submit.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(Submit);
       
    
                  Cancel = new JButton("Cancel");  
           Cancel.setBounds(450 , 500 , 120 , 30);
             Cancel.setBackground(Color.black);
             Cancel.setForeground(Color.white);
           Cancel.addActionListener(this);
             Cancel.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(Cancel);
   
        setVisible(true);
        
    }
    
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Submit){
        String empId = labelempId.getText();
         String address = tfaddress.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        String course = tfcourse.getText();
        String branch = tfbranch.getText(); 
        
        try{
            String query = "update teacher set address='"+address+"', phone='"+phone+"',email='"+email+"',education='"+course+"',department='"+branch+"' where empId='"+empId+"'";
       
      Conn con = new Conn();
      con.s.executeUpdate(query);
      
      JOptionPane.showMessageDialog(null, "Teacher Details Updated Successfully");
      setVisible(false);
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        }else {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new UpdateTeacher();
    }
}