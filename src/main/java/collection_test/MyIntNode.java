package collection_test;

public class MyIntNode {
    private int value;
    private MyIntNode nextNode;

    public MyIntNode(int value, MyIntNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyIntNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(MyIntNode nextNode) {
        this.nextNode = nextNode;
    }
}
