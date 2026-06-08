import java.util.Arrays;

public class Level_2 {
    // Đảo mảng
    // Cho: [1,2,3,4,5]
    // Kết quả: [5,4,3,2,1]
    // Mục tiêu:
    // swap
    // left++
    // right--

    public static void reverseArray(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);

    }
}
