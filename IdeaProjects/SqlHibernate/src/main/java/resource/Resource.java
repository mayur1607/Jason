package resource;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by jason on 20/7/16.
 */

@Path("/cust-record")
@Produces(MediaType.APPLICATION_JSON)
public class Resource {
    private final String name;
    private final int age;
    private final String city;
    private final String state;
    private final String pincode;
    public Resource(String name, int age, String city, String state, String pincode) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }


}
