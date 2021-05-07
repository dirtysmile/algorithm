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
        int x = 4;
        int y = 4;

        List<int[]> move = new ArrayList<>();
        move.add(new int[]{0,1});
        move.add(new int[]{-1,0});
        move.add(new int[]{0,-1});
        move.add(new int[]{1,0});

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
                    boolean flg = moveMe(location, move.get(0), x, y, map);
                    break;
                case 1 :
                    moveMe(location,move.get(1),x,y,map);

                    break;
                case 2 :
                    moveMe(location,move.get(2),x,y,map);
                    break;
                case 3 :
                    moveMe(location,move.get(3),x,y,map);
                    break;
            }

            moveFlg=false;
        }

        for (Object o : map) {
            System.out.println(o);

        }
    }

    public static boolean moveMe(int[] location, int[] direct, int x, int y, List map){
        boolean check1 = checkMap(location,direct,x,y);

        if(!check1){
            return false;
        }

        boolean check2 = checkBottom(map,location,direct);

        if(!check2){
            return false;
        }

        return true;
    }

    public static boolean checkBottom(List<int []> map, int[] location, int[] direct){
        int x = location[0] + direct[0];
        int y = location[1] + direct[1];

        if(map.get(x)[y] == 1){
            return false;
        }

        return true;
    }

    public static boolean checkMap(int[] location, int[] direct, int x, int y){
        int[] tmp_location = {location[0],location[1],location[2]};
        tmp_location[0] = tmp_location[0] + direct[0];
        tmp_location[1] = tmp_location[1] + direct[1];

        if( tmp_location[0] >= x && tmp_location[0] < 0){
            return false;
        }

        if(tmp_location[1] >= y && tmp_location[1] < 0){
            return false;
        }

        return true;
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
