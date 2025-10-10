public class App {
    public static void main(String[] args) throws Exception {
        
        int[][] le_2darray = {
            {1,1,1},
            {2,2,2},
            {3,3,3}

        };

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
