import java.util.Scanner;

public class farquest {

    static void charCreation(String x){
        int genVal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("What gender is "+x+"?");
        String genChar = scan.nextLine();
        if(genChar.contains("F")||genChar.contains("f")){
            System.out.println(x+" is female. now to get to the story...");
            genVal = 0;
        }else if(genChar.contains("M")||genChar.contains("m")) {
            System.out.println(x + " is male. now to get to the story...");
            genVal = 1;
        }else{
            charCreation("your character");
        }
        introduction(x, genVal);
    }

    static void introduction(String y, int z){
        Scanner sc = new Scanner(System.in);
        String w = "";
        String responce = "";
        clearScreen();
        if(z == 1){
            w = "he";
        }else if(z == 0){
            w = "she";
        }
        /**the quest is to build your own space ship and to race it
         * against the other competitors to a nearby planet.
         **/
        System.out.println("the year is 3087, on planet Hamashi\n" +
                "in the outer reaches of the Andromida galaxy.\n\n"
                +y+" is residing in a city called Tarashima. \n"
                +w+" has been selected by the local council to\n" +
                "take part in a race. This race is very different\n" +
                "to any other race you have heard of...");
        System.out.println("\nYou have to make your ship and also race it!\nAre you up for the challenge?");
        responce = sc.nextLine();
        if(responce .equals("yes")||responce.equals("Yes")||responce.equals("YES!")
                ||responce.equals("Yes!")||responce.equals("yes!")){
            quests.build(y);
        }else{
            introduction(y,z);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String []args){
        System.out.println("COVHACK 2020 PROJECT:\n" +
                "" +
                "|~~    /\\    |~~\\   /~~\\   |   |  |~~  /~~\\  ~~|~~\n" +
                "|--   /__\\   |__/  |    |  |   |  |--  '--.    |  \n" +
                "|    /    \\  |  \\   \\__X    \\_/   |__  \\__/    |  \n" +
                "                                                  ");

        System.out.println("by Patalayus");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your character name:\n");
        String chaName = sc.nextLine();
        System.out.println("Welcome "+chaName+"!\n" );
        charCreation(chaName);

    }

    static void raceTime(){
        System.out.println("\nSo you startup your ship.\n" +
                "It roars as the ignition starts and you feel\n" +
                "like this is going to be quite a show");
    }
}