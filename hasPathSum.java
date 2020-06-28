// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Tree {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int sum) {
     if(root==null || sum==0)
        return false;
     if(root.left==null && root.right==null) 
        return (sum-root.data == 0);
   
     return( hasPathSum(root.left,sum-root.data) || hasPathSum(root.right,sum-root.data) );
    }
}
