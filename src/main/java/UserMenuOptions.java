import java.sql.SQLOutput;
import java.util.Scanner;

public class UserMenuOptions {


    public void showBadAssAsciiHand(){
        System.out.println("              __                                               \n" +
                "        _..-''--'----_.                                        \n" +
                "      ,''.-''| .---/ _`-._                                     \n" +
                "    ,' \\ \\  ;| | ,/ / `-._`-.                                  \n" +
                "  ,' ,',\\ \\( | |// /,-._  / /                                  \n" +
                "  ;.`. `,\\ \\`| |/ / |   )/ /                                   \n" +
                " / /`_`.\\_\\ \\| /_.-.'-''/ /                                    \n" +
                "/ /_|_:.`. \\ |;'`..')  / /                                     \n" +
                "`-._`-._`.`.;`.\\  ,'  / /                                      \n" +
                "    `-._`.`/    ,'-._/ /                                       \n" +
                "      : `-/     \\`-.._/                                        \n" +
                "      |  :      ;._ (                                          \n" +
                "      :  |      \\  ` \\                                         \n" +
                "       \\         \\   |                                         \n" +
                "        :        :   ;                                         \n" +
                "        |           /                                          \n" +
                "        ;         ,'                                           \n" +
                "       /         /                                             \n" +
                "      /         /                                              \n" +
                "               /                                            ");

    }



    public String returnPlayersName(){
        Scanner scan= new Scanner (System.in);
        System.out.println("Welcome to the All 'Merican BadA$$ Black Jack table");
        System.out.println("What is your name?");
        String playerName = scan.nextLine();

        return playerName;
    }

    public Player createNewPlayer(String name){

        Player player = new Player(name);

        return player;
    }

    public double askForInitialBet(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your initial bet sucka? (it's helpful if its in units of 10.00 USD)");
        return scanner.nextDouble();
    }

    public String hitOrStayOption(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] get a hit \n" +
                            "[2] stay\n" +
                            "[3] fold \n");

        return scanner.nextLine();

    }
}

