import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IncreasingBST {
    public static void main(String[] args) {
        List<Integer> yo = new ArrayList<>();
    }
    Stack<Integer> res = new Stack<>();
    public TreeNode inCreasingBST(TreeNode root){
        if(root==null) return null;
        TreeNode travel = new TreeNode();
        while(res.isEmpty()){
            travel.right = new TreeNode(res.pop());
            travel = travel.right;
            travel.left = null;
        }
        return travel;
    }

    public void InorderTraversal(TreeNode root){

        if(root!=null){
            InorderTraversal(root.left);
            res.push(root.val);
            InorderTraversal(root.right);
        }
    }
}
