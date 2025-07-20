public class CompoundInterest {
    public static void main(String[] args) {
        // CI = P(1 + r/100)^t - P
        double principal = 15000;
        double rate = 5.5;
        double time = 3;

        double compoundInterest = principal * (Math.pow((1 + rate / 100), time)) - principal;

        System.out.println(compoundInterest);
    }
}
