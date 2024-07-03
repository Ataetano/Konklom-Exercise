public class konklom03 {
    static void NoLoopFN(int n){
        n += 1;
        double alpha = (1 + Math.sqrt(5))/2;
        double beta = (1 - Math.sqrt(5))/2;
        double FN = (Math.pow(alpha, n) - Math.pow(beta, n))/Math.sqrt(5);
        System.out.printf("%n%.0f",FN);
    }
    public static void main(String[] args) {
        int inputLimit = 20;
        for (int inputNumber = 0; inputNumber < inputLimit; inputNumber++){
            NoLoopFN(inputNumber);
        }
    }
}