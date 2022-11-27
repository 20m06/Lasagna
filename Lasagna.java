/**
 * This class will teach you how to make Lasagna in 3 steps!
 *
 * @author Mykhailo Kosenko
 * @version 11/26/2022
 */
import java.util.Scanner;

public class Lasagna
{
    //FIELDS
    private String heat;
    private String pasta;
    private String spread;
    private String bake;
    private int degreesInput;
    private static final int DEGREES = 375;
    private int minutesInput;
    private static final int TIME_IN_OVEN = 45;
    private String uncover;
    private int minutesUncoveredInput;
    private static final int MINUTES_UNCOVERED = 10;

    //CONSTRUCTOR
    Lasagna(){
        heat = "";
        pasta = "";
        spread = "";
        bake = "";
        degreesInput = 0;
        minutesInput = 0;
        uncover = "";
        minutesUncoveredInput = 0;
    }

    //METHOD
    public static void main(String[] args){
        Lasagna user = new Lasagna();
        Scanner kboard = new Scanner(System.in);
        System.out.println("Welcome to kitchen!" + 
                         "\nToday we will cooking lasagna in 3 steps!" + 
                         "\nHope you already have been in a store and bought ingrediends:" + 
                         "\n - 1 pound lean ground beef" + 
                         "\n - 4 cups tomato-basil pasta sauce" + 
                         "\n - 6 uncooked lasagna noodles" + 
                         "\n - 1 (15-ounce) container ricotta cheese" + 
                         "\n - 2 ½ cups (10 ounces) shredded mozzarella cheese" + 
                         "\n - ¼ cup hot water");
        System.out.println("First step: Cook beef in a large skillet over medium heat," + 
                        "\n stirring until it crumbles and is no longer pink; drain. Stir in pasta sauce." + 
                        "\nTo set a medium heat in oven press M on your keyboard and press Enter: ");
        user.heat = kboard.nextLine();//assign field heat to user input
        if(!(user.heat.equalsIgnoreCase("M"))){//stop execution if user enter wrong character
            System.out.println("You just burn your beef!Go to a store to buy a new one.");
            System.exit(0);
        }
        System.out.println("To add pasta press P on your kyboard and press Enter: ");
        user.pasta = kboard.nextLine();//assign field pasta to user input
        if(!(user.pasta.equalsIgnoreCase("P"))){//stop execution if user enter wrong character
            System.out.println("You just spill all your pasta for your lasagna!Go to store to buy a new one.");
            System.exit(0);
        }
        System.out.println("Second step: Spread one-third of meat sauce in a lightly greased 11- x 7-inch baking dish;" + 
                        "\n layer with 3 noodles and half each of ricotta cheese and mozzarella cheese." + 
                        "\n (The ricotta cheese layers will be thin.) Repeat procedure;" + 
                        "\n spread remaining one-third of meat sauce over mozzarella cheese." + 
                        "\n Slowly pour 1/4 cup hot water around inside edge of dish." + 
                        "\n Tightly cover baking dish with 2 layers of heavy-duty aluminum foil.");
        System.out.println("To spread meat press S on your keyboard and press Enter: ");
        user.spread = kboard.nextLine();//assign field spread to user input
        if(!(user.spread.equalsIgnoreCase("S"))){//stop execution if user enter wrong character
            System.out.println("You just spoiled all your beef!Go to a store to buy a new one.");
            System.exit(0);
        }
        System.out.println("Third step: Bake at 375° for 45 minutes; uncover and bake 10 more minutes." + 
                        "\n Let stand 10 minutes before serving.");
        do{
        System.out.println("To start oven press O on your keyboard and press Enter: ");
        user.bake = kboard.nextLine();//assign field bake to user input
        }while(!(user.bake.equalsIgnoreCase("O")));//repeat until user start oven
        System.out.println("To set degrees just write level of degrees you need: ");
        user.degreesInput = kboard.nextInt();
        while(user.degreesInput - DEGREES > 25){
            System.out.println("Caution!You will burn your lasagna!Set less degrees!");
            user.degreesInput = kboard.nextInt();
        }
        while(DEGREES - user.degreesInput > 25){
            System.out.println("Caution!Your lasagna will not bake completely!Set more degrees!");
            user.degreesInput = kboard.nextInt();
        }
        System.out.println("To wait just write amount of minutes you need: ");
        user.minutesInput = kboard.nextInt();
        while(user.minutesInput - TIME_IN_OVEN > 10 ){
            System.out.println("Your lasagna is not ready.Give it more time.");
            System.out.println("To wait just write amount of minutes you need: ");
            user.minutesInput += kboard.nextInt();
            if(TIME_IN_OVEN - user.minutesInput < -10){
                System.out.println("Oh no!You just burn your lasagna!Go to a stor to buy new ingridients.");
                System.exit(0);
            }
        }
        do{
            System.out.println("To uncover lasagna press U on your keyboard and press Enter: ");
            user.uncover = kboard.next();
        }while(!(user.uncover.equalsIgnoreCase("U")));

        System.out.println("To wait just write amount of minutes you need: ");
        user.minutesUncoveredInput = kboard.nextInt();
        while(user.minutesUncoveredInput - MINUTES_UNCOVERED > 10 ){
            System.out.println("Your lasagna is not ready.Give it more time.");
            System.out.println("To wait just write amount of minutes you need: ");
            user.minutesInput += kboard.nextInt();
            if(MINUTES_UNCOVERED - user.minutesInput < -10){
                System.out.println("Oh no!You just burn your lasagna!Go to a stor to buy new ingridients.");
                System.exit(0);
            }
        }
        System.out.println("Congratulations! You just made amazing lasagna!Save this recipe to cook anoher time!");
    }
}
