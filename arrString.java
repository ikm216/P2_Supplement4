public class arrString{
    private String[] arr;

    public arrString(int len){
        this.arr = new String[len];
    }

    public void insert(String val, int i){
        int index = i % arr.length;
        arr[index] = val;
    }

    public String[] getArr(){
        return arr;
    }

    
}