package StramsInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,5,3,6,8);
        List sq=list.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(sq);
    }
}
