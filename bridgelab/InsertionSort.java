package bridgelab;

public class InsertionSort {

    public static void main(String[] args) {

        String []arr = {"bridgelab","HI", "from","im","learninghere" };
        int n = arr.length;
        sort(arr,n);
        printArrString(arr, n);

    }

    static void sort(String []s, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String temp = s[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }

    static void printArrString(String str[], int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(str[i]+" ");
    }

}
