package st10244136question1prog6;

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		float sum=0;
		float []summ=new float[3]; //(w3schools,2022)
		float []avg=new float[3];
		int [][]ar=new int[3][3]; //(w3schools,2022)
		Scanner sc = new Scanner(System.in); //(w3schools,2022)
        System.out.println("***************************************************");
	    System.out.println("Health Inspection Report");
		System.out.println("***************************************************\n\n");
		for(int i=0;i<3;i++){ //(w3schools,2022)
		    for(int j=0;j<3;j++){ //(w3schools,2022)
                System.out.println("Hospital "+(i+1)+" for "+(j+1)+" month: ");
                ar[i][j] = sc.nextInt(); //(w3schools,2022)
		    
		        sum+=ar[i][j];
		    }
		    summ[i]=sum;
		    avg[i]=sum/3;
		    sum=0; //(w3schools,2022)
		}
		System.out.println("                 Jan     Feb     Mar     Avg");
		System.out.println("Hospital 1 --->  "+ar[0][0]+"       "+ar[0][1]+"       "+ar[0][2]+"       "+String.format("%.2f",avg[0]));
		System.out.println("Hospital 2 --->  "+ar[1][0]+"       "+ar[1][1]+"       "+ar[1][2]+"       "+String.format("%.2f",avg[1]));
		System.out.println("Hospital 3 --->  "+ar[2][0]+"       "+ar[2][1]+"       "+ar[2][2]+"       "+String.format("%.2f",avg[2]));
        System.out.println("***************************************************");
        System.out.println("Monthly Totals");
        System.out.println("***************************************************");
		System.out.println("Hospital 1:      "+summ[0]);
		System.out.println("Hospital 1:      "+summ[1]);
		System.out.println("Hospital 1:      "+summ[2]);
        System.out.println("***************************************************");

	}
}

//Ref List
//w3schools,2022,https://www.w3schools.com/ Accessed 3 October 2022