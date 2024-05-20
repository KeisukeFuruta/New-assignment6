import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Mapを作ってください。生徒名と番号の組み合わせ。（1，"江並"）みたいな。
        // Mapの要素は10個以上。
        // Mapの中の番号が偶数のものをMapから削除する。
        // 上記の処理を行う繰り返し処理を実装してください。
        // 削除した状態のものを出力して表示してください
        Map<Integer,String> studentMap = Map.of(1,"古田",2,"山田",
                3,"日野",4,"柴井",5,"高瀬",
                6,"大久保",7,"村中",8,"権藤",
                9,"森本",10,"池之上");
        Map<Integer,String> oddNumberMap = new HashMap<>();
        for(int key : studentMap.keySet()){
            if(key % 2 == 1) {
                //Keyが奇数の値を取得し、標準出力。
                System.out.println(studentMap.get(key));
                //偶数を削除ではなく、奇数のみを出力。
                oddNumberMap.put(key,studentMap.get(key));
            }
        }
        System.out.println(oddNumberMap);

        // 以下前半の課題
        // 生徒名みたいな文字列のリストを作って下さい。
        // リストの数は10個以上。
        // リストに入っている文字数が3文字以上のものを表示する。
        // このリストをループさせて繰り返し処理を実装し、その中で上記条件を満たすものだけ表示する。

       /* List<String> studentList = List.of("古田","山田","日野","柴井","高瀬","大久保","村中","権藤","森本","池之上");
        List<String> result = new ArrayList<>();

        for (String s : studentList) {
            if (s.length() >= 3) {
                result.add(s);
            }
        }
        System.out.println(result);
        System.out.println("3文字以上の名前は以上です。"); */
    }
}

