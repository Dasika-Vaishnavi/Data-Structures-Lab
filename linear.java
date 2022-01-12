import java.util.*;
class linear{
    public static int search(ArrayList<Integer> arr, int x){
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) == x)
                return i;
        }
        return -1;
    }
    
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++)
          arr.add(i, in.nextInt());
        int x = in.nextInt();
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }
}