import java.util.Scanner; // 插入輸入模組

public class JPA104 { // 定義一個公開的類 JPA104
    public static void main(String[] args) { // 主方法
        Scanner a = new Scanner(System.in); // 創建一個 Scanner 對象
        
        System.out.println("輸入第1組的x和y座標"); 
        double x1 = a.nextDouble(); // 從輸入中讀取一個 double 類型的數，並存入變量 x1 中
        double y1 = a.nextDouble(); // 從輸入中讀取一個 double 類型的數，並存入變量 y1 中
        
        System.out.println("輸入第2組的x和y座標:");
        double x2 = a.nextDouble(); // 從輸入中讀取一個 double 類型的數，並存入變量 x2 中
        double y2 = a.nextDouble(); // 從輸入中讀取一個 double 類型的數，並存入變量 y2 中
        
        double total = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); // 使用 Math 模組計算兩點之間的距離
        System.out.printf("介於<%.2f, %.2f>和<%.2f, %.2f>之間的距離是%.2f", x1, y1, x2, y2, total); // 輸出結果
        a.close(); // 關閉 Scanner 
    }
}
