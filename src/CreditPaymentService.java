public class CreditPaymentService {
    public static double calculate(int year, double credit, double rate) {
        int month = year * 12;
        double rateMonth = rate / 12 / 100;
        double coefficient = rateMonth * Math.pow((1 + rateMonth),month) / (Math.pow((1 + rateMonth),month) - 1);
        double payment = coefficient * credit;
        double paymentFinal= Math.round(payment);
        return paymentFinal;
    }
}
