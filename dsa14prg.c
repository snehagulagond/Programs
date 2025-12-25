Write a c Program to implement Binary Search
#include <stdio.h>

int binarySearch(int a[], int n, int key)
{
    int low = 0, high = n - 1, mid;

    while (low <= high)
    {
        mid = (low + high) / 2;

        if (a[mid] == key)
            return mid;
        else if (a[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;   // Not found
}

int main()
{
    int n, i, key, pos;
    int a[50];

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter %d sorted elements:\n", n);
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);

    printf("Enter element to search: ");
    scanf("%d", &key);

    pos = binarySearch(a, n, key);

    if (pos == -1)
        printf("Element not found!");
    else
        printf("Element found at position %d (index %d)", pos + 1, pos);

    return 0;
}