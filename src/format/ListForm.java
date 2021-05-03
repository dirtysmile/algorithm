package format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListForm {
    public static void main(String[] args) {
        List a = new ArrayList();
        a.add(new ArrayList<String>(Arrays.asList("1","2","3")));
        a.add(new ArrayList<String>(Arrays.asList("4","5","6")));
        a.add(new ArrayList<String>(Arrays.asList("7","8","9")));
        a.add(new ArrayList<String>(Arrays.asList("10","11","12")));

        for(Object b : a){
            System.out.println(b);
        }
    }
}
