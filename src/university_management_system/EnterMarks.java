package university_management_system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class EnterMarks extends JFrame implements ActionListener {
    Choice crollno;
    JComboBox cbsemester;
    JTextField tfsub1 , tfsub2 , tfsub3 , tfsub4, tfsub5,tfmarks1 , tfmarks2 , tfmarks3 , tfmarks4, tfmarks5;
    JButton Submit , Cancel;
    
    
    
    EnterMarks(){
    setSize(1000, 500);
    setLocation(300, 150);
    setLayout(null);
    
    getContentPane().setBackground(Color.white);
    
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));
         Image i2 =  i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);   
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3); 
         image.setBounds(500, 40, 400, 300);
         add(image); 
                 
         JLabel heading = new JLabel("Enter Marks of Student");
        heading.setBounds(50 , 0 , 500 , 50);
        heading.setFont(new Font("Tahoma" , Font.BOLD , 20));
        add(heading);
        
         JLabel lblrollno = new JLabel("Select  Roll Number");
        lblrollno.setBounds(50,70, 150 , 20);
        heading.setFont(new Font("serif" , Font.PLAIN , 20));
        add(lblrollno);
        
       
        crollno = new Choice();
        crollno.setBounds(200 , 70 , 150 , 20);
        add(crollno);
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                crollno.add(rs.getString("rollno"));
            }
           
        }catch(Exception e){
            e.printStackTrace();
        } 
        
         JLabel lblsemester = new JLabel("Select Semester");
        lblsemester.setBounds(50 , 110, 150 , 20);
        add(lblsemester);
       
        
        String semester [] = {"please select","1st","2nd","3rd","4th","5th","6th","7th","8th"};
       cbsemester = new JComboBox(semester);
       cbsemester.setBounds(200 , 110 , 150 , 20);
       cbsemester.setBackground(Color.WHITE);
       add(cbsemester);
       
        JLabel lblsubject = new JLabel("Enter Subject");
        lblsubject.setBounds(100 , 150, 200 , 40);
        add(lblsubject);
       
        JLabel lblMarks = new JLabel("Enter Marks");
        lblMarks.setBounds(350 , 150, 200 , 40);
        add(lblMarks);
       
       tfsub1 = new JTextField();
       tfsub1.setBounds(50 , 200 , 200 , 20);
       add(tfsub1);
       
        tfsub2 = new JTextField();
       tfsub2.setBounds(50 , 230 , 200 , 20);
       add(tfsub2);
       
        tfsub3 = new JTextField();
       tfsub3.setBounds(50 , 260 , 200 , 20);
       add(tfsub3);
       
        tfsub4 = new JTextField();
       tfsub4.setBounds(50 , 290 , 200 , 20);
       add(tfsub4);
       
        tfsub5 = new JTextField();
       tfsub5.setBounds(50 , 320 , 200 , 20);
       add(tfsub5);
       
       
       tfmarks1 = new JTextField();
       tfmarks1.setBounds(250 , 200 , 200 , 20);
       add(tfmarks1);
       
       tfmarks2 = new JTextField();
       tfmarks2.setBounds(250 , 230 , 200 , 20);
       add(tfmarks2);
       
       tfmarks3 = new JTextField();
       tfmarks3.setBounds(250 , 260 , 200 , 20);
       add(tfmarks3);
       
       tfmarks4 = new JTextField();
       tfmarks4.setBounds(250 , 290 , 200 , 20);
       add(tfmarks4);
       
       tfmarks5 = new JTextField();
       tfmarks5.setBounds(250 , 320 , 200 , 20);
       add(tfmarks5); 
     
       
        Submit = new JButton("Submit");  
          Submit.setBounds(70 , 360 , 150 , 25);
             Submit.setBackground(Color.black);
             Submit.setForeground(Color.white);
            Submit.addActionListener(this);
             Submit.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(Submit);
       
               
             Cancel = new JButton("Back");  
             Cancel.setBounds(280 , 360 , 150 , 25);
             Cancel.setBackground(Color.black);
             Cancel.setForeground(Color.white);
           Cancel.addActionListener(this);
             Cancel.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(Cancel);
               
               
              
       
       setVisible(true);    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Submit){
    try{
        Conn c = new Conn();
        String query1 = "insert into subject values('"+crollno.getSelectedItem()+"' ,'"+cbsemester.getSelectedItem()+"' , '"+tfsub1.getText()+"' , '"+tfsub2.getText()+"' , '"+tfsub3.getText()+"' , '"+tfsub4.getText()+"' , '"+tfsub5.getText()+"')" ;
        String query2 = "insert into marks values('"+crollno.getSelectedItem()+"' ,'"+cbsemester.getSelectedItem()+"' , '"+tfmarks1.getText()+"' , '"+tfmarks2.getText()+"' , '"+tfmarks3.getText()+"' , '"+tfmarks4.getText()+"' , '"+tfmarks5.getText()+"')" ;

       c.s.executeUpdate(query1);
       c.s.executeUpdate(query2); 
       
       JOptionPane.showMessageDialog(null ,"Marks Inserted Successfully");
       setVisible(false);
    }catch(Exception e){
        e.printStackTrace(); 
    }
            
            
            
        } else {
            setVisible(false);  
        }
    }
    public static void main(String[] args) {
      new EnterMarks();     
    }
}
