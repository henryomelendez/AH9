class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      // todo
        Node<T> temp = head;
        Node<T> prev = null;
        Node<T> next = null;
            // x -> y -> null
        while (temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;

      return head;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
         // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        while (head != null) {
            System.out.print(head.val +" ");
            head = head.next;            
        }
        System.out.println();

        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // a -> b -> c -> d -> e -> f

        // f -> e -> d -> c -> b -> a

        Node<String> head2 = reverseList(a);
        while (head2 !=null){
            System.out.print(head2.val +" ");
            head2 = head2.next;
        }

    }
  }