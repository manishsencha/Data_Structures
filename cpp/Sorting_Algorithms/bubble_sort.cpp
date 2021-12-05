#include <bits/stdc++.h>
using namespace std;

template <typename T>
void bubbleSort(vector<T> &arr)
{
    int size = arr.size();
    for (int i = 0; i < size - i; ++i)
    {
        for (int j = 0; j < size - i - 1; ++j)
        {
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
        }
    }
}
template <typename T>
void printList(vector<T> &arr)
{
    for (const auto &i : arr)
    {
        cout << i << " ";
    }
    cout << '\n';
}
int main()
{
    vector<int> v_int = {34, 53, 2, 4, 3, 45, 65, 78};
    vector<char> c_int = {'a',
                          'f',
                          'c',
                          'z',
                          'd',
                          'e',
                          'q',
                          'w',
                          'e'};
    vector<string> str_int = {"manish", "sencha", "google", "facebook", "instagram", "samay", "time"};
    bubbleSort(v_int);
    bubbleSort(c_int);
    bubbleSort(str_int);
    printList(v_int);
    printList(c_int);
    printList(str_int);
    return 0;
}