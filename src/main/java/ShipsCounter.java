public class ShipsCounter {
    static int[][] ships = {
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 1, 0, 0, 1, 1, 1},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 1}
    };

    static int numOfIslands(int[][] array) {

        if (array.length == 0) return 0;

        int res = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 1) {
                    DepthSearch(array, i,  j);
                    res++;
                }
            }
        }

        return res;
    }

    static void DepthSearch(int[][] array, int row, int col) {

        if (row >= array.length || col >= array[0].length || array[row][col] != 1)
            return;

        array[row][col] = 0;

        DepthSearch(array, row+ 1, col); //checking right neighbor
        DepthSearch(array, row, col + 1); //check the neighbor below
    }

    public static void main(String[] args) {
        System.out.println(numOfIslands(ShipsCounter.ships));
    }
}