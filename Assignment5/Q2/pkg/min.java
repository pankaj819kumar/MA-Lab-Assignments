package Q2.pkg;

public class min {

    public int get_minimum(int []arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length;i++){
            ans = Math.min(arr[i],ans);
        }
        return ans;
    }
}
