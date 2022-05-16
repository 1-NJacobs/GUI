package validationroutines;

import java.util.Scanner;

public class ValidationRoutines {

    
    public boolean presenceCheck(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter some Words ");
        String presence = sc.nextLine();
        if (presence == "") {
            System.out.println("Please Enter a Word");
            return false;
        }
        else{
            System.out.println("Thank you for entering a Word");
            return true;
        }
    }
    
    public boolean postcode(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a PostCode ");
        String PostCode = sc.nextLine();
        if (PostCode.length() != 7){
            return false;
        }
        
        PostCode= PostCode.toUpperCase();
        // Changes to uppercase
        char [] digit = PostCode.toCharArray();
        // Changes postcode to Array and each digit to character    
        
        if (digit[0] <= "A" || digit[0] => "Z" );{
             return false;
             
    }
        
        
        for (int i = 0; )
    }
    
    public boolean dateCheck(){
        
    }
    
    public boolean emailCheck(){
        
    }
    
    public boolean presenceCheck(){
        
    }
    
}