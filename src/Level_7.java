import java.util.Arrays;

public class Level_7 {
    // Move Zeroes
    // Cho: [0,1,0,3,12]
    // Kết quả: [1,3,12,0,0]
    // Move Zeroes:
    // fast bắt đầu từ 0
    // (vì mọi phần tử khác 0 đều cần được xét, kể cả arr[0])

    public static int[] moveZeroes(int[] arr){

        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++){

            if (arr[fast] != 0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }

        }

        return arr;

    }

    public static void main(String[] args){

        int[] arr = {0, 1, 0, 3, 12};
        System.out.println((Arrays.toString(moveZeroes(arr))));

    }
}
