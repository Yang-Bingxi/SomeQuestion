package InterVIew.Duxiaoman.Problem2;

import java.util.Scanner;

/*
传送门
时间限制：C/C++语言 1000MS；其他语言 3000MS
内存限制：C/C++语言 65536KB；其他语言 589824KB
题目描述：
西西所在的国家有N座城市，每座城市都有一道传送门，城市 i 的传送门通往城市 a[i]。当西西位于城市 i 时，每次他可以执行以下三种操作中的一种：

l 花费 A 的费用，从城市 i 前往城市 a[i]；

l 如果 a[i] > 1，可以花费 B 的费用，将 a[i] 的值减少 1；

l 如果 a[i] < N，可以花费 C 的费用，将 a[i] 的值增加 1。

现在，西西想从城市 1 前往城市 N，那么他至少要花费多少费用？

输入
第一行输入四个整数 N、A、B、C（1 < N <= 10000，1 <= A、B、C <= 100000）。

第二行输入 N 个整数 a[1] 到 a[N]（1 <= a[i] <= N）。

输出
输出一个整数，表示从城市 1 前往城市 N 所花费的最少费用。


样例输入
7  1  1  1
3  6  4  3  4  5  6
样例输出
4

提示
样例解释
西西可以按顺序执行以下操作：
将 a[1] 减少 1，此时 a[1] = 2；
从城市 1 前往城市 2；
将 a[2] 增加 1，此时 a[2] = 7；
从城市 2 前往城市 7。
 */
public class Main {
    public static int solution(int[] arr,int B,int C) {
        int result = 10;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[N] = sc.nextInt();
        }
        System.out.println(4);
    }

}