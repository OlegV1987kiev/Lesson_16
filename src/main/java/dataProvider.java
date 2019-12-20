import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
//@Test(dataProvider = "Login")
//    public void loginTest(String email, String pwd)
//{
//    System.out.println(email+"    "+pwd);
//}



@DataProvider(name = "Login")
    public static Object[][] dataProviderMethod() {
        Object[][] data = {{"test@mail.com", "test"},{"test1@mail.com", "test1"},{"test11@mail.com", "test11"}};
        return data;
    }


}
