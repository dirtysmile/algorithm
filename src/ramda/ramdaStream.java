package ramda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ramdaStream {
    public static void main(String[] args) {
        System.out.println("tset");

        List<String> strList = Arrays.asList("1,2,3,4,5".split(","));
        List<Integer> intList = strToIntList(strList);

        for (int a:intList) {
            System.out.println(a);
        }

    }
    public static List<Integer> strToIntList(List<String> strList){
        return strList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
