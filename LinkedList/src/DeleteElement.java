class DeleteElement {

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

        /* Function to remove duplicates from a
        unsorted linked list */
      private   static int removeKthElemnt2(node head)
        {
            if(head.val == 0 || head.next == null)
                return -1;
            node n = head.next;
            head.val = n.val;
            head.next = n.next;
         return 1;
        }



        public static void main(String[] args)
        {
		/* The constructed linked list is:
		10->12->11->11->12->11->10*/
            node start = new node(100);
            start.next = new node(12);
            start.next.next = new node(111);
            start.next.next.next = new node(11);
            start.next.next.next.next = new node(122);
            start.next.next.next.next.next = new node(141);
            start.next.next.next.next.next.next = new node(1560);
            start.next.next.next.next.next.next.next = new node(1052);
            start.next.next.next.next.next.next.next.next = new node(130);

            printList(start);

            int val = removeKthElemnt2(start.next.next.next);
            System.out.println("\n");
            printList(start);
        }
}




