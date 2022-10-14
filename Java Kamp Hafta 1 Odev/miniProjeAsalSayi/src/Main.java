public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number%2;
        boolean isPrime=true;
        //System.out.println(remainder);

        if (number == 1){
            System.out.println("Sayı asal değildir");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz Sayı");
        }

        for(int i=2; i<=number; i++){
            if (number % i == 0 && number == 1){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayı asaldır.");
        } else {
            System.out.println("Sayı asal değildir.");
        }
    }
}