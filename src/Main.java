import com.sun.jdi.NativeMethodException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



public class Main {
    public static void main(String[] args) {

        ProductUtils.createTable();
        ProductUtils.getAllProduct()
                .stream()
                .forEach(product -> System.out.println(product));

        ProductUtils.updateProduct(1,  "chocolate" );



        ProductUtils.getAllProduct()
                .stream()
                .forEach(product -> System.out.println(product));

    }
}



