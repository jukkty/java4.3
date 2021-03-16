public class Main {
    public static void main(String[] args){
        CreditPaymentService service1 = new CreditPaymentService();
        CreditPaymentService2 service2 = new CreditPaymentService2();
        CreditPaymentService3 service3 = new CreditPaymentService3();
        int year = 1;
        double credit = 1_000_000;
        double rate = 9.99;
        double monthPayment1 = service1.calculate(year,credit,rate);
        double monthPayment2 = service2.calculate(year,credit,rate);
        double monthPayment3 = service3.calculate(year,credit,rate);
        System.out.println(monthPayment1);
        System.out.println(monthPayment2);
        System.out.println(monthPayment3);
    }
}