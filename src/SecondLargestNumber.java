public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] num = {1,2,2,4,5,6,7,8};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > max) {
                min = max;
                max = num[i];

            } else if(num[i]>min && num[i]!=max){
                min = num[i];
            }
        }


        System.out.println("max:==>"+max);
        System.out.println("min:==>"+min);
    }
}
