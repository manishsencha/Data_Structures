#include <bits/stdc++.h>
using namespace std;
template <typename T>
void selectionSort(vector<T> &arr)
{
    for (int i = 0; i < arr.size(); ++i)
    {
        int min_i = i;
        for (int j = i + 1; j < arr.size(); ++j)
        {
            if (arr[j] < arr[min_i])
            {
                min_i = j;
            }
        }
        swap(arr[i], arr[min_i]);
    }
}

template <typename T>
void printArr(vector<T> &arr)
{
    for (const auto &i : arr)
    {
        cout << i << ' ';
    }
    cout << '\n';
}

int main()
{
    vector<int> v_int = {67,
                         34,
                         54,
                         2,
                         56,
                         76,
                         87,
                         23,
                         1,
                         65,
                         76,
                         8};
    vector<char> v_char = {'z', 'f', 'd', 'h', 't', 'e', 'x', 'c', 'a', 'r'};
    vector<string> v_string = {"manish", "sencha", "google", "instagram", "facebook", "time"};
    selectionSort(v_int);
    selectionSort(v_char);
    selectionSort(v_string);
    printArr(v_int);
    printArr(v_char);
    printArr(v_string);
    return 0;
}