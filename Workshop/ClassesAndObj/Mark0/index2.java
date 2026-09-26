package ClassesAndObj.Mark0;
import java.util.Scanner;

public class index2 {


    public static void main(String[] args) {

        String[] candidates = {"Notch", "Steve", "Dave", "Colleen", "Mike"};


        Scanner input = new Scanner(System.in);


        System.out.print("Name: ");
        String UserName = input.nextLine();


        System.out.print("Age: ");
        int UserAge = input.nextInt();
        input.nextLine();


        Voting User = new Voting(UserName, UserAge);

        System.out.println("\nProfile: ");
        System.out.println("Name: " + User.getName());
        System.out.println("Age: " + User.getAge());


        System.out.print("Confirm?(y): ");
        String Con = input.next();
        input.nextLine();


        if (!Con.equalsIgnoreCase("y")) {

            System.out.println("----------------");

            System.out.print("Name: ");
            String NewName = input.nextLine();

            System.out.print("Age: ");
            int NewAge = input.nextInt();

            User.setName(NewName);
            User.setAge(NewAge);

        }


        boolean Check = User.CheckAge();

        while (true) {

            if (Check) {

                System.out.print("\n- Candidate Number: ");
                int ChoCan = input.nextInt();


                try {

                    System.out.print("Confirm Vote for candidate No." + ChoCan + " " + candidates[ChoCan] + " (y): ");
                    String VoteCon = input.next();
                    input.nextLine();

                    if (VoteCon.equalsIgnoreCase("y")) {
                        User.setVote(ChoCan);
                        System.out.print("Successfully Voted for " + candidates[User.getCan()] + "!");
                        break;
                    }


                } catch (ArrayIndexOutOfBoundsException error) {

                    System.out.println("Candidate No." + ChoCan + " does not Exist!");

                }

            } else {

                System.out.println("You are not of Legal Age!");
                break;


            }


        }

        input.close();



    }





}





