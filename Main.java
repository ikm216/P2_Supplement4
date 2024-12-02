public class Main {
    public static void main(String[] args) {
        String hex = su.hexChars();
        System.out.println("Hex: " + hex);

        String hash_string = su.hashString("chicken");
        System.out.println("Hash: " + hash_string);

        arrString arr = new arrString(10);
        arr.insert(hex, 15);
        System.out.println("Inserted Value at Index 5: " + arr.getArr()[5]);

    }
}
