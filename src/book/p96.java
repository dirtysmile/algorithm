package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p96 {
    public static void main(String[] args) {
        // location (x,y,캐릭터가 보고있는 방향)
        /*
         * 캐릭터가 보고있는 방향
         * 0 : 북
         * 1 : 서
         * 2 : 남
         * 3 : 동
         */
        int[] location = {1,1,0};

        List<int[]> map = new ArrayList();
        map.add(new int[]{1,1,1,1});
        map.add(new int[]{1,0,0,1});
        map.add(new int[]{1,1,0,1});
        map.add(new int[]{1,1,1,1});

        // 현재 위치 방문처리
        visit(map,location);

        boolean moveFlg = true;
        while(moveFlg){
            turnLeft(location);
            switch (location[2]){
                case 0 :
                    System.out.println("1");
                    break;
                case 1 :
                    System.out.println("1");
                    break;
                case 2 :
                    System.out.println("1");
                    break;
                case 3 :
                    System.out.println("1");
                    break;
            }

            moveFlg=false;
        }

        for (Object o : map) {
            System.out.println(o);

        }
    }

    public static void turnLeft(int[] location){
        if(location[2]!=3){
            location[2] = location[2] + 1;
        }else{
            location[2] = 0;
        }

    }

    public static void visit(List<int[]> map,int[] location){
        map.get(location[0])[location[1]] = 1;
    }
}
