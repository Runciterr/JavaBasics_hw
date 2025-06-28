public class PrimitiveDataTypes {

public static void main(String[] args){
    int a = 9;
    int b = 3;
    double c = 20.5;
    double maxDouble = Double.MAX_VALUE;
    double overflowDouble = maxDouble * 10;


    System.out.println("\nприменить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int");
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println(++a);

    System.out.println("\nприменить несколько арифметических операций над int и double в одном выражении");
    System.out.println("a + c = " + (a + c));
    System.out.println("a / c = " + (a / c));

    System.out.println("\nприменить несколько логических операций ( < , >, >=, <= )");
    System.out.println("a > b is " + (a > b));
    System.out.println("a < b is " + (a < b));
    System.out.println("a >= b is " + (a >= b));
    System.out.println("a <= b is " + (a <= b));

    System.out.println("\nполучить переполнение при арифметической операции");
    System.out.println((overflowDouble));
}

}
