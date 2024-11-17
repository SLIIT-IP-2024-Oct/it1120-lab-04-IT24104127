import java.util.Scanner;
public class IT24104127Lab4Q3 {
      public static void main(String[] args) {

          int number;
          String result;

          Scanner scanner= new Scanner(System.in);

          System.out.println("Enter a number: ");
          number= scanner.nextInt();

          result= (number>0)? "The number is : positive":
                  (number<0)? "The number is : Negative ":
                  "The number is : zero ";

          System.out.println(result);

          scanner.close();

       
     
      }
}
