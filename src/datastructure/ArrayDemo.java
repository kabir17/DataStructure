package datastructure;
/*
    Q.What are Arrays : To store multiple values :
                        1.The size is fixed.
	 			        2.It contains one data type.
	 			      (int/String=when we store int value then has to be int value etc.)
 */
public class ArrayDemo {
    public static void main(String[] args) {

        //Declare array by index not initialize the sizes
        int [] array1 = new int[5];
        array1[0]=10;
        array1[1]=11;
        array1[2]= 3;
        array1[3]= 15;
        array1[4]= 20;

        for (int k=0; k<array1.length; k++){
            System.out.println("Declare array without sizes : "+array1[k]);
        }

        //Declare and initialize array index size
        int [] array = {10,12,8,3,5};

        for(int i=0; i<array.length; i++){
            System.out.println("Use for loop : "+array[i]);
        }
        int i=0;
        while (i<array.length){
            System.out.println("Use while loop : "+array[i]);
            i++;
        }
        int j=0;
        do {
            System.out.println("Use do while loop : "+array[j]);
            j++;
        }while (j<array.length);
    }
}
