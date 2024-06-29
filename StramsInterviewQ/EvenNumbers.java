package StramsInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(22,57,85,94,66,37);
       List even= list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(even);

    }
}
