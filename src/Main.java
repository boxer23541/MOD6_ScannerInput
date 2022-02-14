import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // Scanner console = new Scanner(System.in)

        int birthMonth;
        double salary;
        boolean yesno;
        String userName;
        String trash;

        // Reading a string
        System.out.print("Enter your username: ");
        //input the username
        userName = in.nextLine(); //in.next() to read a single word i.e. to a space

        System.out.println("\nYour username is " + userName);


        System.out.print("Enter your birth month: ");

        if(in.hasNextInt()) // OK to read in an integer and clear the buffer
        {
            birthMonth = in.nextInt();
            in.nextLine(); // Clear the input buffer
            System.out.println("\nYour birth month is " + birthMonth);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou must enter a valid int: not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        System.out.print("Enter your Salary: ");

        if(in.hasNextDouble()) // OK to read in a double and clear the buffer
        {
            salary = in.nextDouble();
            in.nextLine(); // Clear the input buffer
            System.out.println("\nYour salary is $" + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou must enter a valid double: not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }
    }
}
