#include <bits/stdc++.h>
using namespace std;
template <class T>
class Node
{
public:
  T data;
  Node *next;
};

template <class T>
class linked_list
{
private:
  Node<T> *head;

public:
  linked_list()
  {
    head = NULL;
  }
  void insert_element(T val)
  {
    Node<T> *new_node = new Node<T>();
    new_node->data = val;
    new_node->next = NULL;
    if (head == NULL)
    {
      head = new_node;
    }
    else
    {
      Node<T> *temp = head;
      while (temp->next != NULL)
      {
        temp = temp->next;
      }
      temp->next = new_node;
    }
  }
  void remove_element(T val)
  {
    Node<T> *temp = head;
    if (head == NULL)
    {
      return;
    }
    if (head->data == val)
    {
      head = head->next;
      return;
    }
    while (temp->next != NULL)
    {
      if (temp->next->data == val)
      {
        break;
      }
      temp = temp->next;
    }
    temp->next = temp->next->next;
  }
  int search(T val)
  {
    Node<T> *temp = head;
    int i = 0;
    while (temp != NULL)
    {
      if (temp->data == val)
      {
        return i;
      }
      i++;
    }
    return -1;
  }
  void printlist()
  {
    Node<T> *temp = head;
    while (temp != NULL)
    {
      cout << temp->data << ' ';
      temp = temp->next;
    }
    cout << '\n';
  }
};

int main()
{
  linked_list<int> *l = new linked_list<int>();
  l->insert_element(4);
  l->insert_element(56);
  l->insert_element(47);
  l->insert_element(42);
  l->insert_element(445);
  l->insert_element(455);
  l->insert_element(42);
  l->insert_element(454);
  l->printlist();
  l->remove_element(4);
  l->printlist();
  return 0;
}