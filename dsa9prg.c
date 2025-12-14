Develop a Program in C for the following operations on Singly Circular Linked List (SCLL) with header nodes.
a) Represent and Evaluate a Polynomial P(x,y,z) = 6x2y2z-4yz5+3x3yz+2xy5z-2xyz3 .
b) Find the sum of two polynomials POLY1(x,y,z) and POLY2(x,y,z) and store the result in POLYSUM(x,y,z).
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct node {
    int c,x,y,z;
    struct node *link;
}NODE;

NODE* newNode(int c,int x,int y,int z){
    NODE *n = (NODE*)malloc(sizeof(NODE));
    n->c=c; n->x=x; n->y=y; n->z=z; n->link=n;
    return n;
}

void insert(NODE *h,int c,int x,int y,int z){
    NODE *t=h;
    while(t->link!=h) t=t->link;
    t->link=newNode(c,x,y,z);
    t->link->link=h;
}

void readPoly(NODE *h){
    int n,c,x,y,z;
    printf("Enter number of terms: ");
    scanf("%d",&n);
    while(n--){
        printf("coef xexp yexp zexp: ");
        scanf("%d %d %d %d",&c,&x,&y,&z);
        insert(h,c,x,y,z);
    }
}

void display(NODE *h){
    NODE *t=h->link;
    if(t==h){ printf("0\n"); return; }
    while(t!=h){
        printf("%d x^%d y^%d z^%d",t->c,t->x,t->y,t->z);
        t=t->link;
        if(t!=h) printf(" + ");
    }
    printf("\n");
}

double eval(NODE *h,double X,double Y,double Z){
    double s=0; 
    NODE *t=h->link;
    while(t!=h){
        s+=t->c*pow(X,t->x)*pow(Y,t->y)*pow(Z,t->z);
        t=t->link;
    }
    return s;
}

NODE* add(NODE *a,NODE *b){
    NODE *s=newNode(0,0,0,0),*t=a->link;
    while(t!=a){ insert(s,t->c,t->x,t->y,t->z); t=t->link; }
    t=b->link;
    while(t!=b){ insert(s,t->c,t->x,t->y,t->z); t=t->link; }
    return s;
}

int main(){
    NODE *P=newNode(0,0,0,0);
    printf("\nEnter P(x,y,z):\n");
    readPoly(P);

    printf("\nP(x,y,z) = ");
    display(P);

    double x,y,z;
    printf("\nEnter x y z: "); 
    scanf("%lf %lf %lf",&x,&y,&z);
    printf("Value = %.2lf\n",eval(P,x,y,z));

    NODE *P1=newNode(0,0,0,0), *P2=newNode(0,0,0,0);
    printf("\nEnter POLY1:\n"); readPoly(P1);
    printf("Enter POLY2:\n"); readPoly(P2);

    NODE *S = add(P1,P2);
    printf("\nPOLY1: "); display(P1);
    printf("POLY2: "); display(P2);
    printf("SUM:   "); display(S);

    return 0;
}