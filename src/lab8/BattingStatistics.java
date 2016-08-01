package lab8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingStatistics {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("please enter the number of at bats");
		int numOfBats = scan1.nextInt();
		scan1.nextLine();
		int[] atBatResults = new int[numOfBats];
		int result = 0;
		int totalNumOfAtBatsEarningAtLeast1 = 0;
		int totalNumOfBasesEarned = 0;
		for (int i = 0; i < numOfBats; i++) {
			System.out
					.println("Enter the at number of bases earned for at bat #"
							+ (i + 1));
			result = scan1.nextInt();
			scan1.nextLine();
			atBatResults[i] = result;
			totalNumOfBasesEarned = totalNumOfBasesEarned + result;
			if (result >= 1) {
				totalNumOfAtBatsEarningAtLeast1++;
			}
		}

		DecimalFormat df = new DecimalFormat("#.000");
		double battingAvg = 0.0;
		double sluggingPercent = 0;
		System.out.println(totalNumOfAtBatsEarningAtLeast1);
		System.out.println(totalNumOfBasesEarned);
		System.out.println(numOfBats);
		battingAvg = totalNumOfAtBatsEarningAtLeast1 / (double) numOfBats;
		System.out.println(df.format(battingAvg));
		sluggingPercent = totalNumOfBasesEarned / (double) numOfBats;
		System.out.println(df.format(sluggingPercent));

		scan1.close();
	}

}
