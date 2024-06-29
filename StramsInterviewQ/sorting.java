package StramsInterviewQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sorting {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(99,87,44,55,36,2,0,5,6,78,88,1,2);
       List sort= list.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        List<Integer>desclist= Arrays.asList(99,87,44,55,0,36,2,5,6,78,88,1,2);
        List sorted= desclist.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted);
    }
}
