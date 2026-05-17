
package university_management_system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class FeeForm extends JFrame implements ActionListener{
    Choice crollno;
    JComboBox cbcourse , cbbranch ,cbsemester;
    JLabel labltotal;
    JButton update , pay , back;
    
    FeeForm(){
      setSize(900 , 500);
      setLocation(300 , 100);
              setLayout(null);

      
      getContentPane().setBackground(Color.white);      
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fee.jpg"));
         Image i2 =  i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);   
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3); 
        image.setBounds(400, 50, 500, 300);
         add(image); 
      
      JLabel lblrollno = new JLabel("Select  Roll No");
        lblrollno.setBounds(40,60, 150 , 20);
        lblrollno.setFont(new Font("Tahoma" , Font.BOLD , 16));

        add(lblrollno);
        
       
        crollno = new Choice();
        crollno.setBounds(200 , 60 , 150 , 20);
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
       
        
      //details item debe ke liye 
         JLabel lblname = new JLabel("Name");
        lblname.setBounds(40 , 100 , 150 , 20);
        lblname.setFont(new Font("Tahoma" , Font.BOLD , 16));
        add(lblname);
       
    // details fill kerne ke liye box
        JLabel labelname = new JLabel();
        labelname.setBounds(200 , 100 , 150 , 20);
        labelname.setFont(new Font("Tahoma" , Font.PLAIN , 16));
        add(labelname);
       
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(40 , 140 , 150 , 20);
        lblfname.setFont(new Font("Tahoma" , Font.BOLD , 16));
        add(lblfname);
       
    // details fill kerne ke liye box
        JLabel labelfname = new JLabel();
        labelfname.setBounds(200,140 , 150 , 20);
        labelfname.setFont(new Font("Tahoma" , Font.PLAIN , 16));
        add(labelfname);
       
        try{
           
           Conn c = new Conn();
           String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
          ResultSet rs = c.s.executeQuery(query);
          while(rs.next()){
              labelname.setText(rs.getString("name"));
              labelfname.setText(rs.getString("fname"));
              
          }
       
       } catch(Exception e){
           e.printStackTrace();
       }
       
   crollno.addItemListener(new ItemListener(){
           public void itemStateChanged(ItemEvent ie){
         
         try{
           
           Conn c = new Conn();
           String query = "select * from student where rollno='"+crollno.getSelectedItem()+"'";
          ResultSet rs = c.s.executeQuery(query);
          while(rs.next()){
              labelname.setText(rs.getString("name"));
              labelfname.setText(rs.getString("fname"));
                       }
       
       } catch(Exception e){
           e.printStackTrace();
       }       
               
           }
       });
         
   
       JLabel lblcourse = new JLabel("Course");
        lblcourse.setBounds(40 , 180 , 150 , 20);
        lblcourse.setFont(new Font("Tahoma" , Font.BOLD , 16));
        add(lblcourse);
        
        //DROP DOWN me value dalne ke liye 
        String course[] = {"B.Tech","Bsc","BCA","M.Tech","MCA","MBA","Bcom"};
       //DROP DOWN BANANE KE LIYE  
       cbcourse = new JComboBox(course);
       cbcourse.setBounds(200 , 180 , 150 , 20);
       cbcourse.setBackground(Color.white); 
       add(cbcourse); 
       
       //BRANCH DROP DOWN
           JLabel lblBranch = new JLabel("Branch");
        lblBranch.setBounds(40 , 220 , 150 , 20);
        lblBranch.setFont(new Font("Tahoma" , Font.BOLD , 16));
        add(lblBranch);
        
        //DROP DOWN me value dalne ke liye 
        String branch[] = {"CSE" , "AIML" , "AIDS" , "EC" ,"CIVIL" , "Mechanical", "IT"};
       //DROP DOWN BANANE KE LIYE  
       cbbranch = new JComboBox(branch);
       cbbranch.setBounds(200 , 220 , 150 , 20);
       cbbranch.setBackground(Color.white); 
       add(cbbranch );
       
       
       JLabel lblsemester = new JLabel("Semester");
        lblsemester.setBounds(40 , 260, 150 , 20);
        lblsemester.setFont(new Font("Tahoma" , Font.BOLD , 16));
        add(lblsemester);
       
        
        String semester [] = {"semester1","semester2","semester3","semester4","semester5","semester6","semester7","semester8"};
       cbsemester = new JComboBox(semester);
       cbsemester.setBounds(200 , 260 , 150 , 20);
       cbsemester.setBackground(Color.WHITE);
       add(cbsemester);
       
       JLabel lbltotal = new JLabel("Total Payable");
        lbltotal.setBounds(40 , 300 , 150 , 20);
        lbltotal.setFont(new Font("Tahoma" , Font.BOLD , 16));
        add(lbltotal);
                
                
        labltotal = new JLabel();
        labltotal.setBounds(200 , 300 , 150 , 20);
        labltotal.setFont(new Font("Tahoma" , Font.PLAIN , 16));
        add(labltotal); 
        
        
        update = new JButton("Update");  
          update.setBounds(30 , 380 , 100 , 25);
             update.setBackground(Color.black);
             update.setForeground(Color.white);
             update.setFont(new Font("Tahoma" , Font.BOLD , 15));
             update.addActionListener(this);
               add(update);
       
    
                  pay = new JButton("Pay Fee");  
           pay.setBounds(150 , 380 , 100 , 25);
             pay.setBackground(Color.black);
             pay.setForeground(Color.white);
           pay.addActionListener(this);
             pay.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(pay);
        
         back = new JButton("Back");  
           back.setBounds(270 , 380 , 100 , 25);
             back.setBackground(Color.black);
             back.setForeground(Color.white);
           back.addActionListener(this);
             back.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(back);
        
        
        
         
         
         setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == update){
            String course = (String)cbcourse.getSelectedItem();
            String semester = (String)cbsemester.getSelectedItem();
            
            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from fees where course= '"+course+"'");
                while(rs.next()){
                    
                    labltotal.setText(rs.getString(semester));
                }
            }   catch(Exception e){
                e.printStackTrace();
            }
            
        } else if(ae.getSource()== pay){
            String rollno = crollno.getSelectedItem();
            String course = (String)cbcourse.getSelectedItem();
            String semester = (String)cbsemester.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();
            String total = labltotal.getText();
            
             try{
                Conn c = new Conn();

                String query = "insert into collegefee values('"+rollno+"' , '"+course+"' , '"+branch+"', '"+semester+"', '"+total+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null , "College Fee Submited Successfully");
               setVisible(false);
               
               
             }   catch(Exception e){
                e.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
           new FeeForm();
    }
    
}
