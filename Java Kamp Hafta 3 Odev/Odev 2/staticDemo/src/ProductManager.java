public class ProductManager {
    public void add(Product product){
        ProductValidator validator = new ProductValidator();
        if (ProductValidator.isValid(product)) {
            System.out.println("Eklendi");
        } else {
            System.out.println("Ürün bilgileri geçersiz.");
        }
    }

    public void bisey(){

    }
    
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
}
