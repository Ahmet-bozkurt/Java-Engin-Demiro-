public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{new OgretmenCreditManager(),new TarimCreditManager(),new OgrenciCreditManager()};

        for (BaseCreditManager creditManager : baseCreditManagers){
            System.out.println(creditManager.hesapla(1000));
        }
    }
}