package functionalinterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        //********Predicate*******//

//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 18;
//            }
//        };
//        lesserThan.test(50);

        Predicate<Integer> lesserThan = a -> a<18; // implementation of test method that belongs to Predicate interface
        Boolean result = lesserThan.test(50);
        System.out.println(result);

       //**********Consumer***********//
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);

        //**********BIConsumer***********//
        BiConsumer<Integer,Integer> addTwo =(x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //**********Function*********//
        //    method | return type of the methods
        Function<String,String> fun = s -> "Hello " + s;
        String str = fun.apply("Parhat");
        System.out.println(str);
        System.out.println(fun.apply("apple"));

        //Supplier************
        Supplier<Double> randomValue =() -> Math.random();
        System.out.println(randomValue.get());

    }
}
