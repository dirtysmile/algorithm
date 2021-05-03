package Sort;


//https://ict-nroo.tistory.com/52
public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {5,6,2,8,7,23,4,1};
        String[] inputString = {"asc","dbd","badd","cqq"};


        selectionSortMin(input);


        for(int i=0; i<input.length;i++){
            System.out.println(input[i]);
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        selectionSortMax(input);
        for(int i=0; i<input.length;i++){
            System.out.println(input[i]);
        }


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        selectionSortMinString(inputString);

        for(int i=0; i<inputString.length;i++){
            System.out.println(inputString[i]);
        }

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        selectionSortMaxString(inputString);

        for(int i=0; i<inputString.length;i++){
            System.out.println(inputString[i]);
        }
    }

    public static void selectionSortMin(int[] input){

        int tmp;

        for(int i=0; i< input.length-1; i++){

            for(int j=i+1; j<input.length; j++){
                if(input[i] > input[j]){
                    tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }

        }
    }

    public static void selectionSortMax(int[] input){

        int tmp;

        for(int i=0; i<input.length-1; i++){
            for(int j=i+1; j<input.length; j++){
                if(input[i] < input[j]){
                    tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }

    }

    public static void selectionSortMinString(String[] input){

        String tmp;

        for(int i=0; i< input.length-1; i++){

            for(int j=i+1; j<input.length; j++){
                if(input[i].compareTo(input[j])>0){
                    tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }

        }
    }

    public static void selectionSortMaxString(String[] input){

        String tmp;

        for(int i=0; i<input.length-1; i++){
            for(int j=i+1; j<input.length; j++){
                if(input[i].compareTo(input[j])<0){
                    tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }

    }
}
