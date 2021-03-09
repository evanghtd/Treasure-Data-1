//
// This doc url leads to a bad link for downloading the jdbc driver.
//
// https://docs.treasuredata.com/display/public/PD/JDBC+Driver+for+Presto
// https://prestosql.io/docs/current/installation/jdbc.html. 
/*
This XML file does not appear to have any style information associated with it. The document tree is shown below.
<Error>
<Code>AccessDenied</Code>
<Message>Access Denied</Message>
<RequestId>56KWVQR7P48KSS5W</RequestId>
<HostId>NxiO7/7PslZwib/LrmXL3+47CDCsrkDtoG77XnfxnM+PO9dpDQQVNll1Zw0ny+YHSbc0YrdtXY4=</HostId>
</Error>
*/

// import java.sql.*;
//  
// class Sample {
//   public static void main(String[] args) {
//     if(args.length != 1) {
//       System.err.println("Provide your TD API key as an argument");
//       return;
//     }
 
//     String apikey = args[0];
//     try {
//       Connection conn = DriverManager.getConnection("jdbc:presto://api-presto.treasuredata.com:443/td-presto/sample_datasets?SSL=true", apikey, "dummy_password");
//       Statement stmt = conn.createStatement();
//       try {
//         ResultSet rs = stmt.executeQuery("SELECT time, method, path from www_access limit 5");
//         while(rs.next()) {
//             long time = rs.getLong(1);
//             String method = rs.getString(2);
//             String path = rs.getString(3);
//             System.out.println(String.format("time=%s, method=%s, path=%s", time, method, path));
//         }
//       }
//       finally {
//         stmt.close();
//         conn.close();
//       }
//     }
//     catch (Exception e) {
//       e.printStackTrace();
//     }
//   }
// }



// https://trino.io/docs/current/installation/jdbc.html

// URL parameters
String url = "jdbc:trino://example.net:8080/hive/sales";
Properties properties = new Properties();
properties.setProperty("user", "test");
properties.setProperty("password", "secret");
properties.setProperty("SSL", "true");
Connection connection = DriverManager.getConnection(url, properties);

// properties
String url = "jdbc:trino://example.net:8080/hive/sales?user=test&password=secret&SSL=true";
Connection connection = DriverManager.getConnection(url);
