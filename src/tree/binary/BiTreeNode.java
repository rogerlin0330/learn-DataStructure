package tree.binary;

/**
 * Created by rogerlin on 1/31/17.
 */
public class BiTreeNode<T extends Comparable<T>> {
    private T key;
    private BiTreeNode parent;
    private BiTreeNode lChild;
    private BiTreeNode rChild;

    public BiTreeNode(T key) {
        this.key = key;
    }

    public void visit() {
        System.out.print(key + " ");
    }

    // getter
    public T getKey() {
        return key;
    }

    public BiTreeNode getParent() {
        return parent;
    }

    public BiTreeNode getlChild() {
        return lChild;
    }

    public BiTreeNode getrChild() {
        return rChild;
    }

    // setter
    /*public void setKey(T key) {
        this.key = key;
    }*/

    public void setParent(BiTreeNode parent) {
        this.parent = parent;
    }

    public void setlChild(BiTreeNode lChild) {
        this.lChild = lChild;
    }

    public void setrChild(BiTreeNode rChild) {
        this.rChild = rChild;
    }
}
