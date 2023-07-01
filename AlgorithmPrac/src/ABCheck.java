public class ABCheck {
    public static void main(String[] args) {
        System.out.println(ABChecks("lane Borrowed"));
    }

    public static boolean ABChecks(String str) {
        // TODO:
        if (str.length()<5) return false;
        String str1 = str.toLowerCase();

        for(int i=0; i < str1.length()-5; i++){
            if(str1.charAt(i)=='a'){
                if(str1.charAt(i+4)=='b'){
                    return true;
                }
            }
            else if (str1.charAt(i)=='b'){
                if(str1.charAt(i+4)=='a'){
                    return true;
                }
            }

        }return false;







    }
}
