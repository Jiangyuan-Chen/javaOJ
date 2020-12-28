import com.javaclass.tree.TreeNode;
import com.javaclass.utils.TreeUtil;
import java.util.LinkedList;
import java.util.Queue;


public class bfs {
    public static void main(String[] args) {
        TreeNode test = TreeUtil.randomBinaryTreeGenerator(6);
        System.out.println(test);
        bfs(test);
    }
    static void bfs(TreeNode root){
        if (null == root){
            return;
        }

        Queue<TreeNode> helper = new LinkedList<>();

        helper.offer(root);
        while(!helper.isEmpty()){
            TreeNode cad = helper.poll();
            if (null != cad.getLeftChild()){
                helper.offer(cad.getLeftChild());
            }
            if (null != cad.getRightChild()){
                helper.offer(cad.getRightChild());
            }
            System.out.print(cad.getVal()+" ");
        }
    }
}
