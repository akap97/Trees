//User function Template for Java

/*  A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree
{
    boolean flag=false;
    void printSibling(Node node)
    {
        ArrayList<Integer> a=new ArrayList<>();
        printS(node,a);
        if(!flag)
            System.out.print(-1);
        else{
            Collections.sort(a);
            for(int i:a)
                System.out.print(i+" ");
        }
    }
	void printS(Node node, ArrayList<Integer> a)
	{
		// Your code here
		if(node==null)
		    return;
		if(node.left==null && node.right!=null)
		{
		        flag=true;
		        a.add(node.right.data);
		}
		if(node.right==null && node.left!=null)
		{
		        flag=true;
		        a.add(node.left.data);
		}
		printS(node.left,a);
		printS(node.right,a);
	}
}
