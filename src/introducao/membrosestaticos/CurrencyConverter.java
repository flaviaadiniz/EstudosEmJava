package introducao.membrosestaticos;

public class CurrencyConverter {

    public static double realAmount;
    public static final double iof = 0.06;

    public static String convertToReal(double dollarOfTheDay, double dollarAmount) {
        double tempValue = dollarOfTheDay * dollarAmount;
        realAmount = tempValue + (tempValue * iof);
        return "O valor de US$" + dollarAmount + " dólares é R$" + realAmount + ".";
    }

}
