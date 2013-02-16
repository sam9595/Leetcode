import java.util.Arrays;


public class NextPerm {
    public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(num.length == 0)
    		return;
    	int max = num[num.length - 1];
    	int stop = -1;
    	for(int i = num.length - 1 ; i >= 0 ; i --){
    		if(num[i] >= max)
    			max = num[i];
    		else{
    			stop = i;
    			break;
    		}
    	}

    	if(stop == -1){
    		Arrays.sort(num);
    		return;
    	}
    	int minmaxstop = num[stop+1];
    	int minmaxidx = stop+1;
    	for(int i = stop + 1 ; i < num.length ; i++){
    		if(num[i] > num[stop]){
    			if(num[i] < minmaxstop){
    				minmaxstop = num[i];
    				minmaxidx = i;
    			}
    		}
    	}
    	int temp = num[stop];
    	num[stop] = num[minmaxidx];
    	num[minmaxidx] = temp;
    	Arrays.sort(num,stop+1,num.length);

    	return;
    }
    public static void main(String args[]){
    	NextPerm p = new NextPerm();
    	int [] a = {1,4,2,3};
    	p.nextPermutation(a);
    	for(int i : a){
    		System.out.println(i);
    	}
    }
}
