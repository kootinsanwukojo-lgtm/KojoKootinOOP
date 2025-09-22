import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PlayerReport {
    public static void main(String[] args) {
        System.out.println("What is your name? \n");
        Scanner finder = new Scanner(System.in);
        String name = finder.nextLine();

        System.out.println("Quel âge as tu? ");
        int age = finder.nextInt();
        if (age < 20){
            String ageCategory = "Rising Star";
        }
        else if (age >= 20 && age < 30){
            String ageCategory = "Prime player";
        }
        else{
            String ageCategory = "Veteran";
        }

        System.out.println("How tall are you? \n");
        double height = finder.nextDouble();

        System.out.println("What's your weight in lbs? \n");
        double weight = finder.nextDouble();

        System.out.println("What is your jersey number? \n");
        int jerseyNo = finder.nextInt();


        double pound = 0.45359237;
        int meter = 100;

        int weightInKg = (int)(weight * pound);
        int heightInCm = (int)(height * meter);
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age );
        System.out.println("Height - " + heightInCm + "cm");
        System.out.println("Weight - " + weightInKg + "kg");
        System.out.println("Jersey Number - " + jerseyNo);

        boolean eligibility = 18 <= age && age <= 35 && weightInKg < 90;
        if (eligibility){
            System.out.println("Eligibility : Eligible");
        }
        else{
            System.out.println("Eligibility : Not eligible");
        }

        boolean primePlayer = age >= 20 && age < 30;
        if(primePlayer){if(weightInKg < 80){
            System.out.println("Lineup Decision : You are in the starting lineup");}
        else{
            System.out.println("Lineup Decision : You are on the bench");}}
        else{
            System.out.println("Lineup Decision : You are not in the starting lineup");
        }
        String availability = (eligibility) ? "Final Decision : play":"Final Decision : rest";
        System.out.println(availability);
        switch(jerseyNo){
            case 1:
                System.out.println("Position : Goalkeeper");
                System.out.println("Attacker Jersey - No");
                break;
            case 2:
            case 5:
                System.out.println("Position : Defender");
                System.out.println("Attacker Jersey - No");
                break;

            case 6:
            case 8:
                System.out.println("Position : Midfielder");
                System.out.println("Attacker Jersey - No");
                break;

            case 7:
            case 11:
                System.out.println("Position : Winger");
                System.out.println("Attacker Jersey - Yes");
                break;

            case 9:
                System.out.println("Position : Striker");
                System.out.println("Attacker Jersey - Yes");
                break;
            case 10:
                System.out.println("Position : Playmaker");
                System.out.println("Attacker Jersey - No");
                break;

            default:
                System.out.println("Player position not known");
                System.out.println("Attacker Jersey - No");
                break;


        }
    }
}