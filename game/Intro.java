package game;
import java.util.Scanner;


public class Game 
{
    Scanner scan;
    
    int oxenCount = 0;
    int money = 0;
    int foodAmount = 0;
    int bulletAmount = 0;
    int clothingAmount = 0;
    
    
    
    public static void main(String[] args)
    {
        Game game = new Game();
        Scanner scan = new Scanner(System.in);
        
        int choice;
        
        int mainMenuLoop = 1;
        
        while(mainMenuLoop == 1) {
        System.out.println("Welcome to the Oregon Trail\n"
        + "You may:\n"
        + "1. Travel the trail\n"
        + "2. Learn about the trail\n"
        + "3. End\n\n");

        System.out.print("What is your choice :: ");
        choice = scan.nextInt();
        scan.nextLine();
        
        if(choice == 1)
        {
            game.start();
        }
        else if(choice == 2)
        {
            System.out.println("\n Try taking a journey across 2000\n"
            +" miles of plains, rivers, and mountains. Try! On the  \n"
            +" plains, will you slosh your oxen through mud\n"
            +" and water-filled ruts or will you plod through dust\n"
            +" six inches deep\n");
            
            System.out.println("Press enter to proceed");
            scan.nextLine();
            
            System.out.println("\n How will you cross the rivers?\n"
            +" if you have money, you might take a ferry\n"
            +" (if there is a ferry). Or, you can ford the river\n"
            +" and and hope you and your wagon arent swallowed alive!\n");

            System.out.println("Press enter to go back");
            scan.nextLine();
        }
        if(choice == 2)
        {
            mainMenuLoop = 1;            
        }
        else
            mainMenuLoop = 2;

    } //<-- end tag of the while loop

    

        scan.close();
    }//<-- main method

    public void start()
    {
        
        scan = new Scanner(System.in);
        
        
        System.out.println("Many kinds of people made the trip to Oregon\n"
        + "You may:\n"
        + "1. Be a banker from Boston(easy)\n"
        + "2. be a carpenter from Ohio(medium)\n"
        + "3. be a farmer from Illinois(hard)\n\n");

        System.out.print("What is your choice? ");
        int careerChoice = scan.nextInt();
        scan.nextLine();
        
        System.out.print("What is the name of your wagon leader? ");
        String wagonLeader = scan.nextLine();
        
        
        System.out.println("What are the names of the other 4 members in your party? ");
        System.out.println("1." + wagonLeader);
        System.out.print("2. " );
        String member2 = scan.nextLine();
        System.out.print("3. ");
        String member3 = scan.nextLine();
        System.out.print("4. " );
        String member4 = scan.nextLine();
        System.out.print("5. ");
        String member5 = scan.nextLine();
        
       

        System.out.print("\n It is 1848. Your jumping off\n"
        +" place for Oregon is Independence, Missouri.\n"
        +" You must decide which month to leave Independence\n"
        +" (You want to be traveling in the cooler months)\n");


        System.out.println("     1. March");
        System.out.println("     2. April");
        System.out.println("     3. May");
        System.out.println("     4. June");
        System.out.println("     5. July");

        
        
        System.out.print("What is your choice? :: ");
        String monthChoice = scan.nextLine();
    
        double startingMoney = 0.00;
         
        switch(careerChoice)
        {
            case 1 : startingMoney = 1600.00;
            case 2 : startingMoney = 800.00;
            case 3 : startingMoney = 400.00; 
        }
        
        
        
        System.out.print("\n Before leaving Independece you\n"
        +" should buy equipment and supplies.\n"
        +" You have " + startingMoney + " in cash\n"
        +" but you dont have to spend it all now\n");

        
        System.out.println("Press enter to continue");
        
        scan.nextLine();

        System.out.print("\n You can buy whatever you\n"
        +" need at Matt's General Store.\n");

        System.out.println();
        System.out.println("Press enter to continue");
        
        scan.nextLine();
        
        mattGeneralStore();



    
    } // <-- end of start method

    public void mattGeneralStore()
    {
        System.out.println("Welcome to matts general store");

    }


}//<-- public class



