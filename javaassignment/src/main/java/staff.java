

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
    private report report;
    private feedback feedback;

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

    public staff(String Fullname, int ID, report report) {
        this.Fullname = Fullname;
        this.ID = ID;
        this.report = report;
    }
    
   public staff(String Fullname, int ID, feedback feedback){
       this.Fullname = Fullname;
       this.ID = ID;
       this.feedback = feedback;
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
    

    public String[] verifylogin(String position, String username1, String password1){
            
        String[] returnstring = null;
        
        try{
        File file1 = new File ("assi.txt");
        sc = new Scanner(file1);
        String temp;
        String Role = String.valueOf(position);
        boolean found =false;
        while(sc.hasNext()&& !found){
            temp=sc.nextLine();
            String []tempArr = temp.split(",");
            if(username1.equals(tempArr[1]) && password1.equals(tempArr[2]) && Role.equals(tempArr[7])){
                found =true;
               if (Role=="Delivery staff"){
               returnstring = new String[]{"Login Successful","Delivery staff",tempArr[0],tempArr[1],tempArr[2]};
               }
                    else 
                    {
                    returnstring = new String[]{"Login Successful","Managing staff",tempArr[0],tempArr[1],tempArr[2]};
                    }
               
               }
            }
                
        
        
        if (found == false){
                    
        returnstring=new String[]{
         "Username and Password not found."   
        };
        }
        }
        catch(FileNotFoundException ex){
            ex.toString();
          // TODO add your handling code here:
    }
        finally{
             sc.close();
        }
        return returnstring;
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
           
            
            pw.flush();
            pw.close();
            
        }
        catch(Exception e){
            System.out.println("Error" + e);

        }
        finally{
        sc.close();
        oldfile.delete();
            File dump = new File(filepath);
            newfile.renameTo(dump);
            System.out.println("success");
    }
        }
            public void addReport()
    {
                FileWriter file = null;
            try{
                System.out.println("hi");
                 file = new FileWriter("report.txt", true);
            PrintWriter pw = new PrintWriter (file);
            pw.print(this.ID+",");
            pw.print(this.Fullname+",");
            pw.print(report);
            pw.print("\n");
            file.close();
            System.out.println("success");
            }
                catch(IOException es){
                    System.out.println(es.toString());
            }
           
    }
            public void addFeedback()
    {
                FileWriter file = null;
            try{
                System.out.println("hi");
                 file = new FileWriter("feedback.txt", true);
                PrintWriter pw = new PrintWriter (file);
                pw.print(this.ID+",");
                pw.print(this.Fullname+",");
                pw.print(feedback);
                pw.print("\n");
                file.close();
                System.out.println("success");
                }
                    catch(IOException es)
                {
                    System.out.println(es.toString());
                }
            
                        
            //////public void addfeedback(){}
    }
            

               
}
class managingStaff extends staff{
        private String shift;
        private order order;
        private feedback feedback;
    public managingStaff(String shift) {
        this.shift = shift;
    }

    public managingStaff(String shift, String Fullname, int ID, String Password, int Age, String PN, String Email, String Position, String Gender) {
        super(Fullname, ID, Password, Age, PN, Email, Position, Gender);
        this.shift = shift;
    }
    public managingStaff(order order){
        this.order = order;
    }
    public managingStaff(feedback feedback){
        this.feedback =feedback;
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

        private static Scanner sc;
        public void deleteuser(String id, String filepath){
            
        String tempfile="Tempfile.txt";
        File oldfile= new File(filepath);   
        File newfile= new File(tempfile);   
         String ID1=""; String user=""; String pas =""; String age1 = ""; String gen1=""; String pn =""; String mail=""; String rol="";String pos="";
        try{
            FileWriter fw= new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            sc = new Scanner(new File(filepath));
            
               String temp;
            while(sc.hasNext())
            {
                temp=sc.nextLine();
                String []tempArr = temp.split(",");  
                ID1=tempArr[0];
                user=tempArr[1];
                pas =tempArr[2];
                age1=tempArr[3];
                gen1=tempArr[4];
                pn=tempArr[5];
                mail=tempArr[6];
                rol=tempArr[7];
                pos=tempArr[8];
             if(ID1.equals(id))
             {
              
             }
                else
                {  
                    pw.println(ID1 + "," + user + "," + pas + "," + age1 + "," + gen1 + "," + pn + "," + mail + "," + rol + "," + pos);
                }
             
            }
           
            
            pw.flush();
            pw.close();
           
          
            
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
            finally
        {
            sc.close();
            
            oldfile.delete();
            File dump = new File(filepath);
            newfile.renameTo(dump);
        }
            
            
        }
        
        public void deletereport(String id, String filepath){
            
        String tempfile="Tempfile.txt";
        File oldfile= new File(filepath);   
        File newfile= new File(tempfile);   
         String userid=""; String name=""; String reportid =""; String title = ""; String content ="";
        try{
            FileWriter fw= new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            sc = new Scanner(new File(filepath)) ;
            
               String temp;
            while(sc.hasNext())
            {
                temp=sc.nextLine();
                String []tempArr = temp.split(",");  
                userid=tempArr[0];
                name=tempArr[1];
                reportid =tempArr[2];
                title=tempArr[3];
                content=tempArr[4];
                
             if(reportid.equals(id))
             {
              
             }
                else
                {  
                    pw.println(userid + "," + name + "," + reportid + "," + title + "," + content);
                }
             
            }
           
            
            pw.flush();
            pw.close();
           
          
            
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
            finally
        {
            sc.close();
            
            oldfile.delete();
            File dump = new File(filepath);
            newfile.renameTo(dump);
        }
            
            
        }
        
        public void deletefeedback(String id, String filepath, String filepath1, String status1)
    {
            
        String tempfile="Tempfile.txt";
        String tempfile1="Tempfile2.txt";
        File oldfile= new File(filepath);
        File oldfile1= new File(filepath1);
        File newfile= new File(tempfile);
        File newfile1=new File(tempfile1);
        String userID=""; String name=""; String fbID=""; String title = ""; String content=""; String status ="";
        String replyID=""; String reply="";
        
         if(status1.equals("Replied"))
        {
         
         try{
                FileWriter fw= new FileWriter(tempfile1, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                sc = new Scanner(new File(filepath1)) ;

                   String temp;

                    while(sc.hasNext())
                    {
                        temp=sc.nextLine();
                        String []tempArr = temp.split(",");
                        fbID=tempArr[0];
                        replyID=tempArr[1];
                        reply =tempArr[2];

                        if(fbID.equals(id))
                        {

                        }
                            else
                            {
                               pw.println(fbID + "," + replyID + "," + reply);
                            }

                    }


                pw.flush();
                pw.close();
            }
                catch(Exception e)
                {
                    System.out.println("Error");
                }
                    finally
                    {
                        sc.close();
                        oldfile1.delete();
                        File dump = new File(filepath1);
                        newfile1.renameTo(dump);
                    }
         
            try
            {   
                FileWriter fw1= new FileWriter(tempfile, true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                PrintWriter pw1 = new PrintWriter(bw1);
                sc = new Scanner(new File(filepath)) ;

                   String temp;

                while(sc.hasNext())
                {
                    temp=sc.nextLine();
                    String []tempArr = temp.split(",");
                    userID=tempArr[0];
                    name=tempArr[1];
                    fbID =tempArr[2];
                    title=tempArr[3];
                    content=tempArr[4];
                    status=tempArr[5];

                    if(fbID.equals(id))
                    {

                    }
                       else
                        {
                           pw1.println(userID + "," + name + "," +fbID + "," + title + "," +content+ "," + status);
                        }

            }
           
            
            pw1.flush();
            pw1.close();
           
          
            
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
                finally
                {
                    sc.close();
                    oldfile.delete();
                    File dump1 = new File(filepath);
                    newfile.renameTo(dump1);
                }
        }
         else
        {
            try
            {
                FileWriter fw2= new FileWriter(tempfile, true);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                PrintWriter pw2 = new PrintWriter(bw2);
                sc = new Scanner(new File(filepath)) ;

                   String temp;

                while(sc.hasNext())
                {
                    temp=sc.nextLine();
                    String []tempArr = temp.split(",");
                    userID=tempArr[0];
                    name=tempArr[1];
                    fbID =tempArr[2];
                    title=tempArr[3];
                    content=tempArr[4];
                    status=tempArr[5];

                    if(fbID.equals(id))
                    {

                    }
                       else
                       {
                           pw2.println(userID + "," + name + "," +fbID + "," + title + "," +content+ "," + status);
                       }

                }
           
            
                pw2.flush();
                pw2.close();
                
                
            
            }
            catch(Exception e)
                {
                    System.out.println("Error");
                }
                    finally
                    {
                        sc.close();
                        oldfile.delete();
                        File dump2 = new File(filepath);
                        newfile.renameTo(dump2);
                    }
        }
    }
        
        public void deleteorder(String id, String filepath, String filepath1)
    {
            
        String tempfile="Tempfile.txt";
        String tempfile1="Tempfile2.txt";
        File oldfile= new File(filepath);
        File oldfile1= new File(filepath1);
        File newfile= new File(tempfile);
        File newfile1=new File(tempfile1);
        String orderid=""; String owner=""; String weight=""; String date= ""; String status=""; String price ="";
        String delid=""; String date1=""; String status1=""; String add="";String staffid="";
         
         try{
                FileWriter fw= new FileWriter(tempfile1, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                sc = new Scanner(new File(filepath1)) ;

                   String temp;

                    while(sc.hasNext())
                    {
                        temp=sc.nextLine();
                        String []tempArr = temp.split(",");
                        orderid=tempArr[0];
                        owner=tempArr[1];
                        weight =tempArr[2];
                        date=tempArr[3];
                        status=tempArr[4];
                        price=tempArr[5];

                        if(orderid.equals(id))
                        {

                        }
                            else
                            {
                               pw.println(orderid + "," + owner + "," + weight+ "," + date + "," + status + "," + price );
                            }

                    }


                pw.flush();
                pw.close();
            }
                catch(Exception e)
                {
                    System.out.println("Error");
                }
                    finally
                    {
                        sc.close();
                        oldfile1.delete();
                        File dump = new File(filepath1);
                        newfile1.renameTo(dump);
                    }
         
            try
            {   
                FileWriter fw1= new FileWriter(tempfile, true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                PrintWriter pw1 = new PrintWriter(bw1);
                sc = new Scanner(new File(filepath)) ;

                   String temp;

                while(sc.hasNext())
                {
                    temp=sc.nextLine();
                    String []tempArr = temp.split(",");
                    delid=tempArr[0];
                    date1=tempArr[1];
                    status1 =tempArr[2];
                    add=tempArr[3];
                    orderid=tempArr[4];
                    staffid=tempArr[5];

                    if(orderid.equals(id))
                    {

                    }
                       else
                        {
                           pw1.println(delid + "," + date1 + "," + status1 + "," + add + "," + orderid + "," + staffid );
                        }

            }
           
            
            pw1.flush();
            pw1.close();
           
          
            
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
                finally
                {
                    sc.close();
                    oldfile.delete();
                    File dump1 = new File(filepath);
                    newfile.renameTo(dump1);
                }
        
    }     
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
                 pw.println(this.ID + "," + this.Fullname + "," + this.Password + "," + + this.Age + "," +gen + "," + this.PN + "," + this.Email + "," + rol + "," + this.shift);
             
             }
             else{  
                 pw.println(ID1 + "," + user + "," + pas + "," + age1 + "," + gen + "," + pn + "," + mail + "," + rol + "," + shift);
               
             }
             
            }
           
            
            pw.flush();
            pw.close();
            
        }
        catch(Exception e){
            System.out.println("Error" + e);

        }
        finally{
        sc.close();
        oldfile.delete();
            File dump = new File(filepath);
            newfile.renameTo(dump);
            System.out.println("success");
        }
        }
        public void RegisterOrder(int IDDe){
             FileWriter file = null;
            try{
                 file = new FileWriter("order.txt", true);
                PrintWriter pw = new PrintWriter (file);
                pw.print(order.toString());
                pw.print("\n");
                file.close();
                System.out.println("success");
                }
                    catch(IOException es){
                        System.out.println(es.toString());
                }
            try{
                 file = new FileWriter("delivery.txt", true);
                PrintWriter pw = new PrintWriter (file);
                pw.print(order.getdelivery()+",");
                pw.print(order.getID()+",");
                pw.print(IDDe);
                pw.print("\n");
                file.close();
                System.out.println("success2");
                }
                    catch(IOException es){
                        System.out.println(es.toString());
                }
        }
            public void addReply()
        {
            FileWriter file = null;
            try{
                 file = new FileWriter("feedbackreply.txt", true);
            PrintWriter pw = new PrintWriter (file);
            pw.print(feedback.getID()+",");
            pw.print(feedback.getReply2());
            pw.print("\n");
            file.close();
            System.out.println("success");
            }
            catch(IOException es){
                    System.out.println(es.toString());
        }
            FileWriter fw=null;
            String tempfile="Tempfile.txt";
         String filepath="feedback.txt";
        File oldfile= new File(filepath);   
        File newfile= new File(tempfile);   
        String staffid=""; String name=""; String feedbackid=""; String title =""; String content = ""; String status ="";
        try{
            fw= new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            sc = new Scanner(new File(filepath)) ;
            
               String temp;
            while(sc.hasNext()){
            temp=sc.nextLine();
            String []tempArr = temp.split(",");  
                staffid=tempArr[0];
                name=tempArr[1];
                feedbackid =tempArr[2];
                title=tempArr[3];
                content=tempArr[4];
                status=tempArr[5];
             if(feedbackid.equals(Integer.toString(feedback.getID()))){
                 pw.println(staffid + "," + name + "," + feedbackid + ","  + title + "," +content + "," + "Replied");
             
             }
             else{  
                 pw.println(staffid + "," + name + "," + feedbackid + ","  + title + "," +content + "," + status);
               
             }
             
            }

            pw.flush();
            pw.close();
            
            
        }
        catch(Exception e){
            System.out.println("Error" + e);

        }
        finally{
        sc.close();
        oldfile.delete();
        File dump = new File(filepath);
            newfile.renameTo(dump);
            System.out.println("success");
    }
        }
                    
        
    }
class deliveryStaff extends staff{
        private String Assignedtransport;
        private order order;
    public deliveryStaff(String Assignedtransport) {
        this.Assignedtransport = Assignedtransport;
    }

    public deliveryStaff(String Assignedtransport, String Fullname, int ID, String Password, int Age, String PN, String Email, String Position, String Gender) {
        super(Fullname, ID, Password, Age, PN, Email, Position, Gender);
        this.Assignedtransport = Assignedtransport;
    }
    public deliveryStaff(){}
    
    public deliveryStaff(order order){
    this.order=order;
    };
       

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
        
        private static Scanner sc;
        private static Scanner sc2;
        public void updatedelivery(int id){
            FileWriter fw=null;
            String tempfile="Tempfile.txt";
     String filepath="delivery.txt";
        File oldfile= new File(filepath);   
        File newfile= new File(tempfile);   
        String ID1=""; String Date=""; String Status=""; String Address =""; String orderID = ""; String StaffID ="";
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
                Date=tempArr[1];
                Status=tempArr[2];
                Address=tempArr[3];
                orderID=tempArr[4];
                StaffID=tempArr[5];
                
             if(orderID.equals(Integer.toString(id))){
                 pw.println(ID1 + "," + Date + "," + "Complete" + "," +  Address + "," +orderID + "," + StaffID );
             
             }
             else{  
                 pw.println(ID1 + "," + Date + "," + Status + "," +  Address + "," +orderID + "," + StaffID );
               
             }
             
            }
           
            
            pw.flush();
            pw.close();
            
        }
        catch(Exception e){
            System.out.println("Error" + e);

        }
        finally{
        sc.close();
        oldfile.delete();
            File dump = new File(filepath);
            newfile.renameTo(dump);
            System.out.println("success");
        }
        FileWriter fw2=null;
            String tempfile2="Tempfile2.txt";
     String filepath2="order.txt";
        File oldfile2= new File(filepath2);   
        File newfile2= new File(tempfile2);   
        String ID2="";String name = ""; String Weight ="";  String Date2=""; String Status2=""; String price ="";
        try{
            fw2= new FileWriter(tempfile2, true);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            PrintWriter pw2 = new PrintWriter(bw2);
            sc2 = new Scanner(new File(filepath2)) ;
            
               String temp;
            while(sc2.hasNext()){
            temp=sc2.nextLine();
            String []tempArr = temp.split(",");  
                ID2=tempArr[0];
                name=tempArr[1];
                Weight=tempArr[2];
                Date2=tempArr[3];
                Status2=tempArr[4];
                price=tempArr[5];
                
             if(ID2.equals(Integer.toString(id))){
                 pw2.println(ID2 + "," + name + "," + Weight + "," +  Date2 + "," + "Done" + "," + price );
             
             }
             else{  
                 pw2.println(ID2 + "," + name + "," + Weight + "," +  Date2 + "," + Status2 + "," + price );
               
             }
             
            }
           
            
            pw2.flush();
            pw2.close();
            
        }
        catch(Exception e){
            System.out.println("Error" + e);

        }
        finally{
        sc2.close();
            oldfile2.delete();
            File dump2 = new File(filepath2);
            newfile2.renameTo(dump2);
            System.out.println("success2");
        }
        }
        
    }



