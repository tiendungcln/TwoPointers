public class Level_1 {
    // In cặp đầu cuối
    // Cho:
    // [1,2,3,4,5]
    // In:
    // 1 5
    // 2 4
    // 3

    public static void printPairsFromEnds(int[] arr){

        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            System.out.println(arr[left] + " - " + arr[right]);
            left++;
            right--;

        }

        if (left == right){
            System.out.println(arr[left]);
        }

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        printPairsFromEnds(arr);

    }
}
