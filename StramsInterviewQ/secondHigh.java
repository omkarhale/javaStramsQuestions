package StramsInterviewQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondHigh {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(99,87,44,55,36,2,0,5,6,78,88,1,2);
        int sechigh=list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(sechigh);
    }
}
