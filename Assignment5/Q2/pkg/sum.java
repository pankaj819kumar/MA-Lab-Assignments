package Q2.pkg;


public class sum{
    public int sum_of_list = 0;
        
    public int get_sum(int []arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}