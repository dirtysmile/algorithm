package book;

public class p91 {
    public static void main(String[] args) {

        int n = 5;

        int cn = 53;
        int cm = 5;

        int count3 = 0;
        String time = null;

        for(int i=0; i<=n; i++){
            // 시간
            for(int j=0; j<60; j++){
                // 분
                for(int k=0; k<60; k++){
                    //초                    time= Integer.toString(i) + Integer.toString(j) + Integer.toString(k);
                    if(time.indexOf('3') > -1){
                        count3++;
                    }

                }
            }

        }

        System.out.println(count3);

    }

    public static boolean count(){

        return false;
    }
}
