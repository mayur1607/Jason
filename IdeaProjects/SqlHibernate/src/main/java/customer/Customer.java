package customer;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by jason on 20/7/16.
 */

@Entity
@Table(name = "cust")
@NamedQueries({
        @NamedQuery(
                name = "customer.Customer.findAll",
                query = "SELECT p FROM cust p"
        )
})


public class Customer {
    @NotEmpty
    private String name;
    private int age;
    private String city;
    private String state;
    private String pincode;

    @JsonProperty
    public String getName(){
        return name;
    }

    @JsonProperty
    public int getAge(){
        return age;
    }

    @JsonProperty
    public String getCity(){
        return city;
    }

    @JsonProperty
    public String getState(){
        return state;
    }

    @JsonProperty
    public String getPincode(){
        return pincode;
    }

    @JsonProperty
    public void setName(String name){
        this.name = name;
    }

    @JsonProperty
    public void setAge(int age){
        this.age = age;
    }

    @JsonProperty
    public void setCity(String city){
        this.city = city;
    }

    @JsonProperty
    public void setState(String state){
        this.state = state;
    }

    @JsonProperty
    public void setPincode(String pincode){
        this.pincode = pincode;
    }
}
