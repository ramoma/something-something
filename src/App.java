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

    }
}
