import java.util.Scanner;

public class InteractiveRectangleProject {
    public static void main(String[] args) {
        int height= readPositiveInteger("Please enter the rectangle height");
        int width= readPositiveInteger("Please enter the rectangle width");

        printRectangleDetails(height, width);
        keepGoing();
    }

    public static int area (int height, int width){
        /**
         * Returns the area of a rectangle
         * @param height: the height of the rectangle
         * @param width: the width of the rectangle
         */
        int area=height*width;
        return area;
    }

    public static int perimeter(int height, int width){
        /**
         * Returns the perimeter of a rectangle
         * @param height: the height of the rectangle
         * @param width: the width of the rectangle
         */
        int perimeter=(2*height)+(2*width);
        return perimeter;
    }
    public static int readInteger(String prompt){
        /**
         * Read in an integer and return its value
         * @param the prompt to be shown to the user
         */
        int integer=0;
        System.out.println(prompt);

        Scanner scan=new Scanner(System.in);

        while(!scan.hasNextInt()) {
            scan.next();
            System.out.println(prompt);
        }
        integer=scan.nextInt();
        return integer;
    }
    public static int readPositiveInteger(String prompt){
        int integer=readInteger(prompt);
        while (integer <= 0) {
            System.out.println("Sorry, please only enter a positive integer");
            readInteger(prompt);
        }
        return integer;
    }

    public static void printRectangleDetails(int height, int width){
        System.out.println("The rectangle's area is "+area(height, width));
        System.out.println("The rectangle's perimeter is "+perimeter(height, width));
    }

    public static void keepGoing(){
        String character="N";
        Scanner scan=new Scanner(System.in);
        System.out.println("Would you like to repeat the program? Y/N");
        character=(scan.next());
        while(character.equals("Y")){
            int height= readPositiveInteger("Please enter the rectangle height");
            int width= readPositiveInteger("Please enter the rectangle width");
            printRectangleDetails(height, width);
            System.out.println("Would you like to repeat the program? Y/N");
            character=(scan.next());
        }
    }
}