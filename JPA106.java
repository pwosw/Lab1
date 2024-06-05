public class JPA106 { // 定義一個公開的類 JPA106
    public static void main(String[] args) { // 主方法，是程序的入口
        System.out.printf("f<-3.2> = %.4f\n", f(-3.2)); // 格式化輸出函數 f 在 x = -3.2 時的結果
        System.out.printf("f<-2.1> = %.4f\n", f(-2.1)); // 格式化輸出函數 f 在 x = -2.1 時的結果
        System.out.printf("f<0> = %.4f\n", f(0)); // 格式化輸出函數 f 在 x = 0 時的結果
        System.out.printf("f<2.1> = %.4f\n", f(2.1)); // 格式化輸出函數 f 在 x = 2.1 時的結果
    }

    static double f(double x) { // 定義一個靜態方法 f，接受一個 double 型參數 x，返回一個 double 型結果
        return 3 * Math.pow(x, 3) + 2 * x - 1; // 計算並返回 3x^3 + 2x - 1 的結果
    }
}
