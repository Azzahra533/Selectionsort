package selectionsort;

import java.util.Arrays;


public class SelectionSort {
    
    public static void main(String[] args) {
        int data[]={100,78,04,11,50,35};
        int min = data[0];
        int index = 0;
        
        for(int j=0;j<data.length-1;j++){
        for(int i = j;i<data.length;i++) {
            if(data[i]<min){
                min = data[i];
                index = i;
            }
            System.out.println(Arrays.toString(data));
        }
        if(min<data[j]){
            data[index] = data[j];
            data[j] = min;
        }
        min = data[j+1];
    }
    }
    
}