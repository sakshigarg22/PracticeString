public class LexographicOrder {
    public static void main(String[] args) {
        String[] names = {"Raman", "Aman", "Vikram", "Shyam", "Bhuvan"};
        int i, j = 0, n = 5;
        for (i = 0; i< n - 1; ++i) {
            for (j = i+1; j < n; ++j) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
                System.out.println("IN LEXOGRAPHIC ORDER :- ");
                for (i=0; i<n; i++){
                    System.out.println(names[i]);
                }
            }
        }
    }
}
