package test;

import java.util.Arrays;

import d_array.Array;

public class omok {

	int[][] omok = new int[10][10];

	public void viewOmok() {
		int Y = 0;
		String[] x = new String[] { "A", "B", "C", "D", "E", "F", "G", "H",
				"I", "J" };

		for (int i = 0; i < 10; i++) {
			Y++;
			if (Y == 10) {
				System.out.print(Y);
			} else {
				System.out.print(Y + " ");
			}
			for (int j = 0; j < 10; j++) {
				if (omok[i][j] == 1) {
					System.out.print(" ●");
					// 돌 표시
				} else if (omok[i][j] == 2) {
					System.out.print(" ○");
					// 돌 표시
				} else {
					System.out.print(" .");
				}
			}
			System.out.println();
		}
		System.out.print("  ");

		for (int i = 0; i < 10; i++) {

			System.out.print(" " + x[i]);
		}
		System.out.println();
	}

	// 오목
	public int OmokAction(char x, int y, int turn, int sw, String user1, String user2) {
		int X = x - 97;

		int Y = --y;

		int count = 0;

		int x1, y1 = 0;

		String name = new String();
		name = (turn == 1) ? user1 : user2;
		
		if(sw==1){
			while(omok[Y][X] !=0){				
					X = (int)(Math.random()*10);	
					Y = (int)(Math.random()*10);				
			}			
			omok[Y][X] = turn;			
		}		
		else if(sw!=1){
		if (omok[Y][X] != 0) {
			System.out.println("이미 오목돌이 설치되어 있습니다.");
			return 0;
		} else {
			omok[Y][X] = turn;
		}
		}
		// 가로 체크 코드 3 j => 2 9
		x1 = X;
		y1 = Y;
		count = 0;
		while (omok[y1][x1] == turn && x1 > 0) {
			x1--;
			if (x1 == 0 && omok[y1][x1] == turn) {
				count++;
			}
		}
		while (omok[y1][++x1] == turn && x1 <= 10) {
			count++;
			if (x1 == 9) {
				break;
			}
		}
		if (count >= 5) {
			System.out.println(name + "  승리");
			return 1;
		}

		// 세로 체크 코드
		x1 = X;
		y1 = Y;
		count = 0;
		while (omok[y1][x1] == turn && y1 > 0) {
			y1--;
			if (y1 == 0 && omok[y1][x1] == turn) {
				count++;
			}
		}
		while (omok[++y1][x1] == turn && y1 <= 10) {
			count++;
			if (y1 == 9) {
				break;
			}
		}
		if (count >= 5) {
			System.out.println(name + "  승리");
			return 1;
		}

		// 대각선 5시방향
		x1 = X;
		y1 = Y;
		count = 0;
		while (omok[y1][x1] == turn && (y1 >= 0 && x1 >= 0)) {
			if ((y1 == 0 || x1 == 0) && omok[y1][x1] == turn) {
				count++;
				break;
			}
			y1--;
			x1--;
		}
		if (y1 < 9 && x1 < 9) {
			while (omok[++y1][++x1] == turn && (y1 < 10 || x1 < 10)) {
				count++;
				if (y1 == 9 || x1 == 9) {
					break;
				}
			}
		}
		if (count >= 5) {
			System.out.println(name + "  승리");
			return 1;
		}

		// 대각선 1시방향
		x1 = X;
		y1 = Y;
		count = 0;
		while (omok[y1][x1] == turn && (y1 < 10 && x1 >= 0)) {
			if ((y1 == 9 || x1 == 0) && omok[y1][x1] == turn) {
				count++;
				break;
			} else {
				y1++;
				x1--;
			}
		}
		if ((y1 < 9 && x1 < 9) && (y1 > 0 && x1 > 0)) {
			while (omok[--y1][++x1] == turn && (y1 > 0 || x1 < 10)) {
				count++;
				if (y1 == 0 || x1 == 9) {
					break;
				}
			}
		}
		if (count >= 5) {
			System.out.println(name + "  승리");
			return 1;
		}
		return 0;
	}
	
	
	public void OmokClear(){
		for (int i = 0; i < omok.length; i++) {
			for (int j = 0; j < omok[0].length; j++) {
				omok[i][j] = 0;
			}
		}
	}
	

}
