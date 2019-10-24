import java.util.Scanner;
import java.text.NumberFormat;


public class converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String destinationUnit;
        String originUnit;

        System.out.print("Enter an origin unit: ");
        originUnit = (in.next());
        System.out.print("Enter a destination unit: ");
        destinationUnit = (in.next());
        System.out.print("Enter a value: ");
        double milesValue = in.nextDouble();

        double milesToInches = 63360;
        double milesToFeet = 5280;
        double milesToYards = 1760;

        double output;

         if (destinationUnit.equals("Inches")){
           output = milesValue * milesToInches;
         } else if (desntinationUnit == "Feet"){
            output = milesValue * milesToFeet;
         } else if (destinaitonUnit == "Yards"){
            output = milesValue * milesToYards;
         }

        System.out.print("There are ");
        System.out.printf("%.1f", output);
        System.out.print(" ", destinationUnit);
        System.out.print(" in ");
        System.out.printf("%.1f", milesValue);
        System.out.print(" miles.");

        in.close();
    }
}
