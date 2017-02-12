package tree.binary;

/**
 * Created by rogerlin on 1/31/17.
 */
public class BiSortTree extends BiTree {
    private double avgSearchLength = 0;
    private int sumSearchLength = 0;
    private int searchTimes = 0;
    private int curSearchLength;

    @Override
    public boolean insert(Comparable key) {
        boolean isInsertSuccess = false;
        if (isEmpty()) {
            BiTreeNode newNode = new BiTreeNode(key);
            newNode.setParent(null);
            rootNode = newNode;
            isInsertSuccess = true;
        } else {
            BiTreeNode curNode = rootNode;
            while (curNode != null) {
                if (curNode.getKey().compareTo(key) == 0) {
                    isInsertSuccess = false;
                    break;
                } else if (curNode.getKey().compareTo(key) > 0) {
                    if (curNode.getlChild() == null) {
                        BiTreeNode newNode = new BiTreeNode(key);
                        newNode.setParent(curNode);
                        curNode.setlChild(newNode);
                        isInsertSuccess = true;
                        break;
                    } else {
                        curNode = curNode.getlChild();
                    }
                } else {
                    if (curNode.getrChild() == null) {
                        BiTreeNode newNode  = new BiTreeNode(key);
                        newNode.setParent(curNode);
                        curNode.setrChild(newNode);
                        isInsertSuccess = true;
                        break;
                    }
                    else {
                        curNode = curNode.getrChild();
                    }
                }
            }
        }
        return isInsertSuccess;
    }

    @Override
    public BiTreeNode find(Comparable key) {
        BiTreeNode curNode = rootNode;
        curSearchLength = 0;
        while (curNode != null) {
            curSearchLength++;
            if (curNode.getKey().compareTo(key) == 0)
                break;
            else if (curNode.getKey().compareTo(key) > 0)
                curNode = curNode.getlChild();
            else
                curNode = curNode.getrChild();
        }
        sumSearchLength += curSearchLength;
        avgSearchLength = (sumSearchLength + 0.0) / (++searchTimes);
        return curNode;
    }

    public double getAvgSearchLength() {
        return avgSearchLength;
    }
}
