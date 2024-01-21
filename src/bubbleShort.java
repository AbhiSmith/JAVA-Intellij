public class bubbleShort {
    public static void main(String[] args) {
        int  num[] = {6,5,2,9,4,55,88,77,74,14,15,12};
        int size = num.length;
        int temp = 0;

        //enhace for loop
        System.out.print("Before Shorting-> ");
        for(int nums : num){
            System.out.print(nums+ " ");
        }

        for(int i=0; i<size;i++){
            for (int j=0; j<size-i-1;j++){
                if(num[j] > num[j+1]){
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
            System.out.println();
            for(int nums : num){
                System.out.print(nums+ " ");
            }
        }
//this is basicaly compearing and swap -^

        System.out.print("\nAfter shorting -> ");
        for(int nums : num){
            System.out.print(nums+ " ");
        }


    }
}
