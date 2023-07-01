import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BoxBoxing {


    public static void main(String[] args) {
        Integer[] list = new Integer[]{5,1,4,6,4,4,4,4,4,4,4,4,4,3,7,1,2,3,4,5,6,7,8,9,0,0,0};

        System.out.println(paveBox(list));
        ArrayList<?> list2 = new ArrayList<>(3){};

        Queue<Integer> Que = new LinkedList<>();
    }
    public static int paveBox(Integer[] boxes) {
        // TODO:


        int num = 0;
        int cnt = 0;
        for (int j =0; j < boxes.length-1; j++){
            for (int i = j+1; i <boxes.length; i++){
                cnt++;
                if (boxes[j]<boxes[i]){
                    if(num<cnt){
                        num=cnt;
                        cnt=0;
                        break;
                    }
                    else{
                        cnt=0;
                        break;
                    }
                }
            }
        }
        return num;
    }
}