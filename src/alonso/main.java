
package alonso;

import alonso.banking.bankingClass;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        int i=3;
        while(i>0){
        switch(choice){
           case 1:
                  bankingClass bc = new bankingClass();
                
                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
              
                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }else{
                        i--;
                        System.out.println("INVALID ACCOUNT! you have " + i + " left");
                    }
        
                break;
        
                
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        }
        }
    }
    
}
