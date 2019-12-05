public class UsingTheEnhancedForStatement {
    public static void main(String[] args) {

        double suma = 0;
        for (int i = 0; i < args.length; i++)
            suma +=  sum(Double.parseDouble(args[i]));

        System.out.println("Sum is " + suma);
    }
    public static double sum(double... a) {
        double sum = 0;
        for (double i : a)
            sum = sum + i;
        return sum;
    }
}
