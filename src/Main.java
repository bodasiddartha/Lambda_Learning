import java.util.function.*;

public class Main {
    public static void main(String[] args) {
       // new JustHelloImpl().sayHello();

        // Simple way of implementing Functional Interface (only one abstract method)
        JustHello sayhello = new JustHello() {
            @Override
            public void sayHello() {
                System.out.println("Nammadhuuu");
            }
        };
       // sayhello.sayHello();


        //Using Lambdas no return type
        JustHello sayhello1= () -> {
            System.out.println("Hello World using lambdas");
        };
       // sayhello1.sayHello();


        //Using Lambdas with return type
        CalculatorUsingLamdas obj= (x, y) -> {
            return x*y;
        };
        System.out.println(obj.calculate(2,3));
        //System.out.println(new Random().nextInt(10));


        //Using lambdas without interface (java.util.function has got already built in Interfaces)
        //For calculating things (passing 2 inputs and getting 1 output we have an interface called IntBinaryOperator that has similar method)

        IntBinaryOperator take2give1 = (x, y) ->{
            System.out.println(x+" "+y);
            return x*y;
        };
        System.out.println(take2give1.applyAsInt(2, 4));


    }
}
