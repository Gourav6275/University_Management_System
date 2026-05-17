
package university_management_system; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    
    Project(){
        
        setSize(1372 , 770);
        //IMAGE
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
         Image i2 =  i1.getImage().getScaledInstance(1500, 680, Image.SCALE_DEFAULT);   
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3); 
         add(image); 
         
        
           //MENU BANANE KE LIYE         
           JMenuBar mb = new JMenuBar(); 
         
           // MENU ADD KERNE KE LIye  
           JMenu newInformation = new JMenu("New Information"); 
           newInformation.setForeground(Color.blue);
           mb.add(newInformation);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
          facultyInfo.setBackground(Color.white);
          facultyInfo.addActionListener(this);
          newInformation.add(facultyInfo);
         
          
         JMenuItem studentInfo = new JMenuItem("New Student Information");
          studentInfo.setBackground(Color.white);
          studentInfo.addActionListener(this);
          newInformation.add(studentInfo);  
          
          
          // SECOND MENU KE LIYE 
           JMenu Details = new JMenu("View Details"); 
           Details.setForeground(Color.red);
           mb.add(Details);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
          facultyDetails.setBackground(Color.white);
          facultyDetails.addActionListener(this);

          Details.add(facultyDetails);
         
          
         JMenuItem studentDetails = new JMenuItem("View Student Details");
          studentDetails.setBackground(Color.white);
          studentDetails.addActionListener(this);
          Details.add(studentDetails);  
          
            //LEAVE
          
             JMenu leave = new JMenu("Apply Leave"); 
           leave.setForeground(Color.blue);
           mb.add(leave);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
          facultyLeave.setBackground(Color.white);
          facultyLeave.addActionListener(this);

          leave.add(facultyLeave);
         
          
         JMenuItem studentleave = new JMenuItem("Student Leave");
          studentleave.setBackground(Color.white);
          studentleave.addActionListener(this);
          leave.add(studentleave);  
        
           //LEAVE DETAILS
             JMenu leaveDetails = new JMenu("Leave Details"); 
           leaveDetails.setForeground(Color.red);
           mb.add(leaveDetails);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem facultyLeaveDetails     = new JMenuItem("Faculty Leave Details");
          facultyLeaveDetails.setBackground(Color.white);
          facultyLeaveDetails.addActionListener(this);

          leaveDetails.add(facultyLeaveDetails);
         
          
         JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
          studentleaveDetails.setBackground(Color.white);
          studentleaveDetails.addActionListener(this);

          leaveDetails.add(studentleaveDetails);  
          
          //EXAMINATION DETAILS
         JMenu exam = new JMenu("Examination"); 
           exam.setForeground(Color.blue);
           mb.add(exam);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem examinationDetails     = new JMenuItem("Examination Results");
          examinationDetails.setBackground(Color.white);
          examinationDetails.addActionListener(this);
          exam.add(examinationDetails);
         
          
         JMenuItem enterMarks = new JMenuItem("Enter Marks");
          enterMarks.setBackground(Color.white);
          enterMarks.addActionListener(this);
          exam.add(enterMarks);  
          
          //UPDATE INFO
          JMenu UpdateInfo = new JMenu("Update Details"); 
           UpdateInfo.setForeground(Color.red);
           mb.add(UpdateInfo);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem UpdateFacultyInfo     = new JMenuItem("Update Faculty Details");
          UpdateFacultyInfo.setBackground(Color.white);
          UpdateFacultyInfo.addActionListener(this);
          UpdateInfo.add(UpdateFacultyInfo);
         
          
         JMenuItem UpdateStudentInfo = new JMenuItem("Update Student Details");
          UpdateStudentInfo.setBackground(Color.white);
          UpdateStudentInfo.addActionListener(this);
          UpdateInfo.add(UpdateStudentInfo);  
          
         //FEE
          JMenu Fee = new JMenu("Fee Details"); 
           Fee.setForeground(Color.blue);
           mb.add(Fee);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem FeeStructure     = new JMenuItem("Fee Structure");
          FeeStructure.setBackground(Color.white);
          FeeStructure.addActionListener(this);
          Fee.add(FeeStructure);
         
          
         JMenuItem FeeForm = new JMenuItem("Student Fee Form");
          FeeForm.setBackground(Color.white);
          FeeForm.addActionListener(this);
          Fee.add(FeeForm);   
         
          //Utility
          JMenu Utility = new JMenu("Utility"); 
           Utility.setForeground(Color.red);
           mb.add(Utility);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem notepad     = new JMenuItem("Notepad");
          notepad.setBackground(Color.white);
          notepad.addActionListener(this);
          Utility.add(notepad);
         
          
         JMenuItem calc = new JMenuItem("Calculator");
          calc.setBackground(Color.white);
          calc.addActionListener(this);
          Utility.add(calc);  
          
        JMenu about = new JMenu("About"); 
           about.setForeground(Color.blue);
           mb.add(about);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem ab     = new JMenuItem("About");
          ab.setBackground(Color.white);
          ab.addActionListener(this);
          about.add(ab);

         //EXIT
         JMenu exit = new JMenu("Exit"); 
           exit.setForeground(Color.red);
           mb.add(exit);
          //MENU BAAR ME ITEM ADD KERNA
          JMenuItem ex     = new JMenuItem("Exit");
          ex.setBackground(Color.white);
          ex.addActionListener(this);
          exit.add(ex);
         
        
          
          setJMenuBar(mb);             
         setVisible(true);

                    
        
    }
    
    public void actionPerformed(ActionEvent ev){
        String msg = ev.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        } else if(msg.equals("Calculator")){
            try{
               Runtime.getRuntime().exec("calc.exe");
            } catch(Exception e){
                
            }
        } else if(msg.equals("Notepad")){
            try{
               Runtime.getRuntime().exec("notepad.exe");
            } catch(Exception e){
                
            }
        } else if(msg.equals("New Faculty Information")){
            new AddTeachar();
        } else if(msg.equals("New Student Information")){
            new AddStudent();   
        } else if(msg.equals("View Faculty Details")){
            new TeacherDetails();   
        }else if(msg.equals("View Student Details")){
            new StudentDetails();   
        }else if(msg.equals("Faculty Leave")){
            new TeacherLeave();   
        }else if(msg.equals("Student Leave")){
            new StudentLeave();   
        }else if(msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();   
        }else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();   
        }else if(msg.equals("Update Faculty Details")){
            new UpdateTeacher();   
        }else if(msg.equals("Update Student Details")){
            new UpdateStudent();   
        } else if(msg.equals("Enter Marks")){
            new EnterMarks();   
    }else if(msg.equals("Examination Results")){
            new ExaminationDetails();   
    }else if(msg.equals("Fee Structure")){
            new FeeStructure();   
    }else if(msg.equals("About")){
            new About();   
    }else if(msg.equals("Student Fee Form")){
            new FeeForm();
    
    }
    }
    
    
    
    
    public static void main(String[] args) {
       new Project(); 
       
      
       
    }
            
    
}
