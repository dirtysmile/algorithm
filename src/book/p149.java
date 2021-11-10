package book;

public class p149 {
    public static int n = 3;
    public static int m = 3;

    public static int[][] graph = {{1,1,0},{0,1,0},{0,1,1}};
    public static void main(String[] args) {


        dfs(1,3);

//        for(i)






    }

    public static boolean dfs(int x, int y){

        if(x<=-1 || x>=n || y <=-1 || y>=m){
            return false;
        }

        System.out.println("dfs");
        return false;
    }
}
