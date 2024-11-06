import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String validUserName = "Coded";
        String validPassword = "Coded123";

        boolean correctInputs = false ;

        try{


            while (!correctInputs) {

                System.out.print("Please enter your Username OR enter 'Done' to exist : ");
                String username = input.nextLine();

                if(!username.equals(validUserName)) {

                    System.out.print("Wrong username | Please try again \n");
                    System.out.print("Please enter your username OR enter done to exist : ");
                    username = input.nextLine();

                }
                System.out.print("Please enter your Password OR enter 'Done' to exist : ");
                String password = input.nextLine();

             if (username.equals(validUserName) && !password.equals(validPassword)) {

                 correctInputs = true ;

                 System.out.print("Wrong password | Please try again \n");
                 System.out.print("Please enter your password OR enter done to exist : ");
                 password = input.nextLine();

            }
                if(password.equals(validPassword)) {

                    correctInputs = true ;

                    System.out.println("You are logged in!");

                }else if (username.equals(validUserName) && password.equals(validPassword)) {


                    correctInputs = true ;

                    System.out.println("You are logged in!");
                   // throw new Exception("Invalid credentials");
                  // System.out.print("Please enter your username OR enter done to exist : ");
                  //  username = input.nextLine();

                }


            } //end of loop
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();

    } //end of main
}