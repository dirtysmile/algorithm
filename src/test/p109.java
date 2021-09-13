package test;

public class p109 {
    public static void main(String[] args) {
        int n=5;
        int[] start = {1,1};


        char[] lo = {'R','R','R','U','D','D'};

        for (char l: lo) {
            move(start,n,l);

        }

        System.out.println(start[0]);
        System.out.println(start[1]);
    }

    public static void move(int[] start,int n, char m){
        int tmp = 0;
        switch (m){
            case 'R' :
                tmp = start[0] + 1;
                if(tmp <= 5){
                   start[0] = tmp;
                }
                break;
            case 'L' :
                tmp = start[0] - 1;
                if(tmp > 0){
                    start[0] = tmp;
                }
                break;
            case 'U' :
                tmp = start[1] - 1;
                if(tmp > 0) {
                    start[1] = tmp;
                }
                break;
            case 'D' :
                tmp = start[1] +1 ;
                if(tmp <= 5){
                    start[1] = tmp;
                }
                break;
        }
    }
}
