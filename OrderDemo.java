public class OrderDemo{
    public static void main(String[] args) {
        //God object
        Order order = new Order (1200.00, new GCash());
    
        System.out.println(order.calculatePayment());
    }
}