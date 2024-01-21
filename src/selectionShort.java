public class selectionShort {
    public static void main(String[] args) {
        int [] num = {88,77,55,6,4,77,6,5,9,83,7};
        int size = num.length;
        int temp = 0;
        int min_ixd = 0; int i,j;

        System.out.print("Before shoerting ");
        for(int nums : num ){
            System.out.print(nums+" ");
        }

        for(i=0;i<size;i++) {
            min_ixd = i;
            for (j = i + 1; j < size; j++)
                if (num[min_ixd] > num[j])
                    min_ixd = j;

            temp = num[min_ixd];
            num[min_ixd ]= num[i];
            num[i] =temp;

            System.out.println();
            for(int nums : num){
                System.out.print(nums+ " ");
            }

        }



        System.out.print("\nAfter   shoeting ");
        for(i=0; i<size;i++){
            System.out.print(num[i]+" ");
        }

    }
}
