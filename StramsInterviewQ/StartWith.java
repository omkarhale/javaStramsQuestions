package StramsInterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(263,365,11,256,22,892,67,29);

        List startwith2=list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).collect(Collectors.toList());
        System.out.println(startwith2);
    }
}
