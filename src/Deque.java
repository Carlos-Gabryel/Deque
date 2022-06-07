public class Deque<N> {
    private Node<N> head;
    private Node<N> tail;
    private int size;
    private int limit;

    public Deque(int limit) {
        this.limit = limit;
    }

    public boolean isEmpty() {
        if (this.head == null && this.tail == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (this.size >= this.limit) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Node<N> node) {
        if (isEmpty()) {
            this.tail = node;
        }
        Node<N> next = this.head;
        this.head = node;
        node.setNext(next);
        this.size++;
    }

    public Node<N> pop() {
        Node<N> poped = this.head;
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.getNext();
        }
        this.size--;
        return poped;
    }

    public void inject(Node<N> node) {
        if (isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            Node<N> next = this.tail;
            this.tail = node;
            node.setNext(next);
        }
        this.size++;
    }

    public Node<N> eject() {
        Node<N> ejected = this.tail;
        if(this.size ==1){
            this.head = null;
            this.tail = null;
        }else{
            Node<N> aux = this.head;
            while(aux.getNext() != this.tail){
                aux = aux.getNext();
            }
            this.tail = aux;
            this.tail.setNext(null);
        }
        this.size--;
        return ejected;   
    }
}
