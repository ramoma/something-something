public class App {
    public static void main(String[] args) throws Exception {
        
        int[][] le_2darray = {
            {1,8,11},
            {2,5,2,14},
            {3,13,43,7,12}

        };

        // for(int a[] : le_2darray){
        //     for(int b : a){
        //         System.out.print(a[b]);
        //     }
        //     System.out.println();
        // }

        
        for(int i = 0; i < le_2darray.length; ++i){
            int sum = 0;
            for(int j = 0; j < le_2darray[i].length; ++j ){
                sum += le_2darray[i][j];
            }
            System.out.println(sum);
            System.out.println();
        }
        dog dog1 = new dog("jummy", 8, "chihuahua");
        dog1.speak();

        //comment
    }
}
