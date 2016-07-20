import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;

/**
 * Created by jason on 19/7/16.
 */
public class Test extends Application<TestConfiguration>{


   @Override
   public String getName() {
      return "hello-world";
   }

   public static void main(String[] args) throws Exception {
         new Test().run(args);
      }

      @Override
      public void initialize(Bootstrap<TestConfiguration> bootstrap) {
         // nothing to do yet
      }

      @Override
      public void run(TestConfiguration configuration,
                      io.dropwizard.setup.Environment environment) {
         // nothing to do yet
         final TestResource resource = new TestResource();
         environment.jersey().register(resource);
      }

}
