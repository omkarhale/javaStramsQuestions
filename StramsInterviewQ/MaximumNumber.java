package StramsInterviewQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,55,6,3,4,88);
       int max= list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
    }
}
