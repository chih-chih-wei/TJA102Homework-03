package hw3;

import java.util.Scanner;

public class hw3_20250616 {
	public static void main(String[] args) {
//		// 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		// 三角形、其它三角形或不是三角形，如圖示結果：
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入三個整數");
//		int data1 = sc.nextInt();
//		int data2 = sc.nextInt();
//		int data3 = sc.nextInt();
//		
//		if ((data1 == data2 && data2 == data3) && data1 == 0) {
//			System.out.println("不是三角形");
//		}else if(data1 == data2 && data2 == data3) {
//			System.out.println("正三角形");
//		}else if (((data1 == data2) && ((data1 + data2) > data3)) || ((data2 == data3) && ((data2 + data3) > data1)) || ((data3 == data1) && ((data3 + data1) > data2))){
//			System.out.println("等腰三角形");
//		}else if (((Math.pow(data1, 2) + Math.pow(data2, 2)) == Math.pow(data3, 2)) || ((Math.pow(data2, 2) + Math.pow(data3, 2)) == Math.pow(data1, 2)) || ((Math.pow(data3, 2) + Math.pow(data1, 2)) == Math.pow(data2, 2))) {
//			System.out.println("直角三角形");
//		}else if (((Math.pow(data1, 2) + Math.pow(data2, 2)) > Math.pow(data3, 2)) && ((Math.pow(data2, 2) + Math.pow(data3, 2)) > Math.pow(data1, 2)) && ((Math.pow(data3, 2) + Math.pow(data1, 2)) > Math.pow(data2, 2))) {
//			System.out.println("其他三角形");
//		}else {
//			System.out.println("不是三角形");
//		}
//		System.out.println("=======================");
		
//		請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲
//		，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("開始猜數字吧！");
//		int num = sc1.nextInt();
//		int ans = (int)Math.random() * 10;
//		
//		while(true) {
//			if(num == ans) {
//				System.out.println("答對了！答案就是" + ans);
//				break;
//			}
//			System.out.println("猜錯囉");
//			num = sc1.nextInt();
//		}
//		System.out.println("=======================");		
		
//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數
		Scanner sc2 = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		int num1 = sc2.nextInt();
		int count = 0;
		
		for(int num2 = 1; num2 <= 49; num2++) {
			int tens = num2 / 10;
			int ones = num2 % 10;
			if(tens != num1 && ones != num1) {
				System.out.print(num2 + "\t");
				count++;			
				
				if(count % 7 == 0) {
					System.out.println();
				}
			}
		}
		System.out.print("總共有" + count + "數字可選");
	}
}
