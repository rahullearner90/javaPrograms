public class InhancedForLoop {
    public static void main(String args[]){
        int array1[]={1,2,3,4,6,7,8,9};

        for(int v : array1){
            System.out.print(v+" ");
        }

        System.out.println();
        
        int array2[][]={
            {1,2,3,4},
            {3,4,5,6},
            {7,8,9,0}
        };

        for(int a[] : array2){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
