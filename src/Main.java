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

        //mainブランチから、feature/removeifに切り替え。map.ofの使用からHashMapに切り替え
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(1,"古田");
        studentMap.put(2,"山田");
        studentMap.put(3,"日野");
        studentMap.put(4,"柴井");
        studentMap.put(5,"高瀬");
        studentMap.put(6,"大久保");
        studentMap.put(7,"村中");
        studentMap.put(8,"権藤");
        studentMap.put(9,"森本");
        studentMap.put(10,"池之上");

        //削除前のstudentMapを表示
        System.out.println("削除前"+studentMap);

        //偶数のみを削除
        studentMap.entrySet().removeIf(entry -> entry.getKey() % 2 == 0);

        //偶数のみを表示
        System.out.println("削除後"+studentMap);


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

