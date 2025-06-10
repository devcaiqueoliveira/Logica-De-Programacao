    import java.util.HashMap;
    import java.util.Map;

    public class Stock {
        private final Map<String, Integer> stockProducts = new HashMap<>();

        public void addProduct(String code, Integer count) {
            int currentStock = stockProducts.getOrDefault(code, 0);
            stockProducts.put(code, currentStock + count);
        }

        public void removeProduct(String code, Integer countToRemove) {
            if (!stockProducts.containsKey(code)) {
                System.out.println("Erro: Produto " + code + " não encontrado no estoque.");
                return;
            }
            int currentStock = stockProducts.get(code);
            int newStock = currentStock - countToRemove;
            
            if (newStock < 0) {
                stockProducts.put(code, 0);
                System.out.println("Houve uma tentativa de remoção superior ao estoque atual e por isso o estoque do produto " + code + " foi zerado.");
            } else {
                stockProducts.put(code, newStock);
            }
        }

        public void verifyStock(String code) {
            int currentStock = stockProducts.getOrDefault(code, 0);
            System.out.println("O estoque atual de " + code + " é de " + stockProducts.get(code));
        }

        public void listProducts() {
            for (Map.Entry<String, Integer> entry : stockProducts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }