package book;

public class p70 {
    public static void main(String[] args) {
        int[] input = {5,8,3}; // 배열의 크기, 숫자가 더해지는 횟수, 연속
        int[] input2 = {2,4,5,4,6};
        int count = 0;
        int sum = 0;

        bubbleSortMax(input2);

        for (int n : input2){
            System.out.println(n);
        }


        for(int i=0; i<input[1]; i++){
            if(count < input[2]){
                sum += input2[0];
                count ++;
            }else{
                sum += input2[1];
                count = 0;
            }
        }

        System.out.println(sum);

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

}
