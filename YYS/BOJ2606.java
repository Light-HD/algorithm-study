import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> Q = new LinkedList<Integer>();
    int N = sc.nextInt();
    ArrayList[] arr = new ArrayList[N+1];
    boolean[] visited = new boolean[N+1]; //�湮üũ �迭
    
    for(int i=0; i<=N; i++) {
    	arr[i] = new ArrayList<Integer>();
    }

    int input = sc.nextInt();
    int cnt = 0;
    while(input-->0) {
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	arr[a].add(b); // ���� �׷����� ó���� ������ ���� �κ�
    	arr[b].add(a); // ���ʿ� �ڽ����� �߰� 
    }
    
    Q.offer(1); //��带 ����ֽ��ϴ�
    visited[1] = true;
    while(!Q.isEmpty()) {
    	int now = Q.poll(); //���Ҹ� ����
    	for(int i=0 ; i<arr[now].size(); i++) { //�ڽĵ��� ť�� �ٽ� �ֽ��ϴ�
    		int child = (int) arr[now].get(i);
    		if(!visited[child]) {
    			visited[child] = true; //�湮 üũ���ְ�
    			Q.offer((Integer) child);
    			cnt++; // ���� ��Ȳ�̹Ƿ� ī��Ʈ
    		}
    	}
    }
    
    System.out.println(cnt);
    
}
}