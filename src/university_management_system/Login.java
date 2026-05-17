package university_management_system;
import java.awt.Color;
  import javax.swing.*;
  import java.awt.*;
 import java.awt.event.*;
 import java.sql.*;
  public class Login extends JFrame implements ActionListener{
    JButton login , cancel;
    JTextField tfusername , tfpassword;
    Login(){
        // frame ka clr change kerne ke liye function 
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        // JLabel class fram per kuch bhi print kerne ke liye hota hai
        JLabel lblusername = new JLabel("Username");
        
        lblusername.setBounds(40 , 20 , 100 , 20);
       // fram per show karane ke liye
        add(lblusername);
        
        // -> user input dalega uska field banane ke liye 
        
         tfusername = new JTextField();
        tfusername.setBounds(150 , 20 , 150 , 20);
        add(tfusername);
        
        
        // PASSWORD BANANE KE LIYE BHI SAME CODE HOGA
        JLabel lblpassword = new JLabel("Password ");
        
        lblpassword.setBounds(40 , 70 , 100 , 20);
      
        add(lblpassword);
         tfpassword = new JPasswordField ();
        tfpassword.setBounds(150 , 70 , 150 , 20);
        add(tfpassword);
        
          // BUTTON BANANE KI CLASS HOTI HAI JBUTTON 
          //LOGIN BUTTON  
           login = new JButton("Login");  
          login.setBounds(40 , 140 , 120 , 30);
             login.setBackground(Color.black);
             login.setForeground(Color.white);
            login.addActionListener(this);
             login.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(login);
    
          //CANCEL BUTTON
           cancel = new JButton("Cancel");  
          cancel.setBounds(180 , 140 , 120 , 30);
             cancel.setBackground(Color.black);
             cancel.setForeground(Color.white);
             cancel.addActionListener(this);

             cancel.setFont(new Font("Tahoma" , Font.BOLD , 15));
               add(cancel);
               
          //IMAGE
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
         Image i2 =  i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT); 
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(350 , -10 , 200 , 200);
         add(image);
               
               
               
               
               
               
          
        //frame ka size
        setSize(600 , 300); 
     // frame ki location
        setLocation(500 , 250);
      // frame ko dikhane ke liye setVisible ko true kerna padta hai
        setVisible(true);
   }
    
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == login){
                String username = tfusername.getText();
                String password = tfpassword.getText(); 
                
                String query = "select * from login where username='"+username+"' and password='"+password+"'";
                
                try{
                    Conn c = new Conn();
                   ResultSet rs =  c.s.executeQuery(query); 
                   
                   if(rs.next()){
                       setVisible(false);
                       new Project();
                   }else {
                       JOptionPane.showMessageDialog(null , "Invalid username or password");
                       setVisible(false);
                   }
                 
                }catch(Exception e){
                e.printStackTrace();
                }
                
            }else if(ae.getSource() == cancel){
                setVisible(false);
                
            }
            
        }

    
    public static void main(String[] args) {
        
        
        new Login();
    }
    
}
