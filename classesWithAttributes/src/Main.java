public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Lenovo Laptop",5000,3,"Siyah");
//        Product product = new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setPrice(2500);
//        product.setDescription("Lenovo Laptop");
//        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}