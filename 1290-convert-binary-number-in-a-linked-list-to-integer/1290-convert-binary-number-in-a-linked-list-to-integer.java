class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuffer str = new StringBuffer();
        ListNode temp = head;

        while (temp != null) {
            str.append(temp.val);
            temp = temp.next;
        }

        return Integer.parseInt(str.toString(), 2);
    }
}