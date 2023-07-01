import java.util.Arrays;

public class GraphPrac {
    public static void main(String[] args) {
        int[][] edges = new int[][]{
                {0, 3, 0},
                {0, 2, 0},
                {1, 3, 0},
                {2, 1, 0},
        };
        int[][] edges2 = new int[][]{
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0},
        };
        System.out.println(Arrays.deepToString(createMatrix(edges)));
        System.out.println("-");
        System.out.println(Arrays.deepToString(createMatrix(edges2)));
    }
        public static int[][] createMatrix(int[][] edges) {
            // TODO:
            int lengthMax = 0;
            for (int i = 0; i < edges.length; i++){
                for(int j = 0; j < edges[i].length; j++){
                    if (edges[i][j] > lengthMax) lengthMax = edges[i][j];
                }
            }
            int result[][] = new int[lengthMax+1][lengthMax+1];

            for(int i = 0; i < edges.length; i++){
                int from = edges[i][0];
                int to = edges[i][1];
                int direction = edges[i][2];
                result[from][to] = 1;
                if (direction==1) result[to][from]=1;
            }
            return result;
        }
    }

