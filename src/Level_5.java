public class Level_5 {
    // Tìm 1 cặp có tổng bằng target
    // Cho: [1,2,3,4,5,6]
    // target = 9
    // Kết quả: 3 + 6 = 9
    // Trả về: true

    public static boolean hasPairWithTargetSum(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        while (left < right){

            if (arr[left] + arr[right] < target){
                left++;
            } else if (arr[left] + arr[right] > target) {
                right--;
            } else {
                return true;
            }

        }

        return false;

    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 9;
        System.out.println(hasPairWithTargetSum(arr, target));;

    }
}
