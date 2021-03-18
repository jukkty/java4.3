public class Main {
    public static void main(String[] args){
        CreditPaymentService service = new CreditPaymentService();
        int year;
        double credit;
        double rate;
        System.out.println(service.calculate(year = 1,credit = 1_000_000,rate = 9.99));
        System.out.println(service.calculate(year = 2,credit = 1_000_000,rate = 9.99));
        System.out.println(service.calculate(year = 3,credit = 1_000_000,rate = 9.99));
    }
}