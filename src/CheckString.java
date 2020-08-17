import java.util.Arrays;
import java.util.Scanner;
public class CheckString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("string s1 : ");
        String s1 = sc.nextLine();
        char arr[] = s1.toCharArray();
        Arrays.sort(arr);
        s1 = String.valueOf(arr);
        System.out.println("string s2 : ");
        String s2 = sc.nextLine();
        char brr[] = s2.toCharArray();
        Arrays.sort(brr);
        s2 = String.valueOf(brr);
        if (s1.length() != s2.length()){
            System.out.println("Not same length");
        }
        else if (s1.equals(s2)){
            System.out.println("Both contain same characters");

        }
        else
            System.out.println("donot have same characters but have same length");

    }
}
