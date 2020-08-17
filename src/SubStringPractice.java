import java.util.Scanner;
public class SubStringPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String s1 = sc.nextLine();
        System.out.println("Enter the position :- ");
        int p1 = sc.nextInt();
        StringBuffer stringBuffer = new StringBuffer(s1);
        StringBuffer stringBuffer1 = new StringBuffer(stringBuffer.substring(p1));
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer);





    }
}
