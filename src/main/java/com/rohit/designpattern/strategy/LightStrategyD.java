package com.rohit.designpattern.strategy;

import java.util.List;
import java.util.function.Predicate;

public class LightStrategyD {

    public  static int totalNumberBy(List <Integer> numbers
            , Predicate<Integer> strategy) {

        return numbers.stream()
                .filter(strategy)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        List <Integer> oneToTen = List.of(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10);
        System.out.println(totalNumberBy(oneToTen , ignore -> true));
        System.out.println(totalNumberBy(oneToTen , number -> number %2 ==0));
        System.out.println(totalNumberBy(oneToTen , number -> number %2 !=0));
        System.out.println(totalNumberBy(oneToTen , number -> number %5 ==0));


    }
}
