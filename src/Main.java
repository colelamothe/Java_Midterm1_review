import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Cube myCube1 = new Cube(1,5,10);


        System.out.println(myCube1.volume());
        myCube1.setLength(5);
        System.out.println(myCube1.volume());

        myCube1.setDimensions(1,2,3);
        System.out.println(myCube1.volume());

        System.out.println(myCube1.getLength());

        System.out.println(myCube1.toString());

        int length, width, height;
        String check;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Enter a length: ");
            length = Integer.parseInt(scan.nextLine());
            System.out.println("Enter a width: ");
            width = Integer.parseInt(scan.nextLine());
            System.out.println("Enter a height: ");
            height = Integer.parseInt(scan.nextLine());

            System.out.println("volume is:\t" + length*width*height);

            System.out.println("Would you like to continue? (yes/no)");
            check = scan.nextLine();
        } while(check.equalsIgnoreCase("yes"));

    }
}
