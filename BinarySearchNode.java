public class BinarySearchNode<T extends Comparable<T>> extends BinaryTree<T>
{

   public void insert ( Objects d )
   {
      if (root == null)
      {
         root = new BinaryTreeNode<Objects> (d, null, null);
      }   
      else
      {
         insert (d, root);
      }   
   }
   public void insert ( Objects d, BinaryTreeNode<Objects> node )
   {
      if (d.compareTo(node.getData()) <= 0)
      {
         if (node.left == null)
            node.left = new BinaryTreeNode<Objects> (d, null, null);
         else
            insert (d, node.left);
      }
      else
      {
         if (node.right == null)
         {
            node.right = new BinaryTreeNode<Objects> (d, null, null);
         }   
         else
         {
            insert (d, node.right);
         }   
      }
   }


   public BinaryTreeNode<Objects> find(Objects d)
   {
      if(root==null)
      {
         return null;
      }
      else
      {
         return find(d,root);
      } 
   }
   
   public BinaryTreeNode<Objects> find( Objects d , BinaryTreeNode<Objects> node)
   {
      if (d.compareTo(node.getData()) == 0) 
      {
         return node;
      }   
      else if (d.compareTo (node.getData()) < 0)
      {
         return (node.left == null) ? null : find (d, node.left);
      }   
      else
      {
         return (node.right == null) ? null : find (d, node.right);      
      }
   }
   public int compareTo(Objects other)
   {
      return this.compareTo(other);
   };



}