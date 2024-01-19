
package jp.co.lbn.study.ut.Gohara;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class QuestionViewer {
    public String[] answer = new String[7];
    Scanner scanner = new Scanner(System.in);

    public void askQuestion1() {
        System.out.println("Question1");
        System.out.print("デザートをお望みですか？");
        System.out.print("1:はい,2:いいえ");
        System.out.print(">");
        boolean flg = true;
        String ans;
        while (flg) {
            ans = scanner.next();
            switch (ans) {
                case "1":
                case "2":
                    flg = false;
                    break;
                default:
                    System.out.print("申し訳ありません、どちらかでお答えください。");
                    System.out.print("1:はい,2:いいえ");
                    System.out.print(">");
                    break;
            }
            answer[0] = ans;
        }

    }

    public void askQuestion2() {
        System.out.println("Question2");
        System.out.print("なるほど…ちなみにジャンクフードやコンビニ飯はどうですか？");
        String question = "";
        System.out.print("1:いいね！,2:まぁまぁかな,3:いやだなぁ…");
        System.out.print(">");
        boolean flg = true;
        String ans;
        while (flg) {
            ans = scanner.next();
            switch (ans) {
                case "1":
                case "2":
                case "3":
                    flg = false;
                    break;
                default:
                    System.out.print("申し訳ございません。選択肢からお選びください");
                    System.out.print("1:いいね！,2:まぁまぁかな,3:いやだなぁ…");
                    System.out.print(">");
                    break;
            }
            answer[1] = ans;
        }
    }

    public void askQuestion3() {
        System.out.println("Question3");
        System.out.print("ふむふむ…では、胃腸は丈夫で、睡眠等も心配や不安がありませんか？");
        String question = "";
        System.out.print("1:完璧だよ！,2:まぁ、特には,3:いや…");
        System.out.print(">");
        boolean flg = true;
        String ans;
        while (flg) {
            ans = scanner.next();
            switch (ans) {
                case "1":
                case "2":
                case "3":
                    flg = false;
                    break;
                default:
                    System.out.print("申し訳ございません。選択肢からお選びください");
                    System.out.print("1:完璧だよ！,2:まぁ、特には,3:いや…");
                    System.out.print(">");
                    break;
            }
            answer[2] = ans;
        }
    }

    public void askQuestion4() {
        System.out.println("Question4");
        System.out.print("ありがとうございます！では、温かいのと冷たいの、どちらがいいですか？");
        String question = "";
        System.out.print("1:温かいのがいい,2:どちらでも,3:冷たいのがいい");
        System.out.print(">");
        boolean flg = true;
        String ans;
        while (flg) {
            ans = scanner.next();
            switch (ans) {
                case "1":
                case "2":
                case "3":
                    flg = false;
                    break;
                default:
                    System.out.print("申し訳ございません。選択肢からお選びください");
                    System.out.print("1:温かいのがいい,2:どちらでも,3:冷たいのがいい");
                    System.out.print(">");
                    break;
            }
            answer[3] = ans;
        }
    }

    public int askQuestion5() {
        System.out.println("Question5");
        System.out.print("最後です！この後、人と会う予定がありますか？");
        String question = "";
        System.out.print("1:あるなぁ…,2:いや、ないよ");
        System.out.print(">");
        boolean flg = true;
        String ans = null;
        while (flg) {
            ans = scanner.next();
            switch (ans) {
                case "1":
                case "2":
                    flg = false;
                    break;
                default:
                    System.out.print("申し訳ございません。選択肢からお選びください");
                    System.out.print("1:あるなぁ…,2:いや、ないよ");
                    System.out.print(">");
                    break;
            }
            answer[4] = ans;
        }

        //入力された回答を表示する
        int i = 0;
        while (i < 5) {
            System.out.println(answer[i]);
            i++;
        }
        //回答に対する提案を表示する
        System.out.println("そんなあなたにおすすめなのは…");
        String ansID = answer[0] + answer[1] + answer[2] + answer[3] + answer[4];

        // 連想配列の二次元配列を作成
        Map<String, List<String>> myMap = new HashMap<>();

        /*11111に対するリストを作成*/ List<String> List11111 = new ArrayList<>(); List11111.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人と会う"); List11111.add("さっとしっかり温か"); List11111.add("あんまん,ハニートースト"); myMap.put("11111",List11111);
        /*11112に対するリストを作成*/ List<String> List11112 = new ArrayList<>(); List11112.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人とは会わない"); List11112.add("さっとしっかり温か"); List11112.add(""); myMap.put("11112",List11112);
        /*11121に対するリストを作成*/ List<String> List11121 = new ArrayList<>(); List11121.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人と会う"); List11121.add("さっとしっかり温か"); List11121.add(""); myMap.put("11121",List11121);
        /*11122に対するリストを作成*/ List<String> List11122 = new ArrayList<>(); List11122.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人とは会わない"); List11122.add("さっとしっかり温か"); List11122.add(""); myMap.put("11122",List11122);
        /*11131に対するリストを作成*/ List<String> List11131 = new ArrayList<>(); List11131.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人と会う"); List11131.add("さっとしっかり温か"); List11131.add(""); myMap.put("11131",List11131);
        /*11132に対するリストを作成*/ List<String> List11132 = new ArrayList<>(); List11132.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人とは会わない"); List11132.add("さっとしっかり温か"); List11132.add(""); myMap.put("11132",List11132);
        /*11211に対するリストを作成*/ List<String> List11211 = new ArrayList<>(); List11211.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人と会う"); List11211.add("さっとしっかり温か"); List11211.add(""); myMap.put("11211",List11211);
        /*11212に対するリストを作成*/ List<String> List11212 = new ArrayList<>(); List11212.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人とは会わない"); List11212.add("さっとしっかり温か"); List11212.add(""); myMap.put("11212",List11212);
        /*11221に対するリストを作成*/ List<String> List11221 = new ArrayList<>(); List11221.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人と会う"); List11221.add("さっとしっかり温か"); List11221.add(""); myMap.put("11221",List11221);
        /*11222に対するリストを作成*/ List<String> List11222 = new ArrayList<>(); List11222.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人とは会わない"); List11222.add("さっとしっかり温か"); List11222.add(""); myMap.put("11222",List11222);
        /*11231に対するリストを作成*/ List<String> List11231 = new ArrayList<>(); List11231.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人と会う"); List11231.add("さっとしっかり温か"); List11231.add(""); myMap.put("11231",List11231);
        /*11232に対するリストを作成*/ List<String> List11232 = new ArrayList<>(); List11232.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人とは会わない"); List11232.add("さっとしっかり温か"); List11232.add(""); myMap.put("11232",List11232);
        /*11311に対するリストを作成*/ List<String> List11311 = new ArrayList<>(); List11311.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,温かいのが良い,この後人と会う"); List11311.add("さっとしっかり温か"); List11311.add(""); myMap.put("11311",List11311);
        /*11312に対するリストを作成*/ List<String> List11312 = new ArrayList<>(); List11312.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,温かいのが良い,この後人とは会わない"); List11312.add("さっとしっかり温か"); List11312.add(""); myMap.put("11312",List11312);
        /*11321に対するリストを作成*/ List<String> List11321 = new ArrayList<>(); List11321.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,常温くらいがよい,この後人と会う"); List11321.add("さっとしっかり温か"); List11321.add(""); myMap.put("11321",List11321);
        /*11322に対するリストを作成*/ List<String> List11322 = new ArrayList<>(); List11322.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,常温くらいがよい,この後人とは会わない"); List11322.add("さっとしっかり温か"); List11322.add(""); myMap.put("11322",List11322);
        /*11331に対するリストを作成*/ List<String> List11331 = new ArrayList<>(); List11331.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,冷たいのが良い,この後人と会う"); List11331.add("さっとしっかり温か"); List11331.add(""); myMap.put("11331",List11331);
        /*11332に対するリストを作成*/ List<String> List11332 = new ArrayList<>(); List11332.add("スイーツ,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,冷たいのが良い,この後人とは会わない"); List11332.add("さっとしっかり温か"); List11332.add(""); myMap.put("11332",List11332);
        /*12111に対するリストを作成*/ List<String> List12111 = new ArrayList<>(); List12111.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人と会う"); List12111.add("さっとしっかり温か"); List12111.add(""); myMap.put("12111",List12111);
        /*12112に対するリストを作成*/ List<String> List12112 = new ArrayList<>(); List12112.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人とは会わない"); List12112.add("さっとしっかり温か"); List12112.add(""); myMap.put("12112",List12112);
        /*12121に対するリストを作成*/ List<String> List12121 = new ArrayList<>(); List12121.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人と会う"); List12121.add("さっとしっかり温か"); List12121.add(""); myMap.put("12121",List12121);
        /*12122に対するリストを作成*/ List<String> List12122 = new ArrayList<>(); List12122.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人とは会わない"); List12122.add("さっとしっかり温か"); List12122.add(""); myMap.put("12122",List12122);
        /*12131に対するリストを作成*/ List<String> List12131 = new ArrayList<>(); List12131.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人と会う"); List12131.add("さっとしっかり温か"); List12131.add(""); myMap.put("12131",List12131);
        /*12132に対するリストを作成*/ List<String> List12132 = new ArrayList<>(); List12132.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人とは会わない"); List12132.add("さっとしっかり温か"); List12132.add(""); myMap.put("12132",List12132);
        /*12211に対するリストを作成*/ List<String> List12211 = new ArrayList<>(); List12211.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人と会う"); List12211.add("さっとしっかり温か"); List12211.add(""); myMap.put("12211",List12211);
        /*12212に対するリストを作成*/ List<String> List12212 = new ArrayList<>(); List12212.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人とは会わない"); List12212.add("さっとしっかり温か"); List12212.add(""); myMap.put("12212",List12212);
        /*12221に対するリストを作成*/ List<String> List12221 = new ArrayList<>(); List12221.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人と会う"); List12221.add("さっとしっかり温か"); List12221.add(""); myMap.put("12221",List12221);
        /*12222に対するリストを作成*/ List<String> List12222 = new ArrayList<>(); List12222.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人とは会わない"); List12222.add("さっとしっかり温か"); List12222.add(""); myMap.put("12222",List12222);
        /*12231に対するリストを作成*/ List<String> List12231 = new ArrayList<>(); List12231.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人と会う"); List12231.add("さっとしっかり温か"); List12231.add(""); myMap.put("12231",List12231);
        /*12232に対するリストを作成*/ List<String> List12232 = new ArrayList<>(); List12232.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人とは会わない"); List12232.add("さっとしっかり温か"); List12232.add(""); myMap.put("12232",List12232);
        /*12311に対するリストを作成*/ List<String> List12311 = new ArrayList<>(); List12311.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,温かいのが良い,この後人と会う"); List12311.add("さっとしっかり温か"); List12311.add(""); myMap.put("12311",List12311);
        /*12312に対するリストを作成*/ List<String> List12312 = new ArrayList<>(); List12312.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,温かいのが良い,この後人とは会わない"); List12312.add("さっとしっかり温か"); List12312.add(""); myMap.put("12312",List12312);
        /*12321に対するリストを作成*/ List<String> List12321 = new ArrayList<>(); List12321.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,常温くらいがよい,この後人と会う"); List12321.add("さっとしっかり温か"); List12321.add(""); myMap.put("12321",List12321);
        /*12322に対するリストを作成*/ List<String> List12322 = new ArrayList<>(); List12322.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,常温くらいがよい,この後人とは会わない"); List12322.add("さっとしっかり温か"); List12322.add(""); myMap.put("12322",List12322);
        /*12331に対するリストを作成*/ List<String> List12331 = new ArrayList<>(); List12331.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,冷たいのが良い,この後人と会う"); List12331.add("さっとしっかり温か"); List12331.add(""); myMap.put("12331",List12331);
        /*12332に対するリストを作成*/ List<String> List12332 = new ArrayList<>(); List12332.add("スイーツ,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,冷たいのが良い,この後人とは会わない"); List12332.add("さっとしっかり温か"); List12332.add(""); myMap.put("12332",List12332);
        /*13111に対するリストを作成*/ List<String> List13111 = new ArrayList<>(); List13111.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人と会う"); List13111.add("さっとしっかり温か"); List13111.add(""); myMap.put("13111",List13111);
        /*13112に対するリストを作成*/ List<String> List13112 = new ArrayList<>(); List13112.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人とは会わない"); List13112.add("さっとしっかり温か"); List13112.add(""); myMap.put("13112",List13112);
        /*13121に対するリストを作成*/ List<String> List13121 = new ArrayList<>(); List13121.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人と会う"); List13121.add("さっとしっかり温か"); List13121.add(""); myMap.put("13121",List13121);
        /*13122に対するリストを作成*/ List<String> List13122 = new ArrayList<>(); List13122.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人とは会わない"); List13122.add("さっとしっかり温か"); List13122.add(""); myMap.put("13122",List13122);
        /*13131に対するリストを作成*/ List<String> List13131 = new ArrayList<>(); List13131.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人と会う"); List13131.add("さっとしっかり温か"); List13131.add(""); myMap.put("13131",List13131);
        /*13132に対するリストを作成*/ List<String> List13132 = new ArrayList<>(); List13132.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人とは会わない"); List13132.add("さっとしっかり温か"); List13132.add(""); myMap.put("13132",List13132);
        /*13211に対するリストを作成*/ List<String> List13211 = new ArrayList<>(); List13211.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人と会う"); List13211.add("さっとしっかり温か"); List13211.add(""); myMap.put("13211",List13211);
        /*13212に対するリストを作成*/ List<String> List13212 = new ArrayList<>(); List13212.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人とは会わない"); List13212.add("さっとしっかり温か"); List13212.add(""); myMap.put("13212",List13212);
        /*13221に対するリストを作成*/ List<String> List13221 = new ArrayList<>(); List13221.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人と会う"); List13221.add("さっとしっかり温か"); List13221.add(""); myMap.put("13221",List13221);
        /*13222に対するリストを作成*/ List<String> List13222 = new ArrayList<>(); List13222.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人とは会わない"); List13222.add("さっとしっかり温か"); List13222.add(""); myMap.put("13222",List13222);
        /*13231に対するリストを作成*/ List<String> List13231 = new ArrayList<>(); List13231.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人と会う"); List13231.add("さっとしっかり温か"); List13231.add(""); myMap.put("13231",List13231);
        /*13232に対するリストを作成*/ List<String> List13232 = new ArrayList<>(); List13232.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人とは会わない"); List13232.add("さっとしっかり温か"); List13232.add(""); myMap.put("13232",List13232);
        /*13311に対するリストを作成*/ List<String> List13311 = new ArrayList<>(); List13311.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,温かいのが良い,この後人と会う"); List13311.add("さっとしっかり温か"); List13311.add(""); myMap.put("13311",List13311);
        /*13312に対するリストを作成*/ List<String> List13312 = new ArrayList<>(); List13312.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,温かいのが良い,この後人とは会わない"); List13312.add("さっとしっかり温か"); List13312.add(""); myMap.put("13312",List13312);
        /*13321に対するリストを作成*/ List<String> List13321 = new ArrayList<>(); List13321.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,常温くらいがよい,この後人と会う"); List13321.add("さっとしっかり温か"); List13321.add(""); myMap.put("13321",List13321);
        /*13322に対するリストを作成*/ List<String> List13322 = new ArrayList<>(); List13322.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,常温くらいがよい,この後人とは会わない"); List13322.add("さっとしっかり温か"); List13322.add(""); myMap.put("13322",List13322);
        /*13331に対するリストを作成*/ List<String> List13331 = new ArrayList<>(); List13331.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,冷たいのが良い,この後人と会う"); List13331.add("さっとしっかり温か"); List13331.add(""); myMap.put("13331",List13331);
        /*13332に対するリストを作成*/ List<String> List13332 = new ArrayList<>(); List13332.add("スイーツ,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,冷たいのが良い,この後人とは会わない"); List13332.add("さっとしっかり温か"); List13332.add(""); myMap.put("13332",List13332);
        /*21111に対するリストを作成*/ List<String> List21111 = new ArrayList<>(); List21111.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人と会う"); List21111.add("さっとしっかり温か"); List21111.add(""); myMap.put("21111",List21111);
        /*21112に対するリストを作成*/ List<String> List21112 = new ArrayList<>(); List21112.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人とは会わない"); List21112.add("さっとしっかり温か"); List21112.add(""); myMap.put("21112",List21112);
        /*21121に対するリストを作成*/ List<String> List21121 = new ArrayList<>(); List21121.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人と会う"); List21121.add("さっとしっかり温か"); List21121.add(""); myMap.put("21121",List21121);
        /*21122に対するリストを作成*/ List<String> List21122 = new ArrayList<>(); List21122.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人とは会わない"); List21122.add("さっとしっかり温か"); List21122.add(""); myMap.put("21122",List21122);
        /*21131に対するリストを作成*/ List<String> List21131 = new ArrayList<>(); List21131.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人と会う"); List21131.add("さっとしっかり温か"); List21131.add(""); myMap.put("21131",List21131);
        /*21132に対するリストを作成*/ List<String> List21132 = new ArrayList<>(); List21132.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人とは会わない"); List21132.add("さっとしっかり温か"); List21132.add(""); myMap.put("21132",List21132);
        /*21211に対するリストを作成*/ List<String> List21211 = new ArrayList<>(); List21211.add("食事,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人と会う"); List21211.add("さっとしっかり温か"); List21211.add(""); myMap.put("21211",List21211);
        /*21212に対するリストを作成*/ List<String> List21212 = new ArrayList<>(); List21212.add("食事,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人とは会わない"); List21212.add("さっとしっかり温か"); List21212.add(""); myMap.put("21212",List21212);
        /*21221に対するリストを作成*/ List<String> List21221 = new ArrayList<>(); List21221.add("食事,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人と会う"); List21221.add("さっとしっかり温か"); List21221.add(""); myMap.put("21221",List21221);
        /*21222に対するリストを作成*/ List<String> List21222 = new ArrayList<>(); List21222.add("食事,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人とは会わない"); List21222.add("さっとしっかり温か"); List21222.add(""); myMap.put("21222",List21222);
        /*21231に対するリストを作成*/ List<String> List21231 = new ArrayList<>(); List21231.add("食事,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人と会う"); List21231.add("さっとしっかり温か"); List21231.add(""); myMap.put("21231",List21231);
        /*21232に対するリストを作成*/ List<String> List21232 = new ArrayList<>(); List21232.add("食事,ジャンクフードやコンビニ飯がいい,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人とは会わない"); List21232.add("さっとしっかり温か"); List21232.add(""); myMap.put("21232",List21232);
        /*21311に対するリストを作成*/ List<String> List21311 = new ArrayList<>(); List21311.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,温かいのが良い,この後人と会う"); List21311.add("さっとしっかり温か"); List21311.add(""); myMap.put("21311",List21311);
        /*21312に対するリストを作成*/ List<String> List21312 = new ArrayList<>(); List21312.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,温かいのが良い,この後人とは会わない"); List21312.add("さっとしっかり温か"); List21312.add(""); myMap.put("21312",List21312);
        /*21321に対するリストを作成*/ List<String> List21321 = new ArrayList<>(); List21321.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,常温くらいがよい,この後人と会う"); List21321.add("さっとしっかり温か"); List21321.add(""); myMap.put("21321",List21321);
        /*21322に対するリストを作成*/ List<String> List21322 = new ArrayList<>(); List21322.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,常温くらいがよい,この後人とは会わない"); List21322.add("さっとしっかり温か"); List21322.add(""); myMap.put("21322",List21322);
        /*21331に対するリストを作成*/ List<String> List21331 = new ArrayList<>(); List21331.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,冷たいのが良い,この後人と会う"); List21331.add("さっとしっかり温か"); List21331.add(""); myMap.put("21331",List21331);
        /*21332に対するリストを作成*/ List<String> List21332 = new ArrayList<>(); List21332.add("食事,ジャンクフードやコンビニ飯がいい,胃腸が心配・不安,冷たいのが良い,この後人とは会わない"); List21332.add("さっとしっかり温か"); List21332.add(""); myMap.put("21332",List21332);
        /*22111に対するリストを作成*/ List<String> List22111 = new ArrayList<>(); List22111.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人と会う"); List22111.add("さっとしっかり温か"); List22111.add(""); myMap.put("22111",List22111);
        /*22112に対するリストを作成*/ List<String> List22112 = new ArrayList<>(); List22112.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人とは会わない"); List22112.add("さっとしっかり温か"); List22112.add(""); myMap.put("22112",List22112);
        /*22121に対するリストを作成*/ List<String> List22121 = new ArrayList<>(); List22121.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人と会う"); List22121.add("さっとしっかり温か"); List22121.add(""); myMap.put("22121",List22121);
        /*22122に対するリストを作成*/ List<String> List22122 = new ArrayList<>(); List22122.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人とは会わない"); List22122.add("さっとしっかり温か"); List22122.add(""); myMap.put("22122",List22122);
        /*22131に対するリストを作成*/ List<String> List22131 = new ArrayList<>(); List22131.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人と会う"); List22131.add("さっとしっかり温か"); List22131.add(""); myMap.put("22131",List22131);
        /*22132に対するリストを作成*/ List<String> List22132 = new ArrayList<>(); List22132.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人とは会わない"); List22132.add("さっとしっかり温か"); List22132.add(""); myMap.put("22132",List22132);
        /*22211に対するリストを作成*/ List<String> List22211 = new ArrayList<>(); List22211.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人と会う"); List22211.add("さっとしっかり温か"); List22211.add(""); myMap.put("22211",List22211);
        /*22212に対するリストを作成*/ List<String> List22212 = new ArrayList<>(); List22212.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人とは会わない"); List22212.add("さっとしっかり温か"); List22212.add(""); myMap.put("22212",List22212);
        /*22221に対するリストを作成*/ List<String> List22221 = new ArrayList<>(); List22221.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人と会う"); List22221.add("さっとしっかり温か"); List22221.add(""); myMap.put("22221",List22221);
        /*22222に対するリストを作成*/ List<String> List22222 = new ArrayList<>(); List22222.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人とは会わない"); List22222.add("さっとしっかり温か"); List22222.add(""); myMap.put("22222",List22222);
        /*22231に対するリストを作成*/ List<String> List22231 = new ArrayList<>(); List22231.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人と会う"); List22231.add("さっとしっかり温か"); List22231.add(""); myMap.put("22231",List22231);
        /*22232に対するリストを作成*/ List<String> List22232 = new ArrayList<>(); List22232.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人とは会わない"); List22232.add("さっとしっかり温か"); List22232.add(""); myMap.put("22232",List22232);
        /*22311に対するリストを作成*/ List<String> List22311 = new ArrayList<>(); List22311.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,温かいのが良い,この後人と会う"); List22311.add("さっとしっかり温か"); List22311.add(""); myMap.put("22311",List22311);
        /*22312に対するリストを作成*/ List<String> List22312 = new ArrayList<>(); List22312.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,温かいのが良い,この後人とは会わない"); List22312.add("さっとしっかり温か"); List22312.add(""); myMap.put("22312",List22312);
        /*22321に対するリストを作成*/ List<String> List22321 = new ArrayList<>(); List22321.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,常温くらいがよい,この後人と会う"); List22321.add("さっとしっかり温か"); List22321.add(""); myMap.put("22321",List22321);
        /*22322に対するリストを作成*/ List<String> List22322 = new ArrayList<>(); List22322.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,常温くらいがよい,この後人とは会わない"); List22322.add("さっとしっかり温か"); List22322.add(""); myMap.put("22322",List22322);
        /*22331に対するリストを作成*/ List<String> List22331 = new ArrayList<>(); List22331.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,冷たいのが良い,この後人と会う"); List22331.add("さっとしっかり温か"); List22331.add(""); myMap.put("22331",List22331);
        /*22332に対するリストを作成*/ List<String> List22332 = new ArrayList<>(); List22332.add("食事,ジャンクフードやコンビニ飯もなくはない,胃腸が心配・不安,冷たいのが良い,この後人とは会わない"); List22332.add("さっとしっかり温か"); List22332.add(""); myMap.put("22332",List22332);
        /*23111に対するリストを作成*/ List<String> List23111 = new ArrayList<>(); List23111.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人と会う"); List23111.add("さっとしっかり温か"); List23111.add(""); myMap.put("23111",List23111);
        /*23112に対するリストを作成*/ List<String> List23112 = new ArrayList<>(); List23112.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,温かいのが良い,この後人とは会わない"); List23112.add("さっとしっかり温か"); List23112.add(""); myMap.put("23112",List23112);
        /*23121に対するリストを作成*/ List<String> List23121 = new ArrayList<>(); List23121.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人と会う"); List23121.add("さっとしっかり温か"); List23121.add(""); myMap.put("23121",List23121);
        /*23122に対するリストを作成*/ List<String> List23122 = new ArrayList<>(); List23122.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,常温くらいがよい,この後人とは会わない"); List23122.add("さっとしっかり温か"); List23122.add(""); myMap.put("23122",List23122);
        /*23131に対するリストを作成*/ List<String> List23131 = new ArrayList<>(); List23131.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人と会う"); List23131.add("さっとしっかり温か"); List23131.add(""); myMap.put("23131",List23131);
        /*23132に対するリストを作成*/ List<String> List23132 = new ArrayList<>(); List23132.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が丈夫で心配や不安はない,冷たいのが良い,この後人とは会わない"); List23132.add("さっとしっかり温か"); List23132.add(""); myMap.put("23132",List23132);
        /*23211に対するリストを作成*/ List<String> List23211 = new ArrayList<>(); List23211.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人と会う"); List23211.add("さっとしっかり温か"); List23211.add(""); myMap.put("23211",List23211);
        /*23212に対するリストを作成*/ List<String> List23212 = new ArrayList<>(); List23212.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,温かいのが良い,この後人とは会わない"); List23212.add("さっとしっかり温か"); List23212.add(""); myMap.put("23212",List23212);
        /*23221に対するリストを作成*/ List<String> List23221 = new ArrayList<>(); List23221.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人と会う"); List23221.add("さっとしっかり温か"); List23221.add(""); myMap.put("23221",List23221);
        /*23222に対するリストを作成*/ List<String> List23222 = new ArrayList<>(); List23222.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,常温くらいがよい,この後人とは会わない"); List23222.add("さっとしっかり温か"); List23222.add(""); myMap.put("23222",List23222);
        /*23231に対するリストを作成*/ List<String> List23231 = new ArrayList<>(); List23231.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人と会う"); List23231.add("さっとしっかり温か"); List23231.add(""); myMap.put("23231",List23231);
        /*23232に対するリストを作成*/ List<String> List23232 = new ArrayList<>(); List23232.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸の心配や不安がなくもない・普通,冷たいのが良い,この後人とは会わない"); List23232.add("さっとしっかり温か"); List23232.add(""); myMap.put("23232",List23232);
        /*23311に対するリストを作成*/ List<String> List23311 = new ArrayList<>(); List23311.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,温かいのが良い,この後人と会う"); List23311.add("さっとしっかり温か"); List23311.add(""); myMap.put("23311",List23311);
        /*23312に対するリストを作成*/ List<String> List23312 = new ArrayList<>(); List23312.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,温かいのが良い,この後人とは会わない"); List23312.add("さっとしっかり温か"); List23312.add(""); myMap.put("23312",List23312);
        /*23321に対するリストを作成*/ List<String> List23321 = new ArrayList<>(); List23321.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,常温くらいがよい,この後人と会う"); List23321.add("さっとしっかり温か"); List23321.add(""); myMap.put("23321",List23321);
        /*23322に対するリストを作成*/ List<String> List23322 = new ArrayList<>(); List23322.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,常温くらいがよい,この後人とは会わない"); List23322.add("さっとしっかり温か"); List23322.add(""); myMap.put("23322",List23322);
        /*23331に対するリストを作成*/ List<String> List23331 = new ArrayList<>(); List23331.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,冷たいのが良い,この後人と会う"); List23331.add("さっとしっかり温か"); List23331.add(""); myMap.put("23331",List23331);
        /*23332に対するリストを作成*/ List<String> List23332 = new ArrayList<>(); List23332.add("食事,ジャンクフードやコンビニ飯はナシ,胃腸が心配・不安,冷たいのが良い,この後人とは会わない"); List23332.add("さっとしっかり温か"); List23332.add(""); myMap.put("23332",List23332);

        // 特定のキーにアクセスしてリストの要素にアクセスする例
        List<String> bbValues = myMap.get(ansID);
        System.out.println(bbValues);
        System.out.println(bbValues.get(0));
        System.out.println(bbValues.get(1));
        System.out.println(bbValues.get(2));

        System.out.println("いかがでしたか？");
        System.out.println("1:悪くないね,2:いや、食べたいと思わないよ");
        System.out.print(">");
        flg = true;
        ans = null;
        while (flg) {
            ans = scanner.next();
            switch (ans) {
                case "1":
                case "2":
                    flg = false;
                    break;
                default:
                    System.out.print("申し訳ございません。どちらかでお選びください");
                    System.out.print("1:悪くないね,2:いや、食べたいと思わないよ");
                    System.out.print(">");
                    break;
            }
            answer[5] = ans;
        }
        if (answer[5].equals("1")) {
            System.out.println("ありがとうございます！それでは行ってらっしゃいませ");
        } else {
            System.out.println("申し訳ございません。精進いたします");
        }

        System.out.println("再度実行しますか？");
        System.out.println("1:はい,2:いいえ");
        System.out.print(">");
        flg = true;
        ans = null;
        while (flg) {
            ans = scanner.next();
            switch (ans) {
                case "1":
                case "2":
                    flg = false;
                    break;
                default:
                    System.out.print("申し訳ございません。どちらかでお選びください");
                    System.out.print("1:はい,2:いいえ");
                    System.out.print(">");
                    break;
            }
            answer[6] = ans;
        }
        if (answer[6].equals("1")) {
            return 0;
        }else{
            return 1;
        }
    }
}
