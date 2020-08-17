import java.util.Scanner;
public class LengthCapacityString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer(s1);
        StringBuilder stringBuilder = new StringBuilder(s1);
        System.out.println(" capacity : " + stringBuffer.capacity() + " length : " + stringBuffer.length());
        System.out.println(" capacity : " + stringBuilder.capacity() + " length : " + stringBuilder.length());
    }
}
