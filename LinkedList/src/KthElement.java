public class KthElement {
    // Java program to remove duplicates
// from unsorted linkedlist
          static class node
        {
            int val;
            node next;

            public node(int val)
            {
                this.val = val;
            }
        }

        /* Function to remove duplicates from a
        unsorted linked list */
        static int removeKthElemnt(node head, int k)
        {
            node p1 = head;
            node p2 = head;
            System.out.println(p1.val);
            int i = 0;
            while(i < k) {
                p2 = p2.next;
                if (p2 == null)
                    return 0;
                i++;
            }
                while(p2!=null) {
               p1 = p1.next;
               p2 = p2.next;
           }
           return p1.val;
        }



        public static void main(String[] args)
        {
		/* The constructed linked list is:
		10->12->11->11->12->11->10*/
            node start = new node(100);
            start.next = new node(12);
            start.next.next = new node(11);
            start.next.next.next = new node(11);
            start.next.next.next.next = new node(12);
            start.next.next.next.next.next = new node(11);
            start.next.next.next.next.next.next = new node(10);
            start.next.next.next.next.next.next.next = new node(102);
            start.next.next.next.next.next.next.next.next = new node(10);



            int val = removeKthElemnt(start, 2);

            System.out.println("\nLinked list after removing duplicates :" +val);

        }




}

