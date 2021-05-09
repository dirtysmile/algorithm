package book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p96 {
    public static List<int[]> move = new ArrayList<>();

    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,1,0,-1};

    public static int[][] d = new int[50][50];
    public static int[][] arr = new int[50][50];

    public static int x,y,direction,n,m;


    public static void main(String[] args) {
        // location (x,y,캐릭터가 보고있는 방향)
        /*
         * 캐릭터가 보고있는 방향
         * 0 : 북
         * 1 : 서
         * 2 : 남
         * 3 : 동
         */

        n = 4;
        m = 4;
        x = 1;
        y = 1;
        direction = 0;

        d[x][y] = 1;

        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[0][3] = 1;

        arr[1][0] = 1;
        arr[1][1] = 0;
        arr[1][2] = 0;
        arr[1][3] = 1;

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 0;
        arr[2][3] = 1;

        arr[3][0] = 1;
        arr[3][1] = 1;
        arr[3][2] = 1;
        arr[3][3] = 1;

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }

        int cnt = 1;
        int turn_time = 0;

        while (true){
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            // 회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            }


            else turn_time += 1;
            // 네 방향 모두 갈 수 없는 경우
            if (turn_time == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                // 뒤로 갈 수 있다면 이동하기
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                // 뒤가 바다로 막혀있는 경우
                else break;
                turn_time = 0;
            }
        }

        System.out.println("!!!!!!!!!");

        System.out.println(cnt);
        System.out.println("!!!!!!!!!");


    }

    public static void turn_left() {
        direction -= 1;
        if (direction == -1) direction = 3;
    }


}
