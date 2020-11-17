
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
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
                String Shifttransport = tempArr[7];
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
    

   public static void main(String args[]) throws Exception {
      Scanner sc = new Scanner(new BufferedReader(new FileReader("assi.txt")));
      int rows = sc.nextInt();
      int columns = sc.nextInt();
      int matrix[][] = new int[rows][columns];
        while (sc.hasNextInt()) {
                int row = sc.nextInt();
                int col = sc.nextInt(); // If this fails the text documnet is incorrect.
                matrix[row][col] = 1;
            }
            
      sc.close();
      System.out.println(Arrays.deepToString(matrix));
   }
    
}
