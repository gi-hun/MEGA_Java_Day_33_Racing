package day_35;

import java.util.Random;

// # �渶 ����

public class FileEx11_���� {
	public static void main(String[] args) {

		int horse[][] = new int[5][20];
		Random ran = new Random();
		int max = 20;
		int rank[] = new int[5];
		int total[] = new int[5];
		boolean run = true;
		int count = 1;
		for (int i = 0; i < 20; i++) {
			int check = 0;
			for (int j = 0; j < 5; j++) {
				if (total[j] >= 19) {
					horse[j][i] = 0;
				} else {
					int r = ran.nextInt(4) + 1;
					horse[j][i] = r;
					total[j] = total[j] + horse[j][i];
					if (total[j] >= 19) {
						rank[j] = count++;
						check += 1;
						if (check >= 2) {
							i = -1;
							horse = new int[5][20];
							total = new int[5];
							rank = new int[5];
							count = 1;
							break;
						}
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			// System.out.println(total[i]);
			System.out.println(rank[i]);
		}
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 20; n++) {
				System.out.print(horse[i][n]);
			}
			System.out.println();
		}

		int show[][] = new int[5][20];
		int index[] = new int[5];
		run = true;
		count = 0;
		while (run) {
			for (int i = 0; i < 5; i++) {
				for (int n = 0; n < 20; n++) {
					if (show[i][n] == 0) {
						System.out.print("[ ]");
					} else {
						System.out.print("[��]");
					}
				}
				System.out.println("");
			}
			System.out.println("===============");
			for (int n = 0; n < 5; n++) {
				 show[n][index[n]] = 0;
				 index[n] += horse[n][count]; 
				 if(index[n] >= 20) index[n] = 19;
				 show[n][index[n]] = 1;
			}
			try 
			{
				Thread.sleep(100);
			} 
			catch (Exception e){
			}
			count += 1;
			if (count == 20)
				break;
		}

	}

}