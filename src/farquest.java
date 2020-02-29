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
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSo you startup your ship.\n" +
                "It roars as the ignition starts and you feel\n" +
                "like this is going to be quite a show.\n" +
                "The ref looks over to you and gives you a nod.\n" +
                "You know its time to compete in this...\n" +
                "do you ready your ship to race?");
        answer = sc.nextLine();
        if(answer.equals("yes")||answer.equals("Yes")||answer.equals("YES")){
            String go = "";
            Scanner ad = new Scanner(System.in);
            System.out.println("Then let the race begin!\n\n\n" +
                    "You look above the raceline and see a massive screen displaying\n" +
                    "the number '3' in bold text. The ref says 'prepare for\n" +
                    "a whole load of collision...' as the number changes to '2'\n");
            System.out.println("PRESS ANY KEY TO CONTINUE...");
            go = ad.nextLine();
            System.out.println("The countdown changes to '1' as the ref yells\n" +
                    "'Go go go!!' And everyone puts pedal to the metal...");
            raceStart();
        }else{
            System.out.println("The race is postponed until\n" +
                    "all contestants are ready...");
            raceTime();
        }
    }

    static void raceStart(){
        int fault_counter = 0;
        Scanner ad = new Scanner(System.in);
        System.out.println("as the rest of the ships leave the start line\n" +
                "you speed on too. As the engine makes quite a loud bang do\n" +
                "you continue to accelerate? or do you glide for a while to let\n" +
                "it cool?\nPlease press 1 or 2.\n1. Push on!\n2. Let it cool\n");
        int x_e = ad.nextInt();
        if(x_e==1){
            System.out.println("\nAs you push on, the ship does not make\n" +
                    "some very nice sounds. It drifts all over the place.\n" +
                    "You lose control slightly while you're driving it and \n" +
                    "a few more competitors overtake you...");
            fault_counter +=1;
            midRace(fault_counter);
        }else if(x_e==2){
            System.out.println("\nYou ease off of the accelerator and the ship\n" +
                    "slows down and cools off slightly.\n" +
                    "This was definitely the right move.\n");
            midRace(fault_counter);
        }else{
            System.out.println("That is not a valid responce.\n" +
                    "your ship makes more and more noise before it\n" +
                    "explodes killing you instantly.\n");
            System.out.println("GAME OVER");
            System.out.println("\nPRESS ANY KEY TO CONTINUE");
            String resolve = ad.nextLine();
            String[] arguments = new String[] {""};
            farquest.main(arguments);
        }
    }

    static void midRace(int f_c){
        Scanner ad = new Scanner(System.in);
        if(f_c>=1){
            System.out.println("Your ship is somewhat overheating...\n");
        }else{
            System.out.println("You speed on ahead...\n");
        }
        System.out.println("You approach someone and come up alongside them,\n" +
                "what do you do?\n1. Nudge their ship and knock them off course.\n" +
                "2. Play nice and try to overtake them.\n3. Slow down and let them go forward.\n" +
                "Please enter 1,2 or 3.");
        int move = ad.nextInt();
        if(move==1){
            System.out.println("You go to nudge them but notice as you do, that they have\n" +
                    "some kind of bomb on their ship which you are about to collide with.\n" +
                    "Your ship explodes and you are disqualified from the race.");
            System.out.println("GAME OVER");
            System.out.println("\nPRESS ANY KEY TO CONTINUE");
            String resolve = ad.nextLine();
            String[] arguments = new String[] {""};
            farquest.main(arguments);
        }else if(move==2){
            System.out.println("You play nice and try to overtake them when you have the chance\n" +
                    "and luckily you do later on, you are able to leave them in the dust...\n");
            System.out.println("\nGood job!\n");
            lastHurdle();
        }else if(move==3){
            System.out.println("As you slow down your engine cuts out! The other racer leaves\n" +
                    "you in the dust as your ship completely breaks down\n" +
                    "and you have to quit...");
            System.out.println("GAME OVER");
            System.out.println("\nPRESS ANY KEY TO CONTINUE");
            String resolve = ad.nextLine();
            String[] arguments = new String[] {""};
            farquest.main(arguments);
        }else{
            System.out.println("That is not a valid responce.\n" +
                    "the ship knocks you off course and you crash, your ship\n" +
                    "explodes killing you instantly.\n");
            System.out.println("GAME OVER");
            System.out.println("\nPRESS ANY KEY TO CONTINUE");
            String resolve = ad.nextLine();
            String[] arguments = new String[] {""};
            farquest.main(arguments);
        }
    }

    static void lastHurdle(){
        Scanner ad = new Scanner(System.in);
        System.out.println("As your racing along, you notice\n" +
                "you are in second place!\n" +
                "The racer in front is only slightly ahead of you.\n" +
                "What do you do?...\n1. Keep your distance, he's bound to mess up\n" +
                "2. Accelerate forward, you can catch up to him right?\n" +
                "3. Slow down, he might slow down too?");
        System.out.println("Please enter 1,2 or 3");
        int last = ad.nextInt();
        if(last==1){
            System.out.println("You keep your distance, and he keeps his.\n" +
                    "times running out though and he finishes in 1st place.\n" +
                    "This leaves you disappointed but I suppose 2nd place\n" +
                    "isn't too bad. " +
                    "\nCONGRATULATIONS ON 2ND PLACE.\n" +
                    "Thanks For Playing!");
        }else if(last==2){
            System.out.println("You attempt to accelerate forward\n" +
                    "but your ship wont go any faster. You end up burning\n" +
                    "out your engine! Your ship overheats and you end up\n" +
                    "stopping just before the finish line.\n" +
                    "Better Luck Next Time...\n" +
                    "Thanks For Playing!");
        }else if(last==3){
            System.out.println("You just slightly tap the brakes\n" +
                    "and just in the last second a great gust of wind knocks\n" +
                    "the racer in front off course. You end up overtaking him!\n" +
                    "You then finish in 1st place! \n" +
                    "CONGRATULATIONS ON 1ST PLACE.\n" +
                    "Thanks For Playing!");
        }else if(last==4){
            System.out.println("You shouldn't have entered that...");
            lastHurdle();
        }else{
            System.out.println("That is not a valid input.\nPlease re-enter...\n");
            lastHurdle();
        }

    }
}