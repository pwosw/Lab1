import java.util.Scanner; // 插入輸入模組，用於從控制台讀取輸入

public class JPA105 { // 定義一個公開的類 JPA105
    public static void main(String[] args) { // 主方法
        Scanner key = new Scanner(System.in); // 創建一個 Scanner 對象
        
        System.out.println("請輸入你的姓名"); 
        String name; // 定義字符串變量 name
        name = key.nextLine(); // 從控制台讀取輸入的姓名
        System.out.println("Hi, " + name + ",請輸入您的銅板的個數"); 
        
        System.out.println("請輸入1元的數量:"); // 請求輸入1元銅板的數量
        int one_coin; // 定義整數變量 one_coin
        one_coin = key.nextInt(); // 從控制台讀取1元銅板的數量

        System.out.println("請輸入5元的數量:"); // 請求輸入5元銅板的數量
        int five_coin; // 定義整數變量 five_coin
        five_coin = key.nextInt(); // 從控制台讀取5元銅板的數量

        System.out.println("請輸入10元的數量:"); // 請求輸入10元銅板的數量
        int ten_coin; // 定義整數變量 ten_coin
        ten_coin = key.nextInt(); // 從控制台讀取10元銅板的數量

        System.out.println("請輸入50元的數量:"); // 請求輸入50元銅板的數量
        int fifty_coin; // 定義整數變量 fifty_coin
        fifty_coin = key.nextInt(); // 從控制台讀取50元銅板的數量

        int total; // 定義整數變量 total 用於存儲總金額
        total = one_coin + (five_coin) * 5 + (ten_coin) * 10 + (fifty_coin) * 50; // 計算總金額

        int a = total / 1000; // 計算千位數
        total %= 1000; // 更新 total，保留千位數後的餘數
        int b = total / 100; // 計算百位數
        total %= 100; // 更新 total，保留百位數後的餘數
        int c = total / 10; // 計算十位數
        total %= 10; // 更新 total，保留十位數後的餘數
        int d = total;
        System.out.printf("您的錢總共有:%d 千 %d 百 %d 十 %d 元", a, b, c, d); // 輸出結果，顯示總金額的千、百、十和個位數
        key.close(); // 關閉 Scanner 對象
    }
}
