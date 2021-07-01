package laboratorio.lab08;

public class Divisao implements Strategy{

    @Override
    public int execute(int a, int b) {
        try{
            return a / b ;
        } catch (ArithmeticException e){
            System.out.println("ERROR: Não é possível fazer uma divisão por 0(zero) ");
        }
        return -1;
    }
}
