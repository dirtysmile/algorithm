package test;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] testArr= {2,1,3,7,8};
        
        
        System.out.println("test start");
        bubble(testArr);
    }
    
    public static void bubble(int[] arr){
        int tmp;

//        System.out.println(arr.length);

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }


        for (int i: arr) {
            System.out.println(i);
        }
    }
}
