import java.util.Scanner;

public class Main {
	static int L = 10; // ������ ����
	static boolean[][] area = new boolean[101][101];
	
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = 0;
    for(int i=sc.nextInt(); i>0; i--) {
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	for(int row=x; row<x+L; row++) { // ��
    		
    		if(row>=100) {
    			row=x+L; continue; // ������ ����� �ݺ����� ���ɴϴ�
    		}else {
    			for(int col=y; col<y+L; col++) { //��
    				
    				if(col>=100) {
    	    			col=y+L; continue; //������ ����� �ݺ����� ���ɴϴ�
    	    		}else {
    	    			if(!area[row][col]) { //üũ�ȵǾ��ִٸ�
    	    				cnt++; //ī��Ʈ ��
    	    				area[row][col] = true; //üũ
    	    			}
    	    		}
    			}
    		}
    	}
    }
    System.out.println(cnt);
}
}