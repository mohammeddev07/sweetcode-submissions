class LinkedList {
    private Node head;
    int size = 0;
    
    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        if(index < 0 || head == null) return -1;
        if(index == 0) return head.val;
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(i == index) return temp.val;
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while(temp != null && temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public boolean remove(int index) {
        if (head == null) return false;

        if(index == 0){
            head = head.next;
            return true;
        }

        Node temp = head;
        int i = 0;
        while(temp != null && temp.next != null){
            if(i == index-1){
                temp.next = temp.next.next;
                return true;
            }
            i++;
            temp = temp.next;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        if(head == null) return result;
        Node temp = head;
        int i=0;
        while(temp != null){
            result.add(temp.val);
            i++;
            temp = temp.next;
        }
        return result;
    }
}

class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}
