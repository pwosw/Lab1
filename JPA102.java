import java.util.Scanner; // 插入輸入模組，用於從控制台讀取輸入
public class JPA102 { // 定義一個公開的類 JPA102
    public static void main(String[] args) { // 主方法，是程序的入口
        System.out.println("Please input:"); // 輸出提示訊息，要求使用者輸入
        Scanner a = new Scanner(System.in); // 創建一個 Scanner 對象a
        double kg = a.nextDouble(); // 從輸入中讀取一個 double 類型的數
        double Pow = kg * 2.20462; // 轉換
        System.out.println(kg + " kg = " + Pow + " pounds"); // 輸出結果，顯示結果
        a.close(); // 關閉 Scanner 
    }
}
