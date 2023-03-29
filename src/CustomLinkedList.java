public class CustomLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public T get(int index) {
        Node<T> node = findNodeByIndex(index);
        return node.value;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    public boolean contains(T element) {
        Node<T> currentNode = first;
        while (currentNode != null) {
            if (currentNode.value.equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    private Node<T> findNodeByIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        if (index == size - 1) {
            return last;
        } else {
            return nodeAt(index);
        }
    }

    private Node<T> nodeAt(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public T remove(int index) {
        T deletedElement;
        if (index == 0 && !isEmpty()) {
            deletedElement = first.value;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<T> previousNode = findNodeByIndex(index - 1);
            deletedElement = previousNode.next.value;
            previousNode.next = previousNode.next.next;
            if (index == size - 1) {
                last = previousNode;
            }
        }
        size--;
        return deletedElement;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    static class Node<T> {
        private T value;
        private Node<T> next;


        private Node(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        Node<T> node = first;
        while (node != null) {
            result.append(node.value);
            if (node.next != null) {
                result.append(", ");
            }
            node = node.next;
        }
        result.append("]");
        return result.toString();
    }

}
