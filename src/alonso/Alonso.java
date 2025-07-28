
package alonso;

import java.util.Scanner;
public class Alonso {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        String name;
        int sci,his,mat,soc,art;
        System.out.println("Enter name: ");
        name = sc.nextLine();
        
        System.out.println("Enter marks in Science: ");
        sci =sc.nextInt();
        
        System.out.println("Enter marks in HIstory: ");
        his =sc.nextInt();
        
        System.out.println("Enter marks in Math: ");
        mat =sc.nextInt();
        
        System.out.println("Enter marks in Soc: ");
        soc =sc.nextInt();
        
        System.out.println("Enter marks in Arts:  ");
        art =sc.nextInt();
        
        int totalmarks= sci+his+mat+soc+art;
        double percentage= totalmarks / 5.0;
        
        String remarks:
        if (percentage < 70 ) {
            
            remarks = "Fail";
            
        } else if (percentage <= 75  ) {
            
            remarks = "Poor";
            
        } else if (percentage <= 80  ) {
            
            remarks = "Fair";
            
        } else if (percentage <= 85  ) {
            
            remarks = "Good";
            
        } else if (percentage <= 90  ) {
            
            remarks = "Very Good";
            
        } else {
            
            remarks = "Excellent";
            
        }
        
         System.out.println("\nTotal Marks: "+ totalmarks);
         System.out.printf("Total percentage: %.2f\n", percentage);
         System.out.println("Remarks: "+ remarks);
         
        if (percentage >= 70) {
            System.out.println("\nCongrats " + name + " you Passed.");
        } else {
            System.out.println("\nTry Again " + name + ".");
        }

        sc.close();
        
        
        
    }
    
 
}
