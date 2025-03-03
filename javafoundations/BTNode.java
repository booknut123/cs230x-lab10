package javafoundations;

/**
 * Represents a node in a binary tree with a left and right child.
 * Therefore this class also represents the root of a subtree.
 */
public class BTNode<T>
{
    protected T element;
    protected BTNode<T> left, right;

    /**
     * Creates a new tree node with the specified element.
     */
    public BTNode (T element)
    {
        this.element = element;
        left = right = null;
    }

    /**
     * Returns the element stored in this node.
     * 
     * @return the element stored in this node.
     */
    public T getElement()
    {
        return element;
    }

    /**
     * Sets the element of this node.
     * 
     * @param the element to be stored in this node.
     */
    public void setElement (T element)
    {
        this.element = element;
    }

    /**
     * Returns the left subtree of this node.
     * 
     * @return the left subtree of this node.
     */
    public BTNode<T> getLeft()
    {
        return left;
    }

    /**
     * Sets the left child of this node.
     * 
     * @param the node to be set as the left child of this node
     * 
     */
    public void setLeft (BTNode<T> left)
    {
        this.left = left;
    }

    /**
     * Returns the right subtree of this node.
     * 
     * @return the right subtree of this node.
     */
    public BTNode<T> getRight()
    {
        return right;
    }

    /**
     * Sets the right child of this node.
     * 
     * @param the node to be set as the right child of this node
     */
    public void setRight (BTNode<T> right)
    {
        this.right = right;
    }

    /**
     * Returns the subtree of this node whose element matches the
     * specified element. Returns null if the target is not found.
     * 
     * @param the element to be found in this subtree
     * @return the subtree of this node whose element matches the
     * specified element, or null if the specified element was
     * not found
     */
    public BTNode<T> find (T target)
    {
        BTNode<T> result = null;

        if (element.equals(target))
            result = this;
        else
        {
            if (left != null)
                result = left.find(target);
            if (result == null && right != null)
                result = right.find(target);
        }

        return result;
    }

    /**
     * Returns the number of nodes in this subtree.
     * 
     * @rerurn the number of nodes in this subtree
     */
    public int count()
    {
        int result = 1;

        if (left != null)
            result += left.count();

        if (right != null)
            result += right.count();

        return result;
    }

    /**
     * Performs an inorder traversal on this subtree, updating the
     * input iterator.
     * 
     * @param an empty Iterator, to be filled with the element 
     * of this subtree visited during an inorder traversal
     */
    public void inorder (ArrayIterator<T> iter)
    {
        if (left != null)
            left.inorder (iter);

        iter.add (element);

        if (right != null)
            right.inorder (iter);
    }

    //  The following methods are left as programming projects.

    /**
     * Performs an preorder traversal on this subtree, updating the
     * input iterator.
     * 
     *@param an empty Iterator, to be filled with the element 
     * of this subtree visited during an preorder traversal
     */
    public void preorder (ArrayIterator<T> iter) 
    {
        iter.add(element);

        if(left != null)
            left.preorder(iter);

        if(right != null)
            right.preorder(iter);
    }

    /**
     * Performs an postorder traversal on this subtree, updating the
     * specified iterator.
     * 
     *@param an empty Iterator, to be filled with the element 
     * of this subtree visited during an postorder traversal
     */
    public void postorder (ArrayIterator<T> iter) 
    {
        if(left != null)
            left.preorder(iter);

        if(right != null)
            right.preorder(iter);

        iter.add(element);
    }

    /*
     * Returns the height of this node: a node that has no left
     * and no right children has height zero
     * 
     * @return the height of this subtree
     */
    public int height()
    {
        int l = 0;
        int r = 0;
        if(left != null || right != null)
        {

            if(left != null)
                l = left.height();
            if(right != null)
                r = right.height();

            if(l > r)
                return l + 1;
            else
                return r + 1;
        }
        else
            return 0;
    }

    /**
     * It changes this node so that every left child 
     * becomes right.
     * 
     */
    public void spin()
    {
        BTNode<T> temp = left;
        left = right;
        right = temp;

        if(left != null)
            left.spin();
        if(right != null)
            right.spin();
    }

}
