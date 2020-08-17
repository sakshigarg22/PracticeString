public class StringConcate {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("world");

        System.out.println("concat is :" + stringBuffer + stringBuilder);

        stringBuffer.append(stringBuilder);
        System.out.println("concat :" + stringBuffer);

    }
}
