/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> oTC = new HashMap<>();
        oTC.put(null, null);

        Node curr = head;
        while (curr != null){
            if(!oTC.containsKey(curr)){
                oTC.put(curr, new Node(0));
            }
            oTC.get(curr).val = curr.val;

            if(!oTC.containsKey(curr.next)){
                oTC.put(curr.next, new Node(0));
            }
            oTC.get(curr).next = oTC.get(curr.next);

            if (!oTC.containsKey(curr.random)) {
                oTC.put(curr.random, new Node(0));
            }
            oTC.get(curr).random = oTC.get(curr.random);
            curr = curr.next;
        }
        return oTC.get(head);
    }
}
