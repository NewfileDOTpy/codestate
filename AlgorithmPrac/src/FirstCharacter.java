import java.util.Arrays;

public class FirstCharacter {
    public static void main(String[] args) {
        String str = "code states";

        System.out.println(firstCharacter(str));
    }


        public static String firstCharacter(String str) {
            // TODO:
            String[] list = str.split("");
            System.out.println(Arrays.toString(list));
            String result = "";
            for (int i = 0; i < list.length; i++){
                result +=list[i].charAt(0);
                ;
            }return result;
        }



}



