 class Solution {
    public double myPow(double x, int n) {
        
        if(n==0) return 1; //any number to the power zero is equal to one.
        
        double temp = myPow(x,n/2); //For example, for x^4 temp will be x^2.
        
        if(n%2==0){
            return temp*temp; //Because x^2 * x^2 = x^4.
        }
        else{
            if(n>0){
                return x*temp*temp; //Here we are multiplying an extra x because in case input was x^5 (odd n), temp 
                                    //would still be x^2. So, its basically x^2*x^2*x which is x^5 ultimately.
            }
            else{
                return (temp*temp)/x; // In case input was x^-5 (negative odd n), temp would be x^-2. 
                                      // So this is actually x^-2*x*-2/x which is x^-5 only.
            }
        }
    }
}
