import java.util.Scanner; // 插入輸入模組

public class JPA103 { // 定義一個公開的類 JPA103
    public static void main(String[] args) { // 主方法
        Scanner a = new Scanner(System.in); // 創建一個 Scanner 
        System.out.println("Please input: "); // 輸出提示訊息，要求使用者輸入
        int num1 = a.nextInt(); // 從輸入中讀取一個 int 類型的數，並存入變量 num1 中
        int num2 = a.nextInt(); // 從輸入中讀取一個 int 類型的數，並存入變量 num2 中
        int num3 = a.nextInt(); // 從輸入中讀取一個 int 類型的數，並存入變量 num3 中
        double average = (num1 + num2 + num3) / 3.0; // 計算三平均值
        System.out.printf("Average: %.2f", average); // 使用 printf 格式化輸出
        a.close(); // 關閉 Scanner 
    }
}
