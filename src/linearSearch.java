public class linearSearch {

    public static void main(String[] args) {
        int[] num = {2,3,4,6,7,8};
//        int [] num = new int[1000];
        int target = 33;


//        int result1 = linearSearchs(num,target);
//        int result2 = binarySerch(num,target);
        int result3 = recusivbinarySerch(num,target, 0, num.length);

        if(result3 != -1)
            System.out.println("Element found at Index: " +result3);
        else
            System.out.println("Element not found");

    }

    public static int recusivbinarySerch(int[] num, int target, int left, int right) {
        int step = 0;
        if(left < right){
            int mid = (left + right)/2;
            if(num[mid] == target){
                return  mid;
            }
            else if(num[mid] < target){
               return   recusivbinarySerch(num , target, mid+1, right);
            }
            else
                return recusivbinarySerch(num , target, left, mid-1);
        }
        return -1;
    }

    // Binary Search
    public static int binarySerch(int[] num, int target) {
        int step =0;
        int left = 0;
        int right = num.length -1;
        while(left <= right){
            step++;
            int mid = (left + right)/2;
            if(num[mid] == target){
                System.out.println("Step taken by buinary" + step);
                return mid;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else
                right = mid -1;
        }
        return -1;

    }

    //    LinearSearch
    private static int linearSearchs(int[] num, int target) {
        int setp = 0;
        for(int i=0; i<num.length;i++){
            setp++;
            if(num[i] == target){
                System.out.println("step taken by linerar "+ setp);
                return i;
            }
        }
        return -1;
    }
}
