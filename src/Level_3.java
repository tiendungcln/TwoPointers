public class Level_3 {
    // Kiểm tra Palindrome
    // Cho: madam
    // Kết quả: true
    // Flow: m == m và a == a và d
    // => true
    // Mục tiêu: Two Pointers trên String

    public static boolean isPalindrome(String str){

        int left = 0;
        int right = str.length() - 1;

        while (left < right){

            if (str.charAt(left) != str.charAt(right)){
                // Thấy 2 cặp khác nhau return luôn
                return false;
            }

            // Còn k thấy thấy thì chạy tiếp các cặp khác rồi kiểm tra tiếp
            left++;
            right--;

        }

        // Cuối cùng hết vòng while không có cặp nào khác thì return
        return true;

    }

    public static void main(String[] args){

        String str = "madam";
        System.out.println(isPalindrome(str));;

    }

}
