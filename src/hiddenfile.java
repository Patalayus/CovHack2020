import java.util.Scanner;

public class hiddenfile{
    static void hiddenMethod2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nbut the wall smashes...\n"+
        "and then it flickers until it appears to turn off?\n"+
        "like some kind of TV screen? But where are you now?\n"+
        "1. Look Around\n2. Yell for Help\n3. Try to find a way out...\n");
        int questionResp = sc.nextInt();
        if(questionResp==1){

        }else if(questionResp==2){

        }else if(questionResp==3){

        }else{
            System.out.println("That is not a valid responce, please enter one...\n");
            hiddenMethod2();
        }
    }

}