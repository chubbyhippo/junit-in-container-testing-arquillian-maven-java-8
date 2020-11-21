import java.io.IOException;

import javax.enterprise.inject.Produces;

import arquillian.Flight;

public class FlightProducer {
 
    @Produces
    public Flight createFlight() throws IOException {
        return FlightBuilderUtil.buildFlightFromCsv();
    }
}