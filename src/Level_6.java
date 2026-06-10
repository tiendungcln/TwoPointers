import java.util.Arrays;

public class Level_6 {
    // Xóa phần tử trùng nhau
    // Cho mảng đã sort: [1,1,2,2,3,3,4]
    // Kết quả: [1,2,3,4]
    // Remove Duplicates:
    // fast bắt đầu từ 1
    // (vì đã dùng arr[0] làm phần tử đầu tiên của kết quả)

    public static int[] removeDuplicates(int[] arr){

        int slow = 0;

        for (int fast = 1; fast < arr.length; fast++){
            // sau mỗi vòng fast tăng nhưng slow thì khi gặp dk mơới tăng còn k thì giữ nguyên

            if (arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }

        }

        int[] result = new int[slow + 1];

        for (int i = 0; i <= slow; i++){
            result[i] = arr[i];
        }

        return result;

    }

    public static void main(String[] args){

        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
        // Lần 1: S = 0 và F = 1 -> trùng S giữ nguyên F tăng
        // Lần 2: S = 0 và F = 2 -> khác S tăng F tăng S = 1 F = 3 gán F vào S -> 1, 2, 2, 2
        // tiếp tục

    }
}
