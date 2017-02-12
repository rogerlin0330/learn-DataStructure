package tree.binary;

import tree.ITree;

/**
 * Created by rogerlin on 2/1/17.
 */
public abstract class BiTree<T extends Comparable<T>>
        implements ITree<T> {
    protected BiTreeNode rootNode;

    @Override
    public boolean isEmpty() {
        return rootNode == null ? true : false;
    }

    @Override
    public abstract boolean insert(T key);

    @Override
    public abstract BiTreeNode find(T key);

    public BiTreeNode getRootNode() {
        return rootNode;
    }
}
