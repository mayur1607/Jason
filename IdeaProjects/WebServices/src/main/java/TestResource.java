import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.sql.ResultSet;
import java.sql.SQLException;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {

    public TestResource() {
    }

    @GET
    @Path("create-client")
    public String createCustomer(@QueryParam("name") String name, @QueryParam("age") Integer age, @QueryParam("state") String state, @QueryParam("pincode") String pincode, @QueryParam("city") String city) {
        final String query = "insert into cust (name, age, state, pincode, city) values ('" + name +"','" + age +"','" + state +"','" + pincode +"','" + city +"');";
        JDBC jdbc = new JDBC();
        int rs = jdbc.ConnectingJDBC(query);
        if (rs == 0)
            return "Error While Inserting Data into table";
        else
            return "Data Inserted";
    }

//    public String deleteCustomer(@QueryParam("name") String name) {
//        String query = "DELETE from cust where cust.name = name";
//        JDBC jdbc = new JDBC();
//        ResultSet rs = jdbc.ConnectingJDBC(query);
//        if (rs == null)
//            return "Error Jason  ***off";
//        else {
//            try {
//                rs.close();
//                return "deleted Successfully";
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//            return null;
//        }

//    public String findCustomer(@QueryParam("name") String name) {
//        String query = "select * from cust where cust.name= name";
//        JDBC jdbc = new JDBC();
//        int rs = jdbc.ConnectingJDBC(query);
//        if (rs == 0)
//            return "Error While Inserting Data into table";
//        else {
//            try {
//                ObjectMapper mapper = new ObjectMapper();
//                ObjectNode objectNode1 = mapper.createObjectNode();
//                objectNode1.put("name", rs.getString("name"));
//                objectNode1.put("age", rs.getInt("age"));
//                objectNode1.put("state", rs.getString("state"));
//                objectNode1.put("pincode", rs.getString("pincode"));
//                objectNode1.put("city", rs.getString("city"));
//                rs.close();
//                return objectNode1.toString();
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//    }
//
//    public String updateCustomer(@QueryParam("name") String name){
//        String query = "";
//        JDBC jdbc = new JDBC();
//        ResultSet rs = jdbc.ConnectingJDBC(query);
//        if (rs == null)
//            return "Error Jason  ***off";
//        else {
//            try {
//                rs.close();
//                return "deleted Successfully";
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//
//      }
}
