package Task_8;

public class Binary_Search_Tree {
    Node head;


    void deleteValue(Integer value) {
        head = delete_Recursive(head, value);
    }

    Node delete_Recursive(Node head, Integer value) {

        // tree is empty
        if (head == null) {
            return head;
        }
        // left subtree
        if (value < head.value) {
            head.left = delete_Recursive(head.left, value);
        }

        // right subtree
        else if (value > head.value) {
            head.right = delete_Recursive(head.right, value);
        }

        // if node contains only one child
        else {
            if (head.left == null) {
                return head.right;
            } else if (head.right == null) {
                return head.left;
            }

            // if node contains two children

            head.value = minValue(head.right);

            head.right = delete_Recursive(head.right, head.value);

        }
        return head;
    }


    Integer minValue(Node head) {

        //initially minValue = head
        int minValue = head.value;

        //find minValue
        while (head.left != null) {
            minValue = head.left.value;
            head = head.left;
        }
        return minValue;
    }

    void add(Integer value) {
        head = add_Recursive(head, value);
    }

    Node add_Recursive(Node head, Integer value) {

        // tree is empty

        if (head == null) {
            head = new Node(value);
            return head;
        }

        // add in the left subtree
        if (value < head.value)
            head.left = add_Recursive(head.left, value);

            // add in the right subtree
        else if (value > head.value)
            head.right = add_Recursive(head.right, value);

        return head;
    }


    boolean contains(Integer value) {

        head = contains_Recursive(head, value);
        if (head != null)
            return true;
        else
            return false;
    }


    Node contains_Recursive(Node head, Integer value) {

        // head is null or value is present at root
        if (head == null || head.value.equals(value))
            return head;

        // value is greater than head's value
        if (head.value > value)
            return contains_Recursive(head.left, value);

        // value is less than head's value
        return contains_Recursive(head.right, value);
    }

//    DFS

    void inorder() {
        inorder_Recursive(head);
    }


    void inorder_Recursive(Node head) {
        if (head != null) {
            inorder_Recursive(head.left);
            System.out.print(head.value + " ");
            inorder_Recursive(head.right);
        }
    }

    void preOrder() {
        preOrder_Recursive(head);
    }

    void preOrder_Recursive(Node head) {
        if (head != null) {
            System.out.println(head.value + " ");
            preOrder_Recursive(head.left);
            preOrder_Recursive(head.right);
        }
    }

    void postOrder() {
        postOrder_Recursive(head);
    }

    void postOrder_Recursive(Node head) {
        if (head != null) {
            postOrder_Recursive(head.left);
            postOrder_Recursive(head.right);
            System.out.println(head.value + " ");
        }
    }

//    BFS

    void printLevelOrder() {
        Integer h = height(head);
        Integer i;
        for (i = 1; i <= h; i++)
            printGivenLevel(head, i);
    }

    Integer height(Node head) {
        if (head == null)
            return 0;
        else {

            //  height of each subtree

            Integer leftHeight = height(head.left);
            Integer rightHeight = height(head.right);

            // use the larger one

            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else return (rightHeight + 1);
        }
    }

    void printGivenLevel(Node head, Integer level) {
        if (head == null)
            return;
        if (level == 1)
            System.out.print(head.value + " ");
        else if (level > 1) {
            printGivenLevel(head.left, level - 1);
            printGivenLevel(head.right, level - 1);
        }
    }


}

