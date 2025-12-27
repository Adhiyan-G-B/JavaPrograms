public class OrderAgnasticBinarySearch {
    public static void main(String[] args){
        int[] arr = {91,89,87,76,65,43,32,21,9,8,7,6,5,4,3,2,1};
        int target = 89;
        int ans = OABinarySearch(arr,target);
        System.out.println(ans);
    }
    static int OABinarySearch(int[] arr,int target){
        int s=0,e=arr.length-1;
        boolean isAsc = arr[s]<arr[e];
        while(s<=e){
            int mid = s+(e-s)/2;

            if(target==arr[mid]){
                return mid;
            }
            if (isAsc){
                if (target>arr[mid]) {
                    s = mid+1;
                }else {
                    e = mid-1;
                }
            }else{
                if (target>arr[mid]) {
                    e = mid-1;
                }else {
                    s = mid+1;
                }
            }
        }
        return -1;
    }
}
