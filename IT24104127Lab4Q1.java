import java.util.Scanner;
public class IT24104127Lab4Q1 {
      public static void main(String[] args) {

          int number;

          Scanner scanner= new Scanner(System.in);

          System.out.println("Enter a number: ");
          number= scanner.nextInt();


         if(number>0) {System.out.println("The number is : positive");}
         else if(number<0) {System.out.println("The number is : Negative ");}
         else {System.out.println("The number is : zero ");}

         scanner.close();

       
     
      }
}
