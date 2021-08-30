// good application for kadane's algo
// Kadane's Algo

public class Solution {
    //"010" --> [1,1] interval
    
    public ArrayList<Integer> flip(String A) {

        itr f = new itr();
        itr tmp = new itr();

        for(int i=0; i< A.length(); i++){
            if(A.charAt(i)=='0'){
                tmp.sum++;
                tmp.e = i;
            }else{
                if(f.sum<tmp.sum){
                    f.sum = tmp.sum;
                    f.s=tmp.s;
                    f.e = tmp.e;
                }
                tmp.sum--;
                if(tmp.sum<0){
                    tmp.s=i+1;
                    tmp.sum=0;
                }
            }
        }
        if(f.sum<tmp.sum){
                    f.sum = tmp.sum;
                    f.s=tmp.s;
                    f.e = tmp.e;
        }
        if(f.e==-1){
            return new ArrayList<>();
        }
        return new ArrayList(Arrays.asList(f.s+1, f.e+1));

    }


}

class itr {
    int s;
    int e;
    int sum;

    public itr(){
        s=0;
        e=-1;
        sum=0;
    }
}
