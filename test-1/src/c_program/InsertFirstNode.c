#include <stdio.h>
#include <stdlib.h>
struct Node{
int data;
struct Node* next;
}Node;
struct Node* head;

void Insert(int x ){
struct Node* temp= (struct Node*)malloc(sizeof(struct Node*));
temp->data=x;
temp->next=head;
head=temp;

}
void Display(){

struct Node* temp= head;


    printf("\n");
while(temp!=NULL){
    printf("%d ",temp->data);
    temp=temp->next;
//    printf("\n");
}

}
int main(){
    head=NULL;
    printf("Hello Vishnu For Linked List size");
    int count, x;
    scanf("%d",&count);

    for (int i=0; i<count;i++){
    printf("Element \n");
    scanf("%d",&x);
    Insert(x);
    Display();
    }
}