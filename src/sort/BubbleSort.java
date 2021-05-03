package sort;

//https://ict-nroo.tistory.com/52
public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {5,6,2,8,7,23,4,1};
        String[] inputString = {"asc","dbd","badd","cqq"};
        bubbleSortMin(input);
        printSort(input);

        System.out.println("!!!!!!!!!!!!!!!!");
        bubbleSortMax(input);
        printSort(input);

        System.out.println("!!!!!!!!!!!!!!!!");
        bubbleSortMinString(inputString);
        printSort(input);

        System.out.println("!!!!!!!!!!!!!!!!");
        bubbleSortMaxString(inputString);
        printSort(inputString);
    }

    private static void printSort(int[] input){
        for(int num : input){
            System.out.println(num);
        }
    }
    private static void printSort(String[] input){
        for(String num : input){
            System.out.println(num);
        }
    }

    public static void bubbleSortMin(int[] input){
        int tmp;
        for(int i=input.length ; 0<i; i--){
            for(int j=0 ; j<i-1; j++){
                if(input[j] > input[j+1]){
                    tmp = input[j];
                    input[j] = input[j+1];
                    input[j+1] =tmp;
                }
            }
        }
    }

    public static void bubbleSortMax(int[] input){
        int tmp;
        for(int i=input.length ; 0<i; i--){
            for(int j =0 ; j<i-1; j++){
                if(input[j] < input[j+1]){
                    tmp = input[j];
                    input[j] = input[j+1];
                    input[j+1] =tmp;
                }
            }
        }
    }

    public static void bubbleSortMinString(String[] input){
        String tmp;
        for(int i=input.length ; 0<i; i--){
            for(int j =0 ; j<i-1; j++){
                if(input[j].compareTo(input[j+1]) > 0){
                    tmp = input[j];
                    input[j] = input[j+1];
                    input[j+1] =tmp;
                }
            }
        }
    }

    public static void bubbleSortMaxString(String[] input){
        String tmp;
        for(int i=input.length ; 0<i; i--){
            for(int j =0 ; j<i-1; j++){
                if(input[j].compareTo(input[j+1]) < 0){
                    tmp = input[j];
                    input[j] = input[j+1];
                    input[j+1] =tmp;
                }
            }
        }
    }
}
