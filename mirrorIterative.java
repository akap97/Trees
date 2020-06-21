q.add(root);
while (q.size() > 0) 
    { 
        // pop top node from queue 
        Node curr = q.peek(); 
        q.remove(); 
  
        // swap left child with right child 
        Node temp = curr.left; 
        curr.left = curr.right; 
        curr.right = temp;; 
  
        // push left and right children 
        if (curr.left != null) 
            q.add(curr.left); 
        if (curr.right != null) 
            q.add(curr.right); 
    } 
