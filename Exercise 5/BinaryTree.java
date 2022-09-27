// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node A
        Node A = new Node("Pres. Dapitillo,");
        // Create node B
        Node B = new Node("HeadDept1. Vargas,");
        // Create node C
        Node C = new Node("HeadDept2. Bantegui,");
        // Create node D
        Node D = new Node("Emp.Mercado,");
        // Create node E
        Node E = new Node("Emp.Lalo,");
        // Create node F
        Node F = new Node("Emp.Guansing,");
        // Create node G
        Node G = new Node("Emp.Legaspi,");



        // Set left and right child of root node A
        A.left = B;
        A.right = C;

        // Set left and right child of node B
        B.left = D;
        B.right = E;

        // Set left and right child of node C
        C.left = F;
        C.right = G;
        
        System.out.print("\nPre order Traversal: ");
        traversePreOrder(A);

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(A);
        
        System.out.print("\nPost order Traversal: ");
        traversePostOrder(A);
    }

    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
        
}
static void traverseInOrder(Node node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(" " + node.data);
        traverseInOrder(node.right);
    }
}
static void traversePostOrder(Node node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.data);
    }
}

}
