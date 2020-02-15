import java.util.Scanner;

public class farquest {

    static void charCreation(String x){
        Scanner scan = new Scanner(System.in);
        System.out.println("What gender is "+x+"?");
        String genChar = scan.nextLine();
        if(genChar.contains("F")||genChar.contains("f")){
            System.out.println(x+" is female. now to get to the story...");
        }else if(genChar.contains("M")||genChar.contains("m")) {
            System.out.println(x + " is male. now to get to the story...");
        }else{
            charCreation("your character");
        }
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

}