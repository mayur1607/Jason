import configuration.Configurations;
import customer.Customer;
import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by jason on 20/7/16.
 */
public class ApplicationMain extends Application<Configurations> {

    public static void main(String args[]) throws Exception {
        new ApplicationMain().run(args);
    }

    @Override
    public void initialize(Bootstrap<Configurations> bootstrap){

    }

    public void run(Configurations configurations, Environment environment) throws Exception {

        final HibernateBundle<Configurations> hibernate = new HibernateBundle<Configurations>(Customer.class) {


            public PooledDataSourceFactory getDataSourceFactory(Configurations configurations) {
                return configurations.getDataSourceFactory();
            }
        };

    }
}
