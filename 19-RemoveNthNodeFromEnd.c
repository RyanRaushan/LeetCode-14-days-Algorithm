/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    int count = 1;
    struct ListNode *p = head;
    while (p->next != NULL){
        count++;
        p = p->next;
    }
    
    
    if (count == 1){
        head = NULL;
    }
    else if (count == n){
        head = head->next;
    }
    else {
        count = count - n;
    
        p = head;
    
        while (count > 1){
            p = p->next;
            count--;     
        }
    
        struct ListNode *q = p->next->next;
        p->next = q;
    }
    
    return head;
    
    
}