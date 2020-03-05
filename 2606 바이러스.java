import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
class Main {
 
    static int N,M;
    static int[][] adj;
    static boolean[] visited;
    static Queue<Integer> q = new LinkedList<>();
    
    public static void main (String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        
        adj = new int[N+1][N+1];
        visited = new boolean [N+1];
        
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            adj[a][b] = adj[b][a] = 1;
        }
        
        visited [1] = true;
        q.add(1);
        int res = -1;
        
        while(!q.isEmpty()) {
            
            int cur = q.poll();
            res ++;
            for (int i = 1; i <= N; i++) {
                if(visited[i] || adj[cur][i] == 0) 
                    continue;
                
                visited[i] = true;
                q.add(i);
            }
        }
        System.out.println(res);
    }
 
}