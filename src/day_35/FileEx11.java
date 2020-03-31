//# 경마 게임
//5마리의 말이 랜덤으로 한번에 일정거리 이동가능하다 
//이동한거리의 합이 20이상이면 도착 
//등수 출력 
//조건) 단! 동시도착 예외처리

package day_35;

import java.util.Random;

public class FileEx11 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] horse = new int[5][20];		//첫번째 인덱스는 말 번호, 두번째 인덱스는 거리 총합
		int max = 20;		//이동거리 합 max(20)이상 이면 도착
		int[] rank = new int[5];		//말 등수
		int[] total = new int[5];		///말 이동 거리의 총합
		int[] temp_rank = new int[5];
		
		int i=0;
		int count=0;
		
		while(i<5)
		{
			int idx =0;
			int j=0;
			while(j<20)
			{
				int random = ran.nextInt(5)+1;
				horse[i][j] = random;
				total[i] += horse[i][j];
				
				if(total[i]>max)
				{
					idx = j;
					break;
				}
				j++;
			}
			
			rank[i] = idx;
			temp_rank = rank;
			System.out.println("temp_rank="+temp_rank[i]);
			System.out.print((i+1)+"번말 "+rank[i]);
			System.out.println();
			i++;
		}
		
		for(int j=0;j<5;j++)
		{
			for(int k=0;k<20;k++)
			{
				System.out.print(horse[j][k]+" ");
			}
			System.out.print("총합:" + total[j]);
			System.out.println();
		}
		
		for(int j=0;j<5;j++)
		{
			int min = rank[j];
			int min_idx = j;
			for(int k=j;k<5;k++)
			{
				if(min>rank[k])
				{
					min = rank[k];
					min_idx = k;
				}
			}
			
			int temp = rank[j];
			rank[j] = rank[min_idx];
			rank[min_idx] = temp;
		}
		
		int h=0;
		
		for(int k=0;k<5;k++)
		{
			System.out.println
			("temp_rank "+temp_rank[k]+" ");
		}
		for(int k=0;k<5;k++)
		{
			System.out.println("rank " +rank[k]+" ");
		}
		System.out.println();
	}
}
