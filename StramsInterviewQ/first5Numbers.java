package StramsInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class first5Numbers {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(99,87,44,55,36,2,0,5,6,78,88,1,2);
        List first5num=list.stream().limit(5).collect(Collectors.toList());
        System.out.println(first5num);
       int sum= list.stream().limit(5).reduce((a,b)->a+b).get();
        System.out.println(sum);
        //skip
       List sk= list.stream().skip(5).collect(Collectors.toList());
        System.out.println(sk);
    }
}
