package StramsInterviewQ;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(25,33,35,6,2,25);
       List duplicate= list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toList());
        System.out.println(duplicate);
    }
}
