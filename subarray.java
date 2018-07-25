import java.util.Scanner;


public class subarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int k = 0; k < tc; k++){
            int ln = sc.nextInt();
            int[] arr = new int[ln];
            for(int i = 0; i < ln; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(find_max_subarray(arr));
        }
    }

    private static int find_max_subarray(int[] arr) {
        int [] maxsumarr = new int[arr.length];
        maxsumarr[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (maxsumarr[i - 1] + arr[i] > arr[i]) {
                maxsumarr[i] = maxsumarr[i - 1] + arr[i];
            } else {
                maxsumarr[i] = arr[i];
            }
        }
        int maxsum = maxsumarr[0];
        for(int i = 0; i <maxsumarr.length; i++){
            if(maxsum < maxsumarr[i]){
                maxsum = maxsumarr[i];
            }
        }
        return (maxsum);
    }

}
