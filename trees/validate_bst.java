class Solution {
    static TreeNode prev=null;
    public boolean isValidBST(TreeNode root) {
        prev=null;
        return in(root);
           
    }
    
    public boolean in(TreeNode root){
        if(root==null)
            return true;
        if(!in(root.left))
            return false;
        

        if(prev!=null && prev.val>=root.val){
            System.out.println(prev.val);
            return false;
            
        }
        prev = root;
        
        return in(root.right); 
    }
    
}
