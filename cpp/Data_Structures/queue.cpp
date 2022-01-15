#include <iostream>
using namespace std;
template <class T>
class Node
{
public:
    T data;
    Node *next;
};
template <class T>
class queue
{
private:
    Node<T> *front;

public:
    queue()
    {
        front = nullptr;
    }
    void enque(T val)
    {
        Node<T> *new_node = new Node<T>();
        new_node->data = val;
        if (front == nullptr)
        {
            front = new_node;
            front->next = nullptr;
        }
        auto temp = front;
        while (temp->next!= nullptr)
        {
            temp = temp->next;
        }
        temp->next = new_node;
        temp->next->next = nullptr;
    }
    void deque()
    {
        front = front->next;
    }
    void print_queue()
    {
        for (auto t = front; t != nullptr; t = t->next)
        {
            cout << t->data << ' ';
        }
        cout << endl;
    }
};
int main()
{
    queue<int> *q = new queue<int>();
    q->enque(4);
    q->enque(5);
    q->enque(7);
    q->enque(10);
    q->enque(12);
    q->enque(14);
    q->enque(35);
    q->print_queue();
    q->deque();
    q->print_queue();
}