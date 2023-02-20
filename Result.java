
    class Result {
    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
int unfair = Collections.max(arr)-Collections.min(arr);
int i =0;
while(i+k-1<arr.size()){
    int minu =arr.get(i+k-1)-arr.get(i);
    if(minu<unfair){
        unfair = minu;
    }
    i++;
}

return unfair;
    }

}
