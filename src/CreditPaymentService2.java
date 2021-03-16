public class CreditPaymentService2 {
    public static double calculate(int year, double credit, double rate) {
        int month = year * 24;
        double rateMonth = rate / 12 / 100;
        double coefficient = rateMonth * Math.pow((1 + rateMonth),month) / (Math.pow((1 + rateMonth),month) - 1);
        double payment = coefficient * credit;
        double paymentFinal2= Math.round(payment);
        return paymentFinal2;
    }
}
