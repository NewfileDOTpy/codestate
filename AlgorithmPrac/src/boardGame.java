public class boardGame {
    public static void main(String[] args) {

    }


    public Integer boardGame(int[][] board, String operation) {
        // TODO:
        int score=0;
        int controller1 = 0;
        int controller2 = 0;

        String[] command = operation.split("");

        for(int i=0; i < command.length; i++){
            switch(command[i]){
                case "U":
                    controller1--;
                    if (controller1 <0 || controller1 > board.length) return null;
                    score += board[controller1][controller2];
                    break;
                case "D":
                    controller1++;
                    if (controller1 > board.length) return null;
                    score += board[controller1][controller2];
                    break;
                case "R":
                    controller2++;
                    if (controller2 > board[0].length) return null;
                    score += board[controller1][controller2];
                    break;
                case "L":
                    controller2--;
                    if (controller2 <0 || controller2 > board[0].length) return null;
                    score += board[controller1][controller2];
                    break;
            }
        }
        return score;
    }

}
