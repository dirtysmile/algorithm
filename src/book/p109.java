package book;

public class p109 {
    public static void main(String[] args) {
        int i = 1;
        recusive(i);

    }

    public static boolean recusive(int i){
        if(i==100){
            return false;
        }
        System.out.println(i);
        return recusive(i+1);
    }
}
