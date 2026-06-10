public class Level_4 {
    // Đếm số cặp có tổng bằng target
    // Cho: arr = [1,2,3,4,5]
    // target = 6
    // Kết quả:
    // (1,5)
    // (2,4)

    public static void findPairsSum(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            if (arr[left] + arr[right] > target){
                right--;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                System.out.println(arr[left] + " - " + arr[right]);
                right--;
                left++;
            }

        }

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;

        findPairsSum(arr, target);

    }

}
