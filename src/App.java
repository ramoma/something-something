public class App {
    public static void main(String[] args) throws Exception {
        
        int[][] le_2darray = {
            {1,1,1},
            {2,2,2},
            {3,3,3}

        };

        for(int a[] : le_2darray){
            for(int b : a){
                System.out.print(a[b - 1]);
            }
            System.out.println();
        }

        for(int i = 0; i < le_2darray[i].length; ++i){
            int sum = 0;
            for(int j = 0; j < le_2darray[j].length ; ++j ){
                sum += le_2darray[i][j];
            }
            System.out.println(sum);
            System.out.println();
        }
    }
}
