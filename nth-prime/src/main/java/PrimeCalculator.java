class PrimeCalculator {

    int nth(int nth) {
        int ans=0,count=0,flag;
        for(int i=2; count<nth; i++){
            flag=0;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
                ans=i;
            }
        }
        if(ans==0){
            throw new IllegalArgumentException();
        }
        return ans;
    }

}
