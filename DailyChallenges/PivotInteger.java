class PivotInteger {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end-start)/2;
            int firstSum = (mid)*(mid+1)/2;
            int secondSum = (n)*(n+1)/2 - firstSum + mid;
            if (firstSum == secondSum) {
                return mid;
            }
            else if (firstSum < secondSum) {
                start = mid + 1; 
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
