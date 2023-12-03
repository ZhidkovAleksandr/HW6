package Task2;

/**
* @author alexandrzhidkov
 */
@Anat
public class Calc {
/**
*this class has two parameters with type double to calculate between them
 */
    double op1;
    double op2;

    @Anat(op1 = 10.0, op2 = 2.0)
    /**
     * this method makes addition
     */
    public static void add(double op1, double op2){
        System.out.println("adding");
        System.out.println(op1+op2);
    }

    @Anat(op1 = 5.0, op2 = 4.0)
    /**
     * this method makes subtraction
     */
    public static void dec(double op1, double op2){
        System.out.println("subtraction");
        System.out.println(op1 - op2);
    }

    @Anat(op1 = 5.0, op2 = 4.0)
    /**
     * this method makes multiplication
     */
    public static void mult(double op1, double op2){
        System.out.println("multiplication");
        System.out.println(op1 * op2);
    }

    @Anat(op1 = 5.0, op2 = 4.0)
    /**
     * this method makes division
     */
    public static void div(double op1, double op2){
        System.out.println("division");
        System.out.println(op1/op2);
    }


}
