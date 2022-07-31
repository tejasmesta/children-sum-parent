class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        
        int l = 0;
        int r =0;
        
        if(root==null || (root.left==null && root.right==null))
        {
            return 1;
        }
        else
        {
            if(root.left!=null)
            {
                l = root.left.data;
            }
            if(root.right!=null)
            {
                r = root.right.data;
            }
            if(root.data==l+r && isSumProperty(root.left)!=0 && isSumProperty(root.right)!=0)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
        
    }
}
