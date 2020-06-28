public static Node buildTree(int ino[], int pre[], int st, int end)
    {
       // add your code here
       HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<pre.length;i++)
            h.put(ino[i],i);
        return build(ino, pre, st, end, h);
        
    }
    public static Node build(int ino[], int pre[], int st, int end, HashMap<Integer, Integer> h)
    {
     if(st>end)
        return null;
     int curr=pre[preIndex++];
     Node node=new Node(curr);
     if(st==end)
        return node;
     int index=h.get(curr);
     node.left=build(ino, pre, st, index-1, h);
     node.right=build(ino, pre, index+1, end, h);
     return node;
    }
