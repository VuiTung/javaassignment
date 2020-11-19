
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
public class Fileoperator {
        public Fileoperator(){}
        private static Scanner sc;
    public String[] returnuserdetail(String name){
        String[] Userdetail = null;
        try{
       File file1 = new File ("assi.txt");
        sc = new Scanner(file1);
       String temp;
       boolean found =false;
        while(sc.hasNext()&& !found){
            temp=sc.nextLine();
            String []tempArr = temp.split(",");            
            if(name.equals(tempArr[1])){
                String id =tempArr[0];
                String age = tempArr[3];
                String PN = tempArr[5];
                String email = tempArr[6];
                String password = tempArr[2];
                String Shifttransport = tempArr[8];
                found = true;
                Userdetail = new String[]{name, id, age, PN, email, password, Shifttransport};
                }
            }
        
       }catch (FileNotFoundException ex){
           ex.toString();
       }finally{
            sc.close();
        }
        return Userdetail;
    }

    public String[][] returnuserlist() {
        long row =0;
        Path path = Paths.get("assi.txt");
        try {

          // much slower, this task better with sequence access
          //lines = Files.lines(path).parallel().count();

          row = Files.lines(path).count();
          
      } catch (IOException e) {
          e.printStackTrace();
      }
        int lines =(int)row;
      
          String[][] Userlist = new String[9][lines+1];
          Userlist[0][0] = Integer.toString(lines); 
           try {
          BufferedReader in = new BufferedReader(new FileReader("assi.txt"));

    String line;
    int x = 1;
    int y = 0;
    while ((line = in.readLine()) != null)  //file reading
    {
       String[] values = line.split(",");
       y=0;
       for (String str : values){   
           Userlist[y][x] = str; 

           y += 1; 
       }

       x += 1;

    }
    in.close();
} catch (IOException e) {
          e.printStackTrace();
      }

        return Userlist;
    }
    
        public String[][] returnfeedback() {
        long row =0;
        Path path = Paths.get("feedback.txt");
        try {
          // much slower, this task better with sequence access
          //lines = Files.lines(path).parallel().count();
          row = Files.lines(path).count();
          
      } catch (IOException e) {
          e.printStackTrace();
      }
        int lines =(int)row;
      
          String[][] feedbacklist = new String[6][lines+1];
          feedbacklist[0][0] = Integer.toString(lines); 
        try 
           {
            BufferedReader in = new BufferedReader(new FileReader("feedback.txt"));

              String line;
              int x = 1;
              int y = 0;
              while ((line = in.readLine()) != null)  //file reading
              {
                 String[] values = line.split(",");
                 y=0;
                 for (String str : values){   
                     feedbacklist[y][x] = str; 

                     y += 1; 
                 }

                 x += 1;

              }
              in.close();
            } 
        catch (IOException e) 
        {
          e.printStackTrace();
        }

        return feedbacklist;
    }
    
    public int generateID(int i, String filename){
        FileWriter file = null;
        int lines =0;
        try{
         BufferedReader reader = new BufferedReader(new FileReader(filename));
               String line;
                while ((line=reader.readLine()) != null){ lines++;
                 String[] values = line.split(",");
                lines=Integer.parseInt(values[i]);
                }
                reader.close();
                
                }
             catch(IOException es){
                System.out.println(es.toString());  
                
        }
        return lines + 1;
    }
    
    
    
   public boolean checkPosition(String name)
    {
            boolean X = false;
            try
        {
            
            File file1 = new File ("assi.txt");
            sc = new Scanner(file1);
            String temp;
            boolean found =false;
            String role =  "Delivery staff";
            while(sc.hasNext()&& !found){
            temp=sc.nextLine();
            String []tempArr = temp.split(",");
            if(name.equals(tempArr[1])){
                found =true;
               if (role.equals(tempArr[7])){
               X = true;
               }
                    else 
                    {
                    X = false;
                    }
               
               }
            }
        }
                catch(IOException es)
            {
                System.out.println(es.toString());  
            }
            finally{
             sc.close();
        }
            return X;
    }

    public int[] autoassign(){

        int lines  = 0;
        try 
           {
            BufferedReader in = new BufferedReader(new FileReader("assi.txt"));

              String line;
              while ((line = in.readLine()) != null)  //file reading
              {
                 String[] values = line.split(",");

                 if(values[7].equals("Delivery staff")){
                     lines+=1;

                 }
              }
              in.close();
            } 
        catch (IOException e) 
        {
          e.printStackTrace();
        }

        int[][] deliverylist = new int[2][lines];
        try 
           {
            BufferedReader in = new BufferedReader(new FileReader("assi.txt"));

              String line;
              int x = 0;
              while ((line = in.readLine()) != null)  //file reading
              {
                 String[] values = line.split(",");
                 if(values[7].equals("Delivery staff")){
                     deliverylist[0][x] = Integer.parseInt(values[0]); 
                     deliverylist[1][x] = 0;
                    x++;}
              }
              in.close();
            } 
        catch (IOException e) 
        {
          e.printStackTrace();
        }

        int days =0;
        try 
           {
            
                String line;
               BufferedReader in=null;
              DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
                LocalDateTime now = LocalDateTime.now(); 
                boolean full = true;
                
                while(full ==true){
                    int k =0;
                int g =0;
                  in=  new BufferedReader(new FileReader("delivery.txt"));
                   
                days+=1;

                LocalDateTime tomorrow = now.plusDays(days);
                String date = dtf.format(tomorrow);


              while ((line = in.readLine()) != null)  //file reading
              {
                 String[] values = line.split(",");
                 for(int j=0; j<lines; j++){
                     if(Integer.parseInt(values[5])==deliverylist[0][j]&&values[1].equals(date)){
                     deliverylist[1][j]=deliverylist[1][j] +1;
                     
                 }
                     
                }
              }

              while(k<lines && full==true){

                    if(deliverylist[1][k]==5){
                     full = true;
                 }else{
                      full = false;  
                    }
                    k+=1;
                }
              if(full==true){
                  while(g<lines){
                      deliverylist[1][g]=0;
                      g+=1;
                      
                  }
                  
              }else{
                   
              }

                }
              in.close();
            } 
        catch (IOException e) 
        {
          e.printStackTrace();
        }


        int temp=0;  
        for (int n = 0; n < lines; n++)   
        {  
            for (int m = n + 1; m < lines; m++)   
            {  
                if (deliverylist[1][n] > deliverylist[1][m])   
                {  
                     temp=deliverylist[1][m];
                }else if(deliverylist[1][n] == deliverylist[1][m]){
                    temp=deliverylist[1][m];
                } 
            }  
        }  

        ArrayList<Integer> ids = new ArrayList<Integer>();
        
        for(int x = 0; x < lines; x++){
   

            if(deliverylist[1][x]==temp){
                ids.add(deliverylist[0][x]);
            }
        }

        int trueid = ids.get(0);
        int[] result = new int[]{trueid, days};
        return result;
    }
    
 
   
}
