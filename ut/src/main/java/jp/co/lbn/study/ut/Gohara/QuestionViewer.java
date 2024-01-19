package jp.co.lbn.study.ut.Gohara;
import java.util.*;

public class QuestionViewer {
    public String[] answer = new String[7];
    Scanner scanner = new Scanner(System.in);

    public static String ansID = null;

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
                case "0":
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

    public void Secret() {
        if (Objects.equals(answer[0], "0")) {
            System.out.println("Question繝偵Α繝");
            System.out.print("IT関係の方ですか？");
            System.out.print("1:はい,2:いいえ");
            System.out.print(">");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
            }
            System.out.println("はい");
            System.out.println("Question繧ｸ繝｣繝ｯ繝?ぅ繝ｼ");
            System.out.print("珍しいものはお好きですか？");
            System.out.print("1:はい,2:いいえ");
            System.out.print(">");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
            System.out.println("はい");

            System.out.println("Question縺顔夢繧梧ｧ倥〒縺励◆");
            System.out.print("勉強会、お疲れ様でした");
            System.out.print("1:お疲れ様でした,2:お疲れ様でした");
            System.out.print(">");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
            System.out.println("お疲れ様でした");

            System.out.println("そんなあなたにおすすめなのは…");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
            System.out.println("Javaティー,Chocolatey Cokkie,RasberryPie(タルト)");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException ex) {
            }
            System.out.println("ご指導いただきありがとうございました！");
            System.exit(0);
        }else {
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
                case "1", "2", "3" -> flg = false;
                default -> {
                    System.out.print("申し訳ございません。選択肢からお選びください");
                    System.out.print("1:いいね！,2:まぁまぁかな,3:いやだなぁ…");
                    System.out.print(">");
                }
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
                case "1", "2", "3" -> flg = false;
                default -> {
                    System.out.print("申し訳ございません。選択肢からお選びください");
                    System.out.print("1:温かいのがいい,2:どちらでも,3:冷たいのがいい");
                    System.out.print(">");
                }
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
        ansID = answer[0] + answer[1] + answer[2] + answer[3] + answer[4];


        DishList.MakeAndShowList();

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
