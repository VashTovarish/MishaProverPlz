public class Main {
    public static void main(String[] args) {
        try {
            BankOnline.send("1111111111111112", 0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
