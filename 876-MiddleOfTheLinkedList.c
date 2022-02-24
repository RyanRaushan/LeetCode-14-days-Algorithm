/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* middleNode(struct ListNode* head){
    int count = 1;
    struct ListNode *p = head;
    while (p->next != NULL){
        count++;
        p = p->next;
    }
    
    
    count = count /2;
    
    p = head;
    
    while (count > 0){
        p = p->next;
        count--;
    }
    return p;
}