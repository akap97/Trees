import java.util.*;
import java.io.*;

public class tree_height {
    class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}
		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}

	public class TreeHeight {
		int n;
		int parent[];
		
		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = in.nextInt();
			}
		}

		int computeHeight() {
			int ma = 0; 
  
    			// To check whether or not node is visited before 
    			int []visited = new int[n]; 
  
   			 // For Storing Height of node 
   			 int []height = new int[n]; 
  
    			for(int i = 0; i < n; i++) 
    			{ 
        			visited[i] = 0; 
        			height[i] = 0; 
    			} 
  
 		 	for (int i = 0; i < n; i++)  
    			{ 
  
        		// If not visited before 
        		if (visited[i] != 1) 
          			height[i] = fillHeight(parent, i, visited, height); 
  
        		// store maximum height so far 
        		ma = Math.max(ma, height[i]); 
    			} 
    			return ma;                         
			// Replace this code with a faster implementation
		}
		int fillHeight(int p[], int node,  int visited[], int height[]) 
		{ 
    		// If root node 
    		if (p[node] == -1) 
    		{ 
  
        		// mark root node as visited 
        		visited[node] = 1; 
        		return 1; 
    		} 
  
    		// If node is already visited 
    		if (visited[node] == 1) 
        		return height[node]; 
  
    		// Visit node and calculate its height 
    		visited[node] = 1; 
  
    		// recur for the parent node 
    		height[node] = 1 + fillHeight(p, p[node], visited, height); 
  
    		// return calculated height for node 
    		return height[node]; 
		} 
	}

	static public void main(String[] args) throws IOException {
            new Thread(null, new Runnable() {
                    public void run() {
                        try {
                            new tree_height().run();
                        } catch (IOException e) {
                        }
                    }
                }, "1", 1 << 26).start();
	}
	public void run() throws IOException {
		TreeHeight tree = new TreeHeight();
		tree.read();
		System.out.println(tree.computeHeight());
	}
}
