package sort;


//https://www.youtube.com/watch?v=7BDzle2n47c
public class QuickSort {
    public static void main(String[] args) {
        int[] input = {5,6,2,8,7,23,4,1};
        String[] inputString = {"asc","dbd","badd","cqq"};

        quickSort(input);
        printSort(input);

    }

    private static void printSort(int[] arr){
        for (int num: arr) {
            System.out.println(num);
        }
    }

    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if(start<part2 -1){
            quickSort(arr,start,part2-1);
        }
        if(part2<end){
            quickSort(arr,part2,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end)/2];
        while (start <= end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;

            if(start <=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int[] arr, int start, int end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }
}
