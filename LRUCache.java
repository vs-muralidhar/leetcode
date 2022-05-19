public class LRUCache {
    
    class DLinkedNode {
        int key;
        int value;
        DLinkedNode next;
        DLinkedNode prev;
    }
    
    public void addNode(DLinkedNode node) {
        DLinkedNode tmpNext = head.next;
        
        node.prev = head;
        node.next = tmpNext;
        
        tmpNext.prev = node;
        head.next = node;
    }
    
    public void removeNode(DLinkedNode node) {
        DLinkedNode tmpNext = node.next;
        DLinkedNode tmpPrev = node.prev;
        
        tmpPrev.next = tmpNext;
        tmpNext.prev = tmpPrev;
    }

    public void moveToHead(DLinkedNode node) {
        removeNode(node);
        addNode(node);
    }
    
    public DLinkedNode popTail() {
        DLinkedNode currTail = tail.prev;
        removeNode(currTail);
        return currTail;
    }

    Map<Integer, DLinkedNode> cache = new HashMap<>();
    DLinkedNode head, tail; // sentinel head + tail
    int capacity;
    int size; 
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size=0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) return -1;
        
        moveToHead(node);
        
        return node.value;
    }
    
    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        
        if (node == null) {
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            
            size++;
            addNode(newNode);
            cache.put(key, newNode);
            
            if (size > capacity) {
                DLinkedNode tmpTail = popTail();
                cache.remove(tmpTail.key);
                
                size--;
            }

            
        } else {
            node.value = value;
            moveToHead(node);
        }
        
    }
}



