#include <iostream>

void QuickSort(int a[],int l, int r)
{
	j=l+1
	for(int i=l+1; i<=r; i++) {
		if (a[i]<a[l]) {
			int tmp;
                        tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			j++;
		}	
	}
	int tmp = a[j-1];
	a[j-1] = a[l];
	a[l] = tmp;
	if (l<j-2) QuickSort(a, l, j-2);
        if (j<r) QuickSort(a, j, r);	
}

int main() {
	int a[]={5,8,2,3,9,5,7,19};
	QuickSort(a, 0, 7);
	for(int i=0; i<8; i++)
		cout << a[i] << ' ';
	cout<<endl;
	return 0;
}
