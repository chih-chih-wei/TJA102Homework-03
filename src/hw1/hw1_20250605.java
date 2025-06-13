package hw1;

public class hw1_20250605 {
	public static void main(String[] args) {
		
		//請設計一隻Java程式，計算12，6這兩個數值的和與積
		int num1 = 12, num2 = 6;
		System.out.println("第一題：");
		System.out.println("12與6兩個數值之和：" + (num1 + num2));
		System.out.println("12與6兩個數值之積："+ (num1 * num2));
		
		//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg = 200, dozen = egg / 12, piece = egg % 12;
		System.out.println("第二題：");
		System.out.println("計算200顆蛋共計" + dozen + "打又" + piece + "顆");
		
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int num3 = 256559, day = 24 * 60 * 60, hour = 60 * 60, minute = 60;
		int days = num3 / day;
		int hours = num3 % day / hour;
		int minutes = (num3 - ((days * day) + (hours * hour))) / minute;
		int seconds = num3 - ((days * day) + (hours * hour) + (minutes * minute));
		
		System.out.println("第三題：");
		System.out.println("256559秒為" + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");
		
		//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		int r = 5;
		System.out.println("第四題：");
		System.out.println("半徑為5的圓面積：" + (r * r * pi));
		System.out.println("半徑為5的圓周長："+ (2 * r * pi));
		
		//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，
		//本金加利息共有多少錢 (用複利計算，公式請自行google)
		int m = 1500000, y = 10;
		double ir = 0.02;
		double m2 = m * (Math.pow((1 + ir), y));
		System.out.println("第五題：");
		System.out.println("本金加利息共計：" + m2 + "元");
		
		//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		//5 + 5
		//5 + ‘5’
		//5 + “5”
		//並請用註解各別說明答案的產生原因
		System.out.println("第六題：");
		System.out.println(5 + 5);   // 兩者皆為數字，故相加後為10
		System.out.println(5 + '5'); // '5'為ASCII(美國國家標準資訊交換碼)對照過後為53，53+5=58
		System.out.println(5 + "5"); // 5為 int 整數，"5"為 String 字串，兩者適合不同類型合併為55
	}
}
