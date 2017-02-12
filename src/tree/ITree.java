package tree;

import tree.binary.BiTreeNode;

/**
 * Created by rogerlin on 2/1/17.
 */
public interface ITree<T extends Comparable<T>> {
    public boolean insert(T key);
    public BiTreeNode find(T key);
    public boolean isEmpty();
}
