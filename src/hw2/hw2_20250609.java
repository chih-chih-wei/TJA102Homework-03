package hw2;

public class hw2_20250609 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum = 0;
		for(int even = 0; even <= 1000; even+=2) {
			sum += even;
		}
		System.out.println(sum);
		
//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int product = 1;
		for(int num = 1; num <= 10; num++) {
			product *= num;
		}
		System.out.println(product);
		
//		• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int product1 = 1, num = 1;
		while(num <= 10) {
			product1 *= num;
			num++;
		}
		System.out.println(product1);
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int num2 = 1;
		while(num2 <= 10) {
			int answer = num2 * num2;
			System.out.print(answer + " ");
			num2++;
		}
		System.out.println();
//		• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		for(int num5 = 1; num5 <= 49; num5++) {
			int tens = num5 / 10;
			int ones = num5 % 10;
			if(tens != 4 && ones != 4) {
				System.out.print(num5 + " ");
			}
		}
		
		System.out.println();
//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		for(int i = 10; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
		System.out.println(i);
		}
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		for(char num4 = 'A'; num4 <= 'F'; num4++) {
			int count = num4 - 'A' + 1;
			int i = 0;
			while(i < count) {
				System.out.print(num4);
				i++;
			}
		System.out.println();
		}
		
	}

}
