

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class staff {
    protected String Fullname;
    protected int ID;
    protected String Password;
    protected int Age;
    protected String PN;
    protected String Email;
    protected String Position;
    protected String Gender;
    public staff(){}
    public staff(String Fullname, int ID, String Password, int Age, String PN, String Email, String Position, String Gender) {
        this.Fullname = Fullname;
        this.ID = ID;
        this.Password = Password;
        this.Age = Age;
        this.PN = PN;
        this.Email = Email;
        this.Position = Position;
        this.Gender = Gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPN() {
        return PN;
    }

    public void setPN(String PN) {
        this.PN = PN;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
    
    public int generateID(){
         FileWriter file = null;
        try{
         BufferedReader reader = new BufferedReader(new FileReader("assi.txt"));
                int lines = 0;
                while (reader.readLine() != null){ lines++;}
                reader.close();
                return lines;
                }
             catch(IOException es){
                System.out.println(es.toString());  
                return 22;
        }
    }
    private static Scanner sc;
    public void updateprofile(){
            FileWriter fw=null;
            String tempfile="Tempfile.txt";
     String filepath="assi.txt";
        File oldfile= new File(filepath);   
        File newfile= new File(tempfile);   
        String gen=""; String ID1=""; String user=""; String pas =""; String age1 = ""; String pn =""; String mail=""; String rol="";String shift=""; 
        try{
            fw= new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            sc = new Scanner(new File(filepath)) ;
            
               String temp;
            while(sc.hasNext()){
            temp=sc.nextLine();
            String []tempArr = temp.split(",");  
                ID1=tempArr[0];
                user=tempArr[1];
                pas =tempArr[2];
                age1=tempArr[3];
                gen=tempArr[4];
                pn=tempArr[5];
                mail=tempArr[6];
                rol=tempArr[7];
                shift=tempArr[8];
             if(ID1.equals(Integer.toString(this.ID))){
                 pw.println(this.ID + "," + this.Fullname + "," + this.Password + "," + + this.Age + "," +gen + "," + this.PN + "," + this.Email + "," + rol + "," + shift);
             
             }
             else{  
                 pw.println(ID1 + "," + user + "," + pas + "," + age1 + "," + gen + "," + pn + "," + mail + "," + rol + "," + shift);
               
             }
             
            }
           
            sc.close();
            pw.flush();
            pw.close();
            oldfile.delete();
            File dump = new File(filepath);
            newfile.renameTo(dump);
            System.out.println("success");
        }
        catch(Exception e){
            System.out.println("Error" + e);

        }
        }
}
class managingStaff extends staff{
        private String shift;

    public managingStaff(String shift) {
        this.shift = shift;
    }

    public managingStaff(String shift, String Fullname, int ID, String Password, int Age, String PN, String Email, String Position, String Gender) {
        super(Fullname, ID, Password, Age, PN, Email, Position, Gender);
        this.shift = shift;
    }
    public managingStaff(){}
        

        public String getShift() {
            return shift;
        }

        public void setShift(String shift) {
            this.shift = shift;
        }
        public void addmanagingstaff(){
            FileWriter file = null;
            try{
                 file = new FileWriter("assi.txt", true);
            PrintWriter pw = new PrintWriter (file);
            pw.print(this.ID+",");
            pw.print(this.Fullname+",");
            pw.print(this.Password+",");
            pw.print(this.Age+",");
            pw.print(this.Gender+",");
            pw.print(this.PN+",");
            pw.print(this.Email+",");
            pw.print(this.Position+",");
            pw.print(this.shift);
            pw.print("\n");
            file.close();
            System.out.println("success");
            }
                catch(IOException es){
                    System.out.println(es.toString());
        }
        }
        
    }
class deliveryStaff extends staff{
        private String Assignedtransport;

    public deliveryStaff(String Assignedtransport) {
        this.Assignedtransport = Assignedtransport;
    }

    public deliveryStaff(String Assignedtransport, String Fullname, int ID, String Password, int Age, String PN, String Email, String Position, String Gender) {
        super(Fullname, ID, Password, Age, PN, Email, Position, Gender);
        this.Assignedtransport = Assignedtransport;
    }
    public deliveryStaff(){}
        
       

        public String getAssignedtransport() {
            return Assignedtransport;
        }

        public void setAssignedtransport(String Assignedtransport) {
            this.Assignedtransport = Assignedtransport;
        }
        public void adddeliverystaff(){
            FileWriter file = null;
            try{
                 file = new FileWriter("assi.txt", true);
            PrintWriter pw = new PrintWriter (file);
            pw.print(this.ID+",");
            pw.print(this.Fullname+",");
            pw.print(this.Password+",");
            pw.print(this.Age+",");
            pw.print(this.Gender+",");
            pw.print(this.PN+",");
            pw.print(this.Email+",");
            pw.print(this.Position+",");
            pw.print(this.Assignedtransport);
            pw.print("\n");
            file.close();
            System.out.println("success");
            }
                catch(IOException es){
                    System.out.println(es.toString());
        }
        }
        
    }

  
