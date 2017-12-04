package test.main;

import javax.swing.Spring;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  JAva의 배열은 한가지type만 담을 수 있다. 
		 *  배열은 처음 만들때 방의 갯수를 정하면 바꿀수없다.
		 */
		// Array 만들때 고려할 2가지 
		// 1. type? 
		// 2. length?
		// 처음 만들어지는 Array각 칸에는 값 0 이 들어있다.
		
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		//int type 을 저장할 수 있는 방 3개 짜리 배열 객체 생성
		int[] nums = new int[3];
		//double type 을 저장할 수 있는 방 5개짜리 배열객체 생성
		double[] a = new double [5];
		//String type 을 저장할 수 있는 방3개짜리 배열객체를 생성하고 
		//각각의 방에 뭐가 들어 있는 지 확인해 보세요.
		String[] b = new String[3];	
	}
}
