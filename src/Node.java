class Node <N> {
    private N data;
    private Node<N> next;

    public Node(N data) {
        this.data = data;
    }

    public N getData() {
        return data;
    }

    public void setData(N data) {
        this.data = data;
    }

    public Node<N> getNext() {
        return next;
    }

    public void setNext(Node<N> next) {
        this.next = next;
    }
}