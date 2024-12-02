public class arrString{
    /**
     * Constructor initializes the array with the specified length.
     *
     * @param len The length of the array.
     */
    private String[] arr;

    public arrString(int len){
        this.arr = new String[len];
    }
    /**
     * Inserts a string into the array.
     *
     * @param val The string to insert.
     * @param i The index to insert at (modulus applied).
     */
    public void insert(String val, int i){
        int index = i % arr.length;
        arr[index] = val;
    }
    /**
     * Gets the array.
     *
     * @return The array of strings.
     */
    public String[] getArr(){
        return arr;
    }

    
}