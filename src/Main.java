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
        Map<Integer,String> studentMap2 = new HashMap<>(studentMap);
        System.out.println(studentMap2.size());

        for(int i = 0; i <= studentMap.size(); i ++){
            //削除前のkeyがiの時の値を表示
            System.out.println(i+"回目");
            if(i % 2 ==0){
                System.out.println("iが"+i+"は偶数のため削除");
                studentMap2.remove(i);
                System.out.println("削除後のリストは"+studentMap2);
                System.out.println();
            }else {
                System.out.println("iが" + i + "で奇数なので削除はなし。");
                System.out.println();
            }
        }

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

