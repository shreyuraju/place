#include <stdio.h>
#include<stdlib.h>
int main(void) {
	int t;
	printf("Enter the temperature:");
	    scanf("%d",&t);
	if(t<=0) {
	    printf("Freezing");
	    exit(0);
	}
	switch(t/10) {
	    case 0:printf("Very cold");
	            break;
	   case 1:printf("Cold");
	            break;
	   case 2:printf("Normal");
	            break;
	   case 3:printf("HOT");
	            break;
	   case 4:printf("Very Hot");
	            break;
	   default:printf("Extreme Hot");
	}
}



#include <stdio.h>
int main(void) {
	int x,n,i,sum1=0,sum=0;
	printf("Enter size n:");
	    scanf("%d",&n);
	printf("Enter random 1- %d no.",n);
	for(i=1;i<=n;i++) {
	    scanf("%d",&x);
	    sum1+=x;
	}
    sum=(n+1)*(n+2)/2;
	printf("missing no.is %d",(sum-sum1));

}
