
public class BinaryTree{
    class Node{
    int data;
    Node left,right;
    public Node (int item)
    {
       this. data=item;
       this. left=null;
       this. right=null;
    }
}
public void insert(Node new_node,int val){
    if(val>=new_node.data)
    {
        if(new_node.right!=null)
        {
            insert(new_node.right,val);
        }
        else
        {
            new_node.right=new Node(val);
        }
    }
    else{
         if(new_node.left!=null)
        {
            insert(new_node.left,val);
        }
        else
        {
            new_node.left=new Node(val);
        }

    }
}
}