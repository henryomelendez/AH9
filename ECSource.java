/*class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}*/

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo

      


    return true;
  }

  public static <T> boolean compare(Node<T> head, T val){

      if(!head.val.equals(val)){
          return false;
      }


      return true;
  }



  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z


        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));
    }
}
