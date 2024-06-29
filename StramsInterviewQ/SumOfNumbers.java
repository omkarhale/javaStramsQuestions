package StramsInterviewQ;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,5,6,4,8,6,2);
        Optional<Integer> sum=list.stream().reduce((a, b)->a+b);
        System.out.println("SUm of the numbers is "+sum.get());
    }
}
