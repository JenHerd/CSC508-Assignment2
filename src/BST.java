public class BST {

  private BSTNode root;

  public BST() {
    this.root = null;
  }

  // 1. mandatory insert method
  // public method
  public void insert(Student s) {
    if (root == null) {
      root = new BSTNode(s);
    } else {
      insert(root, s);
    }
  }

  // private recursive method
  private void insert(BSTNode node, Student s) {
    if (s.getStudentID().compareTo(node.data.getStudentID()) < 0) {
      if (node.left == null) {
        node.left = new BSTNode(s);
      } else {
        insert(node.left, s); // if data <, it go to left
      }
    } else if (s.getStudentID().compareTo(node.data.getStudentID()) > 0) {
      if (node.right == null) {
        node.right = new BSTNode(s);
      } else {
        insert(node.right, s); // if data >, it go to right
      }
    }
  }

  // 2. display method (Inorder traversal)
  public void displayAllStudent() {
    inorder(root);
  }

  private void inorder(BSTNode p) { //LNR
    if (p != null) {
      inorder(p.left);
      System.out.println(p.data);
      inorder(p.right);
    }
  }

  // 3. search method
  public Student findStudent(String id) {
    return search(root, id);
  }

  private Student search(BSTNode node, String id) {
    if (node == null) return null; // not found

    if (id.equals(node.data.getStudentID())) {
      return node.data; // found match
    } else if (id.compareTo(node.data.getStudentID()) < 0) {
      return search(node.left, id); // search left
    } else {
      return search(node.right, id); // search right
    }
  }
  // add 1 or 2 more method, delete method or countNode etc
}
