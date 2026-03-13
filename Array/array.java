
public class array {
    public static void main(String[] args) {
        // array is contiguous memory allocation , means array is stored in same memory
        // location and index are also in same memory location
        // array definition and initialization , int[]->type of array, rollNubs->name of
        // array, 3->size of array , new->keyword to create array
        int[] rollNubs = new int[3];

        // array indexing starts from 0 and ends at size-1 (3-1=2) , we can store 3
        // values in this array
        // if we try to access index out of bound it will throw an error
        // ->ArrayIndexOutOfBoundsException
        // if we try to access index -1 it will throw an error
        // ->ArrayIndexOutOfBoundsException
        // if we try to access index 3 it will throw an error
        // ->ArrayIndexOutOfBoundsException
        // array me value store karne ke liye -> arrayName[index]=value

        rollNubs[0] = 101;
        rollNubs[1] = 102;
        rollNubs[2] = 103;
        // print array values using index
        System.out.println(rollNubs[0]);
        System.out.println(rollNubs[1]);
        System.out.println(rollNubs[2]);

        // print array of length
        System.out.println("length of array is " + rollNubs.length);

        // fill array using for loop and print array using for loop
        int x = 101;
        for (int i = 0; i < rollNubs.length; i++) {
            rollNubs[i] = x;
            x++;
        }
        for (int i = 0; i < rollNubs.length; i++) {
            System.out.println(rollNubs[i]);
        }
    }
}