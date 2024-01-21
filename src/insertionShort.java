public class insertionShort {
    public static void main(String[] args) {
        int [] num = {7,8,3,1,2};
        int size = num.length;



        System.out.print("Before shoerting ");
        for(int nums : num ){
            System.out.print(nums+" ");
        }
         for(int i= 1; i<size; i++){
             int cureent = num[i];
             int j = i-1;
             while( j >= 0  && num[j] > cureent ){
                 num[j+1] = num[j];
                 j--;
             }
             num[j+1] = cureent;

             System.out.println();
             for(int nums : num){
                 System.out.print(nums+ " ");
             }

         }




        System.out.println();
        System.out.print("After  shoerting ");
        for(int nums : num ){
            System.out.print(nums+" ");
        }


    }
}
