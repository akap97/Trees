class Tree
{
    int treeSum(Node root)
    {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return root.data;
        else
        {
            if(root.data==treeSum(root.left)+treeSum(root.right))
                return 2*root.data;
            return 0;
        }
    }
	boolean isSumTree(Node node)
	{
             // Your code here
             if(node.data==treeSum(node)/2)
                return true;
            return false;
	}
}
