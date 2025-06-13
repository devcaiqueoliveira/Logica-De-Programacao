public class Main {
    public static void main(String[] args) {
        Words words = new Words();

        words.addWord("Vassoura", "Objeto ");
        words.removeWord("Vassoura");
        words.removeWord("Bicicleta");
        words.addWord("Rodo", "Objeto");
        words.searchDefinition("Rodo");
        words.searchDefinition("Vassoura");
    }
}