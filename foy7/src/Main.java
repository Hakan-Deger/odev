public class Main {
    public static void main(String[] args) {
        CustomerValidator customerValidator = new CustomerValidator();
        OrderProcessor orderProcessor = new OrderProcessor();
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        try {
            customerValidator.validateName("Hakan Değer");
            customerValidator.validateEmail("hakan_deger@example.com");

            orderProcessor.processOrder(12);

            paymentProcessor.processPayment(150.0);
        } catch (InvalidNameException | InvalidEmailException | InvalidOrderQuantityException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}
