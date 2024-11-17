import java.util.Scanner;
public class IT24104127Lab4Q2 {
      public static void main(String[] args) {

         
          Double examPercentage, labPercentage, finalMark, examMark , labSubmissionMarks ;

          Scanner scanner= new Scanner(System.in);

          System.out.println("Please enter exam marks : ");
          examMark = scanner.nextDouble();

          if(examMark<=0 || 100<=examMark) {
             System.out.println("invaid mark");
             return;
          }

          System.out.println("Please enter lab submission marks(out of 100): ");
          labSubmissionMarks = scanner.nextDouble();

          if(labSubmissionMarks<=0 || 100<=labSubmissionMarks) {
             System.out.println("invaid mark");
             return;
           }


          System.out.println("Please enter the percentage given for the exam : ");
          examPercentage = scanner.nextDouble();

          if(examPercentage<0 || examPercentage>100) {
             System.out.println("invaid examPercentage");
             return;
           }


          System.out.println("Please enter the percentage given for lab submission : ");
          labPercentage = scanner.nextDouble();
          if(labPercentage <0 || labPercentage>100) {
             System.out.println("invaid labPercentage ");
             return;
           }
     

          finalMark =  examMark*(examPercentage/100) + labSubmissionMarks*(labPercentage/100);

          System.out.println("Final exam mark : " + finalMark );
        
          scanner.close();

      }
}
