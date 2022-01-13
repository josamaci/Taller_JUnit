package calculatorsmp;

public class CalculatorSMP {

    public static void main(String[] args) {

        String question = Operations.MakeFormula();
        System.out.println(question);
        String ret = Operations.Solve(question);
        System.out.println(ret);
    }
    
}
