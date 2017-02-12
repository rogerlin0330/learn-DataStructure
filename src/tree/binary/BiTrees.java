package tree.binary;

/**
 * Created by rogerlin on 1/31/17.
 */
public class BiTrees {
    public static void preOrderTraverse(BiTreeNode rootNode) {
        if (rootNode != null) {
            rootNode.visit();
            if (rootNode.getlChild() != null)
                preOrderTraverse(rootNode.getlChild());
            if (rootNode.getrChild() != null)
                preOrderTraverse(rootNode.getrChild());
        }
    }

    public static void inOrderTraverse(BiTreeNode rootNode) {
        if (rootNode != null) {
            if (rootNode.getlChild() != null)
                inOrderTraverse(rootNode.getlChild());
            rootNode.visit();
            if (rootNode.getrChild() != null)
                inOrderTraverse(rootNode.getrChild());
        }
    }

    public static void postOrderTraverse(BiTreeNode rootNode) {
        if (rootNode != null) {
            if (rootNode.getlChild() != null)
                postOrderTraverse(rootNode.getlChild());
            if (rootNode.getrChild() != null)
                postOrderTraverse(rootNode.getrChild());
            rootNode.visit();
        }
    }
}
