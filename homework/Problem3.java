package homework;
import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        //Don't edit anything here
        Integer[] a1 = new Integer[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        Integer[] a2 = new Integer[]{-1, 1, -2, 2, 3, -3, -4, 5};
        Double[] a3 = new Double[]{-0.01, -0.0001, -.15};
        String[] a4 = new String[]{"-1", "2", "-3", "4", "-5", "5", "-6", "6", "-7", "7"};
        
        bePositive(a1);
        bePositive(a2);
        bePositive(a3);
        bePositive(a4);
    }
    // <T> turns this into a generic so it can take in any datatype, it'll be passed as an Object so casting is required
    static <T> void bePositive(T[] arr){
        System.out.println("Processing Array:" + Arrays.toString(arr));
        //your code should set the indexes of this array
        Object[] output = new Object[arr.length];
        //hint: use the arr variable; don't diretly use the a1-a4 variables
        //TODO convert each value to positive
        //set the result to the proper index of the output array
        //hint: don't forget to handle the data types properly, the result datatype should be the same as the original datatype
	
														//MJ42 2/13/2024 :(
		for(int a = 0; a < arr.length; a++) {			//For loop for every element in array
			if(arr[a].getClass() == Integer.class) {	//For each datatype, I use different logic to check
				if((int) arr[a] < 0) {					//	if it is negative
					output[a] = (int) arr[a] * -1;		//If it's negative, convert to int, times (-1) then
				}										//	then back to the origincal datatype
				else {									//I can't think of a dirtier way of doing this. disgusting
					output[a] = (int) arr[a];
				}
			}
			else if (arr[a].getClass() == Double.class) {
				if((double) arr[a] < 0) {
					output[a] = (double) arr[a] * -1;
				}
				else {
					output[a] = (double) arr[a];
				}
			}
			else if(arr[a].getClass() == String.class) {
				if(Integer.parseInt((String) arr[a]) < 0) {
					output[a] = String.valueOf(Integer.parseInt((String)arr[a]) * -1);
				}
				else {
					output[a] = String.valueOf(Integer.parseInt((String)arr[a]));
				}
			}
		}
		System.out.println(arr.getClass());
        
        //end edit section

        StringBuilder sb = new StringBuilder();
        for(Object i : output){
            if(sb.length() > 0){
                sb.append(",");
            }
            sb.append(String.format("%s (%s)", i, i.getClass().getSimpleName().substring(0,1)));
        }
        System.out.println("Result: " + sb.toString());
    }
}
