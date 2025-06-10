public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        stock.addProduct("SKU-001", 20);
        stock.addProduct("SKU-002", 10);
        stock.verifyStock("SKU-001");
        stock.verifyStock("SKU-002");
        stock.removeProduct("SKU-001", 5);
        stock.listProducts();
        System.out.println("----------------");
        stock.addProduct("SKU-001", 10);
        stock.listProducts();
    }
}