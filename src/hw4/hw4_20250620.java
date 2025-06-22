package hw4;

import java.util.Scanner;

public class hw4_20250620 {
	public static void main(String[] aegs) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		int sum = 0;
		int averageValue = 0;

		for (int i = 0; i < array.length; i++ ) {
			sum += array[i];
		}
		averageValue = sum / array.length;
		System.out.println("元素的平均值：" + averageValue);
		System.out.print("大於平均值：");
		for (int j = 0; j < array.length; j++) {
			if (averageValue < array[j]) {
				System.out.print(array[j] + " ");
			}	
		}
		System.out.println();
		
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
		String s = "Hello World"; 
		int e = s.length() - 1;
		System.out.print("執行結果為：");
		for(int s1 = e; s1 >= 0; s1 -= 1) {
			System.out.print(s.charAt(s1));
		}
		System.out.println();
		
//		有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] str = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		
		int total = 0, totala = 0, totale = 0, totali = 0, totalo = 0, totalu = 0;
		for(int n = 0; n < str.length; n++) {
			for(int i = 0; i < str[n].length(); i++) {
				char str1 = str[n].charAt(i);
				if(str1 ==  'a') {
					totala += 1;
				}else if(str1 == 'e') {
					totale += 1;
				}else if(str1 == 'i') {
					totali += 1;
				}else if(str1 == 'o') {
					totalo += 1;
				}else if(str1 == 'u') {
					totalu += 1;
				}
				total = totala + totale + totali + totalo + totalu;
				
			}
		}
		System.out.println("陣列內母音共有：" + total);
		
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		int[][] x = {
			{25, 32, 8, 19, 27},
			{2500, 800, 500, 1000, 1200}
		};
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入小華欲借金額：");
		int m = sc.nextInt();
		System.out.println("可借的員工編號：");
		
		for(int i = 0; i < x[1].length; i++) {
			if(m <= x[1][i]) {
				System.out.print(x[1][i] + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.print("共有" + count + "人可以借");
		System.out.println();
		
//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
		int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
		int dateNum = 0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請輸入西元yyyy年：");
		int yyyy = sc1.nextInt();
		System.out.println("請輸入西元mm月：");
		int mm = sc1.nextInt();
		System.out.println("請輸入西元dd日：");
		int dd = sc1.nextInt();
		if(yyyy % 4 == 0) {
			day[1] = 29;
		}
		if(mm < 1 || mm > 12 || dd < 1 || dd > day[mm-1]) {
			System.out.println("輸入日期錯誤");
		}else {
			for(int i = 0; i < (mm-1); i++) {
				dateNum += day[i];
			}
			dateNum += dd;
			System.out.print(dateNum);
		}
		
//		班上有8位同學，他們進行了6次考試結果如下：
//		請算出每位同學考最高分的次數
		int[][] score = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
		};
		int[] num = new int[8];
		
		for(int i = 0; i < score.length; i++) {
			int max = score[i][0];
			
			for(int j = 1; j < score[i].length; j++) {
				if(score[i][j] > max) {
					max = score[i][j];
				}
			}
			
			for(int y = 0; y < score[i].length; y++) {
				if(score[i][y] == max) {
					num[y]++;
				}
			}
		}
		
		for(int x = 0; x < num.length; x++) {
			System.out.println((x+1) + "號同學最高分次數：" + num[x]);
		}
		
	}
}
