package day04_increment_concatenation;

public class C06_LogicalOperators {
    public static void main(String[] args) {
        /*
        Java'da karşılaştırma operatörleri SADECE 2 variable'yi karşılasştırır

         */
        int a = 10;
        int b = 20;
        int c = 15;

        // ucunun birbirine eşit olduğunu kontrol edin

        System.out.println( a == b && b == c); // false

        // a sayısının pozitif ve 2 ile tam bölünebilir olduğunu kontrol edin

        System.out.println(a > 0 && a%2==0 ); // true

        // b sayisinin 10 ile 50 arasinda oldugunu kontrol edin

        System.out.println(10<b && b<50);// true

        // b sayisinin 10 ile 50 arasinda olmadigini kontrol edin

        System.out.println(b<10 || 50<b); // false




    }
}
