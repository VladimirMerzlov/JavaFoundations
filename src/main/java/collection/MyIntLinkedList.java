package collection;

public class MyIntLinkedList {

    private MyIntNode head;

    public MyIntNode getHead() {
        return head;
    }

    public void setHead(MyIntNode head) {
        this.head = head;
    }

    public void print(){
        MyIntNode node = head;
        while(node.getNextNode()!=null){
            System.out.print(node.getValue()+" ");
            node=node.getNextNode();
        }
        System.out.println(node.getValue());
    }
}

