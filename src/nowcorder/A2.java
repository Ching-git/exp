package nowcorder;

public class A2{ 
public static void main(String[] args){
    int[] a={2,4,6,8,3,6,9,12};
    doSomething(a,0,a.length-1);
    for(int i=0;i<=a.length-1;i++)
    System.out.print(a[i]+" ");
} 
private static void doSomething(int[] a,int start,int end){
    if(start<end){
        int p=core(a,start,end);
        doSomething(a,start,p-1);
        doSomething(a,p+1,end);
    }
}
private static int core(int[] a,int start,int end)
{
    int x=a[end];
    int i=start;
    for(int j=start;j<=end-1;j++){
        if(a[j]>=x){
            swap(a,i,j);
            i++;//�����˼��� 
            for (int d = 0; d < a.length; d++) {
				System.out.print(a[d] + " ");
			}
            System.out.println();
        }
    }//�����ķŵ����
    swap(a,i,end);//�����ķŵ�i��λ�� 
    return i;
} 
  
private static void swap(int[] a,int i,int j) 
{
    int tmp=a[i];
    a[i]=a[j];
    a[j]=tmp;
}
} 