package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p93 {
    public static void main(String[] args) {
//      [1,2] , [-1,2] , [2,1] , [2,-1] , [1,-2] , [-1 , -2] , [ -2,1], [-2,-1]

        String point = "a1";

        List<int []> list = new ArrayList<>();
        list.add(new int[]{1,2});
        list.add(new int[]{-1,2});
        list.add(new int[]{2,1});
        list.add(new int[]{2,-1});
        list.add(new int[]{1,-2});
        list.add(new int[]{-1,-2});
        list.add(new int[]{-2,1});
        list.add(new int[]{-2,-1});


        int x = (int)point.charAt(0)-96;
        int y = Character.getNumericValue(point.charAt(1));
//
//        System.out.println(x + " : " + y);
//
//        for (int[] ints : list) {
//            System.out.println(ints[0] + " , " + ints[1]);
//        }

        int count = 0;
        for (int[] ints : list) {
            if(x+ints[0] > 0 && x+ints[0]<9){
                if(y+ints[1] >0 && y+ints[0]<9){
                    count ++;
                }
            }
        }
        System.out.println("test");

        System.out.println(count);


    }

}
