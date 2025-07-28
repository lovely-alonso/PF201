
package alonso;

import java.util.Scanner;


public class activity2 {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        int num;
        System.out.println("Enter a Number: ");
        num = ss.nextInt();
        
        if (num == 0){
            System.out.println("/nInputted number zero");   
        } else if (num % 2 == 0) {
            System.out.println("Inputted number is even");   
        } else {
            System.out.println("Inputted number is odd");   
        }
        
        ss.close();
        
        
        
        
    }
}
