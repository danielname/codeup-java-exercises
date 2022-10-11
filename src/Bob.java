import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something to BOB: ");
        String dnBobTalk = scanner.nextLine();
        if (dnBobTalk.lastIndexOf('!') == dnBobTalk.length()-1){
            System.out.println("Whoa, chill out!");
        } else if (dnBobTalk.lastIndexOf('?') == dnBobTalk.length()-1){
            System.out.println("Sure.");
        } else if (dnBobTalk == ""){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
