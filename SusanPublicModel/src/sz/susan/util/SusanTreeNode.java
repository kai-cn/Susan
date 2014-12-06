package sz.susan.util;

import java.util.ArrayList;

import oracle.jbo.Row;

public class SusanTreeNode {
    private Row nodeValue = null;
    private ArrayList<Row> children = new ArrayList<Row>();

    public void setNodeValue(Row nodeValue) {
        this.nodeValue = nodeValue;
    }

    public Row getNodeValue() {
        return nodeValue;
    }

    public void setChildren(ArrayList<Row> children) {
        this.children = children;
    }

    public ArrayList<Row> getChildren() {
        return children;
    }
}
