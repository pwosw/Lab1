public class JPA107_2 { // 定義一個公開的類 JPA107_2
    public static void main(String argv[]) { // 主方法
        int action = 1, skill = 2, teamgame = 3; // 定義三個整數變量

        // 輸出籃球的成績，並呼叫 Basketball 類的 cal 方法計算成績
        System.out.println("The basketball grade is " + Basketball.cal(action, skill, teamgame));

        // 輸出棒球的成績，並呼叫 Baseball 類的 cal 方法計算成績
        System.out.println("The baseball grade is " + Baseball.cal(skill, teamgame));
    }
}

class Basketball { // 定義籃球類別
    public static int cal(int a, int s, int t) { // 定義 cal 方法計算籃球成績
        return a + s + t; // 返回計算的成績
    }
}

class Baseball { // 定義棒球類別
    public static int cal(int s, int t) { // 定義 cal 方法計算棒球成績
        return 10 + s + t; // 返回計算的成績
    }
}
