import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-".repeat(60));
        System.out.println("ArrayList");
        ArrayList<String> strList = new ArrayList<>();


        strList.add("java");
        strList.add("egg");
        strList.add("tree");

        int size = strList.size();

        String skill = strList.get(0);

        for (String i : strList){
            System.out.println(i);
        }
        for (int i = 0; i<strList.size(); i++){
            System.out.println(i + " = " + strList.get(i));
        }

        strList.remove(0);

        System.out.println("-".repeat(60));
        System.out.println("LikedList\n");

        LinkedList<String> strList2 = new LinkedList<>();


        strList2.add("python");
        strList2.add("orange");
        strList2.add("apple");
        strList2.add("flower");


        int size2 = strList2.size();

        String skill2 = strList2.get(0);

        for (String str : strList2){
            System.out.println(str);
        }
        for (int i = 0; i < strList2.size(); i++){
            System.out.println(i +" = " + strList2.get(i));
        }

        strList2.remove(0);

        System.out.println("-".repeat(60));
        System.out.println("Iterator\n");




        Iterator<String> iterator = strList2.iterator();   // iterator 사용하여 Iterator 타입의 객체 생성
        while(iterator.hasNext()){  // 해당 객체 다음의 객체가 있는지 탐색. 있으면 true, 없으면 false반환
            String str = iterator.next(); // 객체 반환
            System.out.println(str);
        }



        System.out.println("-".repeat(60));
        System.out.println("HashSet\n");


        HashSet<String> languages = new HashSet<>();

        languages.add("Java");   // 객체 추가
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Java");

        System.out.println(languages.size());  // 객체가 저장되어 있는 수

        Iterator it = languages.iterator();    // 반복자 생성
        while (it.hasNext()){                  // 반복자를 통한 검색
            System.out.println(it.next());
        }


        System.out.println("-".repeat(60));
        System.out.println("TreeSet\n");

        TreeSet<String> workers = new TreeSet<>();

        workers.add("Lee Java");
        workers.add("park Hacker");
        workers.add("Kim coding");
        workers.add("Lee Aava");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Lee"));
        System.out.println(workers.subSet("Kim","Park"));


        System.out.println("-".repeat(60));
        System.out.println("HashMap\n");


        //해쉬맵 객체 생성
        HashMap<String, Integer> map = new HashMap<>();

        map.put("피카츄", 85);  // put(key, value); 로 엔트리 삽입
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 50);
        map.put("피톤투", 15);

        System.out.println("총 entry 수 :" + map.size());

        System.out.println("파이리 : " + map.get("파이리"));   //출력값 파이리 : 50
        Set<String> keySet = map.keySet(); // key를 요소로 가지는 Set을 생성 -> 아래에서 순회하기 위해 필요합니다.

        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){   // keySet을 순회하면서 value를 읽어옵니다.
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : "+ value );
        }
        System.out.println("");

        map.remove("파이리");  //객체 삭제

        System.out.println("총 entry 수 : " + map.size() +"\n");

        // Entry 객체를 요소로 가지는 Set을 생성 -> 아래에서 순회하기 위해 필요합니다.
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        System.out.println(entrySet);
        //entrySet을 순회하면서 value를 읽어옵니다.
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : "+ value);
        }



        System.out.println("-".repeat(60));
        System.out.println("HashTable\n");


        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("Spring", "345");
        hashtable.put("Summer", "678");
        hashtable.put("Fall", "91011");
        hashtable.put("Winter", "1212");

        System.out.println(hashtable);

        Scanner scanner = new Scanner(System.in);





    }


}


