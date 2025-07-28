
package alonso;

import java.util.Scanner;

public class acivity3 {
    public static void main(String[] args) {
        Scanner cc= new Scanner(System.in); 
        
        int number;
        System.out.println("Enter a number: ");
        number =cc.nextInt();
        
        if (number == 0) {
            System.out.println("Inputted number zero");   
        } else if (number > 0){
            System.out.println("\n" + number + " is a postive number");       
        } else  {
            System.out.println("\n" + number + " is a negative number");    
        }
        
        
        cc.close();
        
        
        
    }
}
