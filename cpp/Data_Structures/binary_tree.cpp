#include <bits/stdc++.h>
using namespace std;
template <class T>
class Node
{
public:
    T data;
    Node *left, *right;

    Node(T data)
    {
        this->data = data;
        left = right = nullptr;
    }
};
template <class T>
void in_order_traversal(Node<T> *root)
{
    if (root == nullptr)
        return;
    in_order_traversal(root->left);
    cout << root->data << ' ';
    in_order_traversal(root->right);
}

template <class T>
void pre_order_traversal(Node<T> *root)
{
    if (root == nullptr)
        return;
    cout << root->data << ' ';
    pre_order_traversal(root->left);
    pre_order_traversal(root->right);
}

template <class T>
void post_order_traversal(Node<T> *root)
{
    if (root == nullptr)
        return;
    in_order_traversal(root->left);
    in_order_traversal(root->right);
    cout << root->data << ' ';
}

int main()
{
    Node<int> *root = new Node<int>(25);
    Node<int> *temp = new Node<int>(20);
    root->left = temp;
    temp = new Node<int>(36);
    root->right = temp;
    temp = new Node<int>(10);
    root->left->left = temp;
    temp = new Node<int>(22);
    root->left->right = temp;
    temp = new Node<int>(30);
    root->right->left = temp;
    temp = new Node<int>(40);
    root->right->right = temp;
    // cout << root->data << '\n';
    // cout << root->left->data << ' ';
    // cout << root->right->data << '\n';
    // cout << root->left->left->data << ' ';
    // cout << root->left->right->data << ' ';
    // cout << root->right->left->data << ' ';
    // cout << root->right->right->data << ' ';
    in_order_traversal(root);
    cout << endl;
    pre_order_traversal(root);
    cout << endl;
    post_order_traversal(root);
    cout << endl;
    return 0;
}