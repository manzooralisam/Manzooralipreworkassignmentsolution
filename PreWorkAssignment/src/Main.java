import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
			public void checkPalindrome() {
				
			}
			public void printPattern() {
				
			}
			public void checkPrimeNumber() {
				
			}
			public void printFibonacciSeries() {
			
			int first = 0, second = 1;
			
			}
			

      public static void main(String[]args) {
    	  
    	  Main obj = new Main();
    	  
    	  int choice;
    	  
    	  Scanner sc = new Scanner(System.in);
    	  
    	  do {
    		  System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n" + "2. Print pattern for given no.\n" + "3. Check whether no is prime no.\n" + "4. Print Fibonnacci series.\n" + "----> Enter 0 to Exit.\n");
    		  
    		  System.out.println();
    		 choice = sc.nextInt();
    		 
    		 switch(choice) {
    		 case 0:
    			 choice = 0;
    			 break;
    			 
    		 case 1:{
    			 obj.checkPalindrome();
    		 }
    		 break;
    		 
    		 case 2:{
    			 obj.printPattern();
    		 }
    		 break;
    		 
    		 case 3:{
    			 obj.checkPrimeNumber();
    		 }
    		 break;
    		 
    		 case 4:{
    			 obj.printFibonacciSeries();
    			 
    		 }
    		 break;
    		 
    		default:
    			System.out.println("Invalid choice. Enter a valid no.\n");
    			
    	  }
    		 }while (choice !=0);
    	  System.out.println("Exited Succesfully!!!");
    	  
    	  sc.close();
      }
      
      }