public class Array_Programs
{
    public static void main(String[] args)
    {
        // ** To Create Arrays **

        //1. By Using new Keyword

//        int [] a = new int[5];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;
//
//        //2. By Using Flower Brackets

//        int[] b = {1,2,3,4,5};
//
//        //3.To Iterate Each Element In The Array
//
//        //1.By Using For Loop

//        for (int i = 0 ; i < b.length; i++)
//        {
//            System.out.println(b[i]);
//        }
//
//        //2. By Using for-Each Loop

//        for(int each : b)
//        {
//            System.out.println(each);
//        }

        //4. Reverse A String

//        for (int i = b.length-1;i>=0;i--)
//        {
//            System.out.println(b[i]);
//        }

        //5. To Print Odd Elements In The Array

//        int[] array = {1,7,9,4,6,2,8};
//        for (int i = 0 ; i<array.length;i++)
//        {
//            if (array[i]%2!=0)
//                System.out.println(array[i]);
//        }

        // To Print Even Elements

//        for (int i = 0 ; i<array.length;i++)
//        {
//            if (array[i]%2==0)
//                System.out.println(array[i]);
//        }

        //6. To Print Odd Index Elements

//        for (int i = 0;i<array.length;i++)
//        {
//            if(i%2!=0)
//                System.out.println("Odd Index Elements : "+array[i]);
//        }

        //To Print Even Index Elements

//        for (int i = 0;i<array.length;i++)
//        {
//            if(i%2==0)
//                System.out.println("Odd Index Elements : "+array[i]);
//        }

        //7. Of Sum Two Unequal Arrays

//        int[] a = {1,2,3};
//        int[] b = {1,2,3,4,5,6};
//        int l = a.length<b.length?a.length:b.length;
//        System.out.println(l);
//        for (int i=0;i<l;i++)
//        {
//            if(b.length>a.length)
//                b[i] = a[i] + b[i];
//            else
//                a[i] = a[i] + b[i];
//
//        }
//        b = b.length>a.length?b:a;
//        System.out.println(java.util.Arrays.toString(b));

        //8. To Move Positive Numbers Into Right Side

//        int[] a = {1,0,5,0,8,0};
//        int[] b = new int[a.length];
//        int count = a.length-1;
//        for (int i=0; i<a.length;i++)
//        {
//             if(a[i]>0)
//             {
//                 b[count] = a[i];
//                 count--;
//             }
//        }
//        System.out.println(java.util.Arrays.toString(b));

        //10. To Move The Positive Numbers into Left Side

//        int[] a = {2,0,9,0,5,0,0,1};
//        int[] b = new int[a.length];
//        int count = 0;
//        for (int i=0;i<a.length;i++)
//        {
//             if(a[i]!=0)
//             {
//                 b[count] = a[i];
//                 count++;
//             }
//        }
//        System.out.println(java.util.Arrays.toString(b));

        //11. To Move The Positive Numbers Into Right Side & Move The Negative Numbers Into Left Side

//        int[] a = {1,2,-1,-2,5,-5,8,-9,6,-12};
//        int [] b = new int[a.length];
//        int start_count = 0;
//        int end_count = a.length-1;
//        for (int i=0;i<a.length;i++)
//        {
//            if(a[i]>0)
//            {
//                b[end_count] = a[i];
//                end_count--;
//            }
//            else
//            {
//                b[start_count] = a[i];
//                start_count++;
//            }
//        }
//        System.out.println(java.util.Arrays.toString(b));

        //12. To Print 1st Max Element In The Array

//        int [] a = {1,2,3,9,4,6};
//        int max = 0;
//        for (int i=0;i<a.length;i++)
//        {
//            if(max<a[i])
//            {
//                max = a[i];
//            }
//        }
//        System.out.println("Maximum Element : "+max);
//
//
        //13. Minimum Element In The Array

//        int [] b = {1,2,3,9,4,6};
//        int min = b[0];
//        for (int i=0;i<a.length;i++)
//        {
//            if(a[i]>min)
//            {
//                min = a[i];
//            }
//        }
//        System.out.println("Minimum Element : "+min);

        //14. 2nd Max Element In The Array

//        int[] a = {1,2,5,9,8,4};
//        int max1 = 0;
//        int max2 = 0;
//        for (int i =0 ;i<a.length;i++)
//        {
//            if(a[i]>max1)
//            {
//                max2 = max1;
//                max1 = a[i];
//            }
//            else if (a[i]>max2) {
//                max2 = a[i];
//            }
//        }
//        System.out.println(max2);

        //15. 2nd Minimum Element In the Array
//
//        int [] a = {1,2,6,7,8};
//        int min1 = a[0];
//        int min2 = a[0];
//        for (int i = 0 ;i<a.length ; i++)
//        {
//            if(a[i]<min1)
//            {
//                min2 = min1;
//                min1 = a[i];
//            } else if (a[i]<min2 && a[i]!=min1)
//            {
//                min2 = a[i];
//            }
//        }
//        System.out.println(min2);

        //16. To Print The Prime Number Elements Present In The Array

//        int [] a = {2,5,7,4,6,8,9,11,15,20,23};
//        for(int i = 0 ; i < a.length ; i++)
//        {
//            boolean flag = true;
//            for (int j = 2; j <= a[i]/2  ; j++)
//            {
//                 if(a[i]%j==0)
//                 {
//                     flag = false;
//                     break;
//                 }
//            }
//            if(flag)
//            {
//                System.out.println(a[i]);
//            }
//        }

        //// 17. To Print The Array By Removing The Duplicate Elements in The Array

//                int[] a = {1, 2, 4, 5, 2, 1, 4};
//
//                for (int i = 0; i < a.length; i++)
//                {
//                    boolean isDuplicate = false;
//                    for (int j = 0; j < i; j++)
//                    {
//                        if (a[i] == a[j])
//                        {
//                            isDuplicate = true;
//                            break;
//                        }
//                    }
//                    if (!isDuplicate)
//                    {
//                        System.out.print(a[i] + " ");
//                    }
//                }

        // Searching & Sorting

        //1. Linear Search

//        int [] a = {5,2,9,4,8,2};
//        int key = 8;
//        System.out.println(linear(a,key));

        //2.Binary Search

//        int[] a = {5,2,9,4,8,7};
//        int key = 7;
//        java.util.Arrays.sort(a);
//        System.out.println(binary(a,key));

        //1.Bubble Sort

//        int [] a = {7,9,2,5,4,6,1};
//        bubble(a);
//        System.out.println(java.util.Arrays.toString(a));

        //2. Insertion Sort

//        int [] a = {2,4,1,6,3,8,5};
//        insertion(a);
//        System.out.println(java.util.Arrays.toString(a));

        //3. Selection Sort

//        int [] a = {2,4,1,6,3,8,5};
//        selection(a);
//        System.out.println(Arrays.toString(a));

        //4. Quick Sort

//        int [] a = {2,4,1,6,3,8,5};
//        quick(a , 0 , a.length - 1);
//        System.out.println(Arrays.toString(a));

        //5. Merge Sort

//        int [] a = {2,4,1,6,3,8,5};
//        m_sort(a);
//        System.out.println(Arrays.toString(a));

    }

    //1. Linear Search

//    public static int linear(int a[] , int key)
//    {
//        for (int i = 0; i < a.length; i++)
//        {
//            if (a[i] == key)
//                return i;
//        }
//        return -1;
//    }

    //2. Binary Search

//    public static int binary(int [] a , int key)
//    {
//        int start = 0;
//        int end = a.length-1;
//        while(start<=end)
//        {
//            int mid = (start+end)/2;
//            if(key==a[mid])
//            {
//                return mid;
//            }
//            else if (key<a[mid])
//            {
//                end = mid-1;
//            }
//            else
//            {
//                start = mid+1;
//            }
//        }
//        return -1;
//    }

    //1. Bubble Sort

//    public static void bubble(int [] a)
//    {
//        for (int i = 0 ;i < a.length ; i++)
//        {
//            for (int j = 0 ; j < a.length - 1 ; j++)
//            {
//                if(a[j]>a[j+1])  9 , 7
//                {
//                    int temp = a[j]; temp = 9;
//                    a[j] = a[j+1];   a[1] = 7
//                    a[j+1] = temp;   a[2] = 9
//                }
//            }
//        }
//    }

    //2. Insertion Sort

//    public static void insertion(int [] a)
//    {
//        for (int i = 1; i<a.length ; i++)
//        {
//            int j = i-1;
//            int key = a[i];
//            while(j>=0 && a[j]>key)
//            {
//                a[j+1] = a[j];
//                j--;
//            }
//            a[j+1] = key;
//        }
//    }

    //3. Selection Sort

//    public static void selection(int [] a)
//    {
//        for ( int i = 0 ; i < a.length ; i++)
//        {
//            int minIndex = i;
//            for (int j = i+1 ; j < a.length ; j++)
//            {
//                if(a[j] < a[minIndex])
//                    minIndex = j;
//            }
//            int temp = a[i];
//            a[i] = a[minIndex];
//            a[minIndex] = temp;
//        }
//    }

    //4. Quick Sort

//    public static void quick(int[] a , int start , int end)
//    {
//        if(start > end) return;
//        int i = start;
//        int j = end;
//        int pivot = (start + end)/2;
//        while (a[i] < a[pivot])
//        {
//            i++;
//        }
//        while (a[j]>a[pivot])
//        {
//            j--;
//        }
//        if(i<=j)
//        {
//            int temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//            i++;
//            j--;
//        }
//        quick(a,start,j);
//        quick(a,i,end);
//    }

    //5. Merge Sort

//    public static void m_sort(int [] a)
//    {
//        if(a.length <= 1 )
//            return;
//        int [] left = new int[a.length/2];
//        int [] right = new int[a.length - left.length];
//        for (int i = 0 ; i < left.length ; i++)
//        {
//           left[i] = a[i];
//        }
//        for (int j = 0 ; j < right.length ; j++)
//        {
//            right[j] = a[j+ left.length];
//        }
//        m_sort(left);
//        m_sort(right);
//        merge(left,right,a);
//    }
//    public static void merge(int[] a , int [] b , int [] c)
//    {
//        int i,j,k;
//        i=0;
//        j=0;
//        k=0;
//        while (i<a.length && j<b.length)
//        {
//            if(a[i]<b[j])
//                c[k++] = a[i++];
//            else
//                c[k++] = b[j++];
//        }
//        while(i<a.length)
//            c[k++] = a[i++];
//        while (j<b.length)
//            c[k++] = b[j++];
//    }


}
