public class letterCapitalize {
    public static void main(String[] args) {
        String str = "hehehejeje heka";
        str =str.replace("he", "je");
        System.out.println(str);

        String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";
        a= str.replace("대한", "민국");
        System.out.println(a);
    }
    public String letterCapitalize(String str) {
        // TODO:
        for (int i = 0; i<str.length(); i++){
            if (i == 0){
                str.replace(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(0)).toUpperCase());
            }
            if (i>0 && String.valueOf(str.charAt(i-1)).equals(" ")){
                str.replace(String.valueOf(str.charAt(i)), String.valueOf(str.charAt(i)).toUpperCase());
            }
        }return str;

    }
}
