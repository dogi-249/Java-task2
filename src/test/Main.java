package test;

import test.Player;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int id;
        String result = "対象のデータは存在しません。";

        List<Player> players = List.of(
                new Player(1,"クリスティアーノ・ロナウド", 137, "マンチェスター・ユナイテッド"),
                new Player(2,"リオネル・メッシ", 121, "パリ・サンジェルマン"),
                new Player(3,"ネイマール", 109, "パリ・サンジェルマン"),
                new Player(4,"キリアン・ムバッペ", 46, "パリ・サンジェルマン"),
                new Player(5,"モハメド・サラー", 45, "リヴァプール"),
                new Player(6,"ロベルト・レバンドフスキ", 39, "バイエルン・ミュンヘン"),
                new Player(7,"アンドレス・イニエスタ", 39, "ヴィッセル神戸"),
                new Player(8,"ポール・ポグバ", 37, "マンチェスター・ユナイテッド"),
                new Player(9,"ギャレス・ベイル", 35, "レアル・マドリード"),
                new Player(10,"エデン・アザール", 32, "レアル・マドリード")
        );

        System.out.println("【2022年】海外サッカー選手年俸ランキングTOP10");
        for(Player player : players){
            System.out.println(player.getId() + "位：" + player.getName());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("1~10の数字を入力して下さい。");

        while(true) {
            try {
                id = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("1~10の数字を入力して下さい。");
                sc.nextLine();
            }
        }
        sc.close();

        for(Player player : players){
            if(player.getId() == id){
                result = player.getTeam() + "所属の" + player.getName() + "は" + "年俸" + player.getSalary() + "億円です。";
            }
        }

        System.out.println(result);

    }
}
