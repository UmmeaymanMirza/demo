import java.util.Arrays;

public class StringPalindrome {

    private void foo() {
        System.out.println("In BaseClass.foo()");
    }

    void bar() {
        System.out.println("In BaseClass.bar()");
    }




    public static void main(String[] args) {
        StringPalindrome po= new StringPalindrome();
        po.foo(); // BASE_FOO_CALL
        po.bar();
//        String str = "racecar";
//        char[] chArr = str.toCharArray();
//        int left = 0;
//        int right = chArr.length - 1;
//        boolean isPalindrome = true;
//        while(left < right) {
//            if(chArr[left] != chArr[right]){
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if(isPalindrome) {
//            System.out.println("is palindrome");
//        } else {
//            System.out.println("is not palindrome");
//        }
//        int[] nums={1,1,2};
//        int index = 1;
//        for(int i = 1;i<nums.length;i++){
//            System.out.println("print Array outer:==>"+ Arrays.toString(nums));
//            if(nums[i] != nums[i-1]){
//                System.out.println("prin index:==>"+ nums[i]);
//                System.out.println("prin index i-1:==>"+ nums[i-1]);
//                nums[index] = nums[i];
//                System.out.println("print Array:==>"+ Arrays.toString(nums));
//                index++;
//
//            }
//        }
//        System.out.println("is ==>"+index);



    }

    class DerivedClass extends StringPalindrome {
        void foo() {
            System.out.println("In Derived.foo()");
        }

        void bar() {
            System.out.println("In Derived.bar()");
        }
    }
}
