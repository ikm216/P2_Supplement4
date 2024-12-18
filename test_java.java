import org.junit.*;

public class test_java {
    @Test
    public void test_should_return_HexChars(){
        String hex = su.hexChars();
        Assert.assertNotNull(hex);
        Assert.assertEquals(36, hex.length());
        Assert.assertTrue(hex.matches("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"));
    }

    @Test
    public void test_should_return_hash_string(){
        String string = "chicken";
        String hash_string = su.hashString(string);
        Assert.assertNotNull(hash_string);
        Assert.assertEquals(64, hash_string.length());
        Assert.assertTrue(hash_string.matches("[0-9a-f]+"));
    }

    @Test
    public void test_should_array_field_of_strings(){
        arrString arr = new arrString(10);
        String val = su.hexChars();
        int i = 15;

        arr.insert(val, i);
        Assert.assertEquals(val, arr.getArr()[5]);
    }
}
