write a c proggram to demonstrate winner tree and loser tree.
#include <stdio.h>
#include <limits.h>

#define MAX 8   // Number of players (must be power of 2)

int WTree[2 * MAX];   // Winner Tree array
int LTree[MAX];       // Loser Tree array

/* Build Winner Tree */
void buildWinnerTree(int a[])
{
    int i;

    // Copy leaves
    for (i = 0; i < MAX; i++)
        WTree[MAX + i] = a[i];

    // Build internal nodes
    for (i = MAX - 1; i > 0; i--)
    {
        if (WTree[2 * i] < WTree[2 * i + 1])
            WTree[i] = WTree[2 * i];
        else
            WTree[i] = WTree[2 * i + 1];
    }
}

/* Display Winner Tree */
void displayWinnerTree()
{
    int i;
    printf("\nWinner Tree:\n");
    for (i = 1; i < MAX; i++)
        printf("%d ", WTree[i]);

    printf("\nWinner (Smallest): %d\n", WTree[1]);
}

/* Build Loser Tree */
void buildLoserTree(int a[])
{
    int i, parent, winner, loser;
    int temp[MAX];

    // Copy data
    for (i = 0; i < MAX; i++)
        temp[i] = a[i];

    // Initialize tree
    for (i = 0; i < MAX; i++)
        LTree[i] = -1;

    // Construct loser tree
    for (i = 0; i < MAX; i++)
    {
        winner = i;
        parent = (i + MAX) / 2;

        while (parent > 0)
        {
            if (LTree[parent] == -1)
            {
                LTree[parent] = winner;
                break;
            }

            if (temp[winner] > temp[LTree[parent]])
            {
                // Swap winner and loser
                loser = winner;
                winner = LTree[parent];
                LTree[parent] = loser;
            }

            parent = parent / 2;
        }
        LTree[0] = winner;
    }
}

/* Display Loser Tree */
void displayLoserTree(int a[])
{
    int i;
    printf("\nLoser Tree (indexes of losers):\n");
    for (i = 1; i < MAX; i++)
        printf("%d ", LTree[i]);

    printf("\nWinner at root: %d\n", a[LTree[0]]);
}

int main()
{
    int a[MAX], i;

    printf("Enter %d elements:\n", MAX);
    for (i = 0; i < MAX; i++)
        scanf("%d", &a[i]);

    // Winner Tree
    buildWinnerTree(a);
    displayWinnerTree();

    // Loser Tree
    buildLoserTree(a);
    displayLoserTree(a);

    return 0;
}