public class BankOnline {
    private static final String[] blockedCards = {"1111111111111111", "2222222222222222", "3333333333333333"};

    public static void send(String cardNumber, double amount) throws Exception {
        if (!invalidCardNumber(cardNumber)) {
            throw new Exception("Invalid card number");
        }

        if (blockedCard(cardNumber)) {
            throw new Exception("The card is blocked");
        }

        if (amount < 0 || amount > 50000 || amount == 0) {
            throw new Exception("Negative transfer amount");
        }

        // реализация перевода
        System.out.println("Transfer in progress " + cardNumber + ", amount of money " + amount);
    }

    private static boolean invalidCardNumber(String cardNumber) {
        if (cardNumber.length() != 16) {
            return false;
        }

        for (int i = 0; i < cardNumber.length(); i++) {
            if (!Character.isDigit(cardNumber.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private static boolean blockedCard(String cardNumber) {
        for (String blockedCard : blockedCards) {
            if (blockedCard.equals(cardNumber)) {
                return true;
            }
        }
        return false;
    }
}