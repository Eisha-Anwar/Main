

public class JUNITTEST {

	
	
	public int ArrayMIN(int[] intArray) {


        int minNum = intArray[0];

        for (int j : intArray) {
            if (j < minNum)
                minNum = j;
        }

      return minNum;
	}
	public static void main(String[] args) {
		JUNITTEST b=new JUNITTEST();
		int[] intArray = {24, 2, 0, 34, 12, 110, 2};
		b.ArrayMAX(intArray);
        b.ArrayMIN(intArray);
}

}
