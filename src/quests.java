import java.util.Random;
import java.util.Scanner;

public class quests {
    static void build(String usr){
        Scanner sc = new Scanner(System.in);
        System.out.println("First things first!\n" +
                "You need to gather materials for\n" +
                "your ship!...\nYou have 3 locations to choose from...\n" +
                "1. Quasantine\n2. Elperock\n3. Synerath\nplease press 1,2 or 3.\n");
        int materialLocation = sc.nextInt();
        Random r = new Random();
        int ranNum = r.nextInt();
        if(materialLocation==1){
            System.out.println("\n"+usr+" heads to Quasantine...\n");
            quasantine(ranNum);
        }else if(materialLocation==2){
            System.out.println("\n"+usr+" heads to Elperock...\n");
            elperock(ranNum);
        } else if (materialLocation==3){
            System.out.println("\n"+usr+" heads to Synerath...\n");
            synerath(ranNum);
        }
    }

    /**
     * Method to generate random number through API call.
     * This method generates a very large integer based on the testing
     * thus far
     */
    static void checkNum(int o_u){
        if(o_u < 3){
            System.out.println("You barely find anything on\n" +
                    "this planet, you should definitely\n" +
                    "look elsewhere...\n");
        }else if( o_u > 3 && o_u < 6){
            System.out.println("You don't find a lot of materials\n" +
                    "maybe you should try another planet...\n");
        }else if(o_u > 6 && o_u < 8){
            System.out.println("You find a good amount of\n" +
                    "materials, you'll get your ship done\n" +
                    "in a week or so definitely!\n");
        }else{
            System.out.println("You find loads of materials\n" +
                    "and so your ship can be made in the next\n" +
                    "couple of days!\n");
        }
    }

    static void quasantine(int r) {
        Scanner sc = new Scanner(System.in);
        String secondLook;
        checkNum(r);

        Random q = new Random();
        int ranNum1 = q.nextInt();

        System.out.println("Do you look again?\n");
        secondLook = sc.nextLine();
        if(secondLook.contains("y")||secondLook.contains("Y")){
            Random w = new Random();
            int ranNum2 = w.nextInt();
            checkNum(ranNum2);
            shipBuild(ranNum2);
        }else{
            System.out.println("Let's just go with what\n" +
                    "you have so far...\n");
            shipBuild(ranNum1);
        }
    }

    static void elperock(int r){
        Scanner sc = new Scanner(System.in);
        String secondLook;
        checkNum(r);

        Random q = new Random();
        int ranNum1 = q.nextInt();

        System.out.println("Do you look again?\n");
        secondLook = sc.nextLine();
        if(secondLook.contains("y")||secondLook.contains("Y")){
            Random w = new Random();
            int ranNum2 = w.nextInt();
            checkNum(ranNum2);
            shipBuild(ranNum2);
        }else{
            System.out.println("Let's just go with what\n" +
                    "you have so far...\n");
            shipBuild(ranNum1);
        }
    }

    static void synerath(int r){
        Scanner sc = new Scanner(System.in);
        String secondLook;
        checkNum(r);

        Random q = new Random();
        int ranNum1 = q.nextInt();

        System.out.println("Do you look again?\n");
        secondLook = sc.nextLine();
        if(secondLook.contains("y")||secondLook.contains("Y")){
            Random w = new Random();
            int ranNum2 = w.nextInt();
            checkNum(ranNum2);
            shipBuild(ranNum2);
        }else{
            System.out.println("Let's just go with what\n" +
                    "you have so far...\n");
            shipBuild(ranNum1);
        }
    }

    static void shipBuild(int ran_x){
        System.out.println("So you start building with \n" +
                "the "+ran_x+" pieces you've collected and scavanged...");
        if(ran_x>10000000){
            System.out.println("This doesn't take too long,\n" +
                    "and you end up making a rather nice\n" +
                    "looking ship.\n" +
                    "Now its time to put it to the test...");
            farquest.raceTime();
        }else{
            System.out.println("This takes quite a while\n" +
                    "but luckily you finish in time for the race...");
            farquest.raceTime();
        }
    }

}
