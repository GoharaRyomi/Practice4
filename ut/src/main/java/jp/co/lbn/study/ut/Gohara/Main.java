package jp.co.lbn.study.ut.Gohara;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Main {
    //スタティック初期化子
    static {
        try {
            // UTF-8を使用するPrintStreamを作成し、System.outに設定
            PrintStream out = new PrintStream(System.out, true, "UTF-8");
            System.setOut(out);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        QuestionViewer viewer = new QuestionViewer();
        int flg = 0;
        while(flg == 0) {
            viewer.askQuestion1();
            viewer.Secret();
            viewer.askQuestion2();
            viewer.askQuestion3();
            viewer.askQuestion4();
            flg = viewer.askQuestion5();
        }

    }
}