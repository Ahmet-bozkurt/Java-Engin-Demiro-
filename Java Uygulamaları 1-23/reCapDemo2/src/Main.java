public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2,1.2,12.1,2.3};
        double total=0;
        double max = myList[0];
        for (double number:myList){
            if (max <number){
                max = number;
            }
            total = total+number;
        }
        System.out.println(max);
    }
}