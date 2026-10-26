class LRUCache {

    public class Node {
        int key, val;
        Node prev, next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    
    Map<Integer, Node> map;
    Node head, tail;
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();

        head = new Node(-1,-1);
        tail = new Node(-1,-1);

        head.next = tail;
        tail.prev = head;
    }

    void remove(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    void insertAtFront(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
    
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        
        Node node = map.get(key);

        remove(node);
        insertAtFront(node);

        return node.val;
    }
    
    public void put(int key, int value) {
        if (cap <= 0)
            return;
        
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;

            remove(node);
            insertAtFront(node);
            return;
        }

        if (map.size() == cap) {
            Node old = tail.prev;

            remove(old);
            map.remove(old.key);
        }

        Node node = new Node(key, value);

        insertAtFront(node);
        map.put(key, node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */