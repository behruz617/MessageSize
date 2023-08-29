import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message ");
        String msg=sc.nextLine();

        double smsLength=Math.ceil(msg.length()/160.0);

        if(msg.length()<=160.0){
            System.out.println("Your message consist of: "+msg.length()+" character .Its 1 sms ");

        }else {
            System.out.println("your message is consist of "+msg.length()+" character.It can  be split into "+(int)smsLength+" sms ");
        }
    }
}
