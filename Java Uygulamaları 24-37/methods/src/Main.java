public class Main {
    public static void main(String[] args) {
        sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,4,5,6,};
        int aranacak = 10;

        boolean varMi = false;

        for (int sayi:sayilar){
            if (sayi == aranacak){
                varMi = true;
                break;
            }
        }

        if (varMi){
            mesajVer(aranacak +" mevcuttur");
        } else mesajVer(aranacak + " mevcut değildir.");
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}