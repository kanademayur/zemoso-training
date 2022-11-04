package ocp;

interface ValueComparator {
    //return +ve if value1 >value2.  -ve if value1 < value2,  o if value1 = value2
    int compare(int value1, int value2);
}
class CustomerId {
    public static void sort(int a[], ValueComparator comparator ) {
        for (int i=0;i< a.length;i++) {
            for (int j=i+1;j< a.length;j++) {
                if (comparator.compare(a[i],a[j])> 0){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

    }
}
public class OpenClose {
    public static void main (String[] args) {
        int arr[]= {1,5,4,2,3};
        CustomerId.sort(arr, new AscComparator());
        System.out.println("values in the arrays are :");
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
class AscComparator implements ValueComparator {

    @Override
    public int compare(int value1, int value2) {
        return value1 - value2;
    }
}
    class DescComparator implements ValueComparator {

        @Override
        public int compare(int value1, int value2) {
            return value2 - value1;
        }
    }

