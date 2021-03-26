#include<iostream>

class Node {
  public:
	  int data;
	  Node* next;
};

class linked_list {
  public:
    linked_list(){
      head = NULL;
    }
    void addNode(int x);
    void printList();
  private:
    Node* head;
};

void linked_list::addNode(int x){
  Node* new_node = new Node;
  new_node -> data = x;
  new_node -> next = NULL;
  if(head == NULL){
    head = new_node;
  }
  else {
    Node* temp = head;
    while(temp->next != NULL){
      temp = temp->next;
    }
    temp->next = new_node;
  }
}
void linked_list::printList(){
  Node* temp = head;
  while(temp != NULL){
    std::cout << temp-> data << " ";
    temp = temp-> next;
  }
  std::cout << "\n";
}
int main(){
  linked_list* list = new linked_list();
  list->addNode(23);
  list->addNode(34);
  list->addNode(23);
  list->addNode(23);
  list->addNode(34);
  list->addNode(34);
  list -> printList();
  return 0;
}
