#include <bits/stdc++.h>
using namespace std;

template <class T>
class Node
{
public:
    T data;
    Node<T> *next;
    Node<T> *prev;
};

template <class T>
class doubly_linked_list
{
private:
    Node<T> *head;
    Node<T> *tail;

public:
    doubly_linked_list()
    {
        head = nullptr;
        tail = nullptr;
    }
    void insert_element(T val)
    {
        Node<T> *new_node = new Node<T>();
        new_node->data = val;
        if (head == nullptr)
        {
            head = new_node;
            tail = head;
            head->next = nullptr;
            tail->next = nullptr;
            return;
        }
        auto temp = head;
        while (temp->next != nullptr)
        {
            temp = temp->next;
        }
        temp->next = new_node;
        temp->next->prev = temp;
        tail = temp->next;
    }
    void remove_element(T val)
    {
        if (head->data == val)
        {
            head = head->next;
            head->prev = nullptr;
            return;
        }
        auto temp = head;
        while (temp->next != nullptr)
        {
            if (temp->next->data == val)
            {
                break;
            }
            temp = temp->next;
        }
        temp->next = temp->next->next;
        temp->next->prev = temp;
    }
    void print_forward()
    {
        for (auto t = head; t != nullptr; t = t->next)
        {
            cout << t->data << ' ';
        }
        cout << endl;
    }
    void print_backward()
    {
        for (auto t = tail; t != nullptr; t = t->prev)
        {
            cout << t->data << ' ';
        }
        cout << endl;
    }
};

int main()
{
    doubly_linked_list<int> *d = new doubly_linked_list<int>();
    d->insert_element(3);
    d->insert_element(5);
    d->insert_element(6);
    d->insert_element(7);
    d->insert_element(9);
    d->print_forward();
    d->print_backward();
    d->remove_element(7);
    d->print_forward();
    d->print_backward();
    return 0;
}