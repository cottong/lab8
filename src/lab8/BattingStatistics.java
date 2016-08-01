package lab8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingStatistics {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("How many players are there?");
		int numOfPlayers = scan1.nextInt();
		scan1.nextLine();
		int numOfBats = 0;
		int result = 0;
		int totalNumOfAtBatsEarningAtLeast1 = 0;
		int totalNumOfBasesEarned = 0;
		int[][] atBatResults = new int[numOfPlayers][];
		DecimalFormat df = new DecimalFormat("#.000");
		double battingAvg = 0.0;
		double sluggingPercent = 0;
		for (int j = 1; j <= numOfPlayers; j++) {
			System.out.println("Please enter the number of at bats for Player "
					+ j);
			numOfBats = scan1.nextInt();
			scan1.nextLine();

			atBatResults[j - 1] = new int[numOfBats];

			for (int i = 0; i < numOfBats; i++) {
				System.out
						.println("Enter the at number of bases earned for player "
								+ j + " at bat #" + (i + 1));
				result = scan1.nextInt();
				scan1.nextLine();
				atBatResults[j - 1][i] = result;
				
				//totalNumOfBasesEarned = totalNumOfBasesEarned + result;
				//if (result >= 1) { 
				//totalNumOfAtBatsEarningAtLeast1++;
				//}
				 

			}
			result = 0;
			/*battingAvg = totalNumOfAtBatsEarningAtLeast1 / (double) numOfBats;
			System.out.println(df.format(battingAvg));
			sluggingPercent = totalNumOfBasesEarned / (double) numOfBats;
			System.out.println(df.format(sluggingPercent));
			System.out.println(atBatResults.length);*/
		}

		// for(int bat : atBatResults){

		scan1.close();

		int sum = 0;
		int count = 0;
		 for (int k = 0; k <=numOfPlayers - 1; k++){
		 
		for(int l = 0; l < atBatResults[k].length; l++){
		    sum += atBatResults[k][l];
		    if(atBatResults[k][l] >= 1){
		    	count++;
		    }
		}
		sluggingPercent = sum/(double)numOfBats; 
		battingAvg = count/(double)numOfBats;
		//System.out.println(sum);
		//System.out.println(numOfBats);
		System.out.println("The slugging % for Player" + (k+1) + " is " + df.format(sluggingPercent)+ "and the batting average is " + df.format(battingAvg));
		sum=0;
		 }
		
		
	}
}