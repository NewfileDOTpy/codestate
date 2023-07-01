public class getDirctions {
    public static void main(String[] args) {
        int[][] arr = new int[][]
                {
                        {0, 1, 0, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 1},
                        {0, 1, 0, 0}
                };
        int[][] arr2 = new int[][]{

                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 1, 0, 0},
                        {1, 1, 1, 1, 0}

        };
        System.out.println(getDirection(arr, 0, 2));
        System.out.println("-");
        System.out.println(getDirection(arr2, 1,4));

    }

    public static boolean getDirection(int[][] matrix, int from, int to) {

        //프롬에서 투로 가는 길 찾기
        //프롬의 행에서 모두 순회하여 to로 가는 1확인하기
        //없다면 다른 경로를 from에 할당하여 탐색
        //from 행에서 다시 탐색 반복 ; 단, 순회 끝행렬은 가지 않음
        //to==1 이면 true;
        //증감연산자
        boolean result =false;
        if (matrix[from][to] == 1) {
            return true;
        } else {
            for (int i = 0; i < matrix[1].length; i++) {
                if (matrix[from][i] == 1) {
                    matrix[from][i]=0;
                    result = getDirection(matrix, i, to);
                }
                }
            }
        return result;
        }
    }

