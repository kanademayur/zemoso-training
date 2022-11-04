package ocp;

public class NotObeyOcp {

    class ArrayUtil {
        public static void sort(int a[]) {
            for (int i=0;i< a.length;i++) {
                for (int j=i+1;j< a.length;j++) {
                    if (a[i]>a[j]){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }

        }
    }
    public static void main (String[] args) {
        int arr[]= {1,5,4,2,3};
        ArrayUtil.sort(arr);
        System.out.println("values in the arrays are :");
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
