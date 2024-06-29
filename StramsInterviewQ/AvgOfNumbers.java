package StramsInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgOfNumbers {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        OptionalDouble avg=list.stream().mapToInt(p->p).average();
        System.out.println(avg.getAsDouble());
    }
}
