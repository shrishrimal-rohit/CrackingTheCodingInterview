public class Trail {

    static class node
    {
        int val;
        node next;

        public node(int val)
        {
            this.val = val;
        }
    }
    private static void printList(node head)
    {
        while (head != null)
        {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }




    public static void main(String[] args)
    {

        node start = new node(100);
        node n = null;
        n = start;
        for(int i = 0; i < 10; i++)
        {
            n = n.next ;
            n.val = i;
        }

        printList(start);


    }
}


