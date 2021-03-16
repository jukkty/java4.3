public class CreditPaymentService3 {
    public static double calculate(int year, double credit, double rate) {
        int month = year * 36;
        double rateMonth = rate / 12 / 100;
        double coefficient = rateMonth * Math.pow((1 + rateMonth),month) / (Math.pow((1 + rateMonth),month) - 1);
        double payment = coefficient * credit;
        double paymentFinal3= Math.round(payment);
        return paymentFinal3;
    }
}
