//# �渶 ����
//5������ ���� �������� �ѹ��� �����Ÿ� �̵������ϴ� 
//�̵��ѰŸ��� ���� 20�̻��̸� ���� 
//��� ��� 
//����) ��! ���õ��� ����ó��

package day_35;

import java.util.Random;

public class FileEx11 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] horse = new int[5][20];		//ù��° �ε����� �� ��ȣ, �ι�° �ε����� �Ÿ� ����
		int max = 20;		//�̵��Ÿ� �� max(20)�̻� �̸� ����
		int[] rank = new int[5];		//�� ���
		int[] total = new int[5];		///�� �̵� �Ÿ��� ����
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
			System.out.print((i+1)+"���� "+rank[i]);
			System.out.println();
			i++;
		}
		
		for(int j=0;j<5;j++)
		{
			for(int k=0;k<20;k++)
			{
				System.out.print(horse[j][k]+" ");
			}
			System.out.print("����:" + total[j]);
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
