package com.launch;


import com.launch.resources.EventResources;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class EventApplication extends Application<EventConfiguration> {

    public static void main(final String[] args) throws Exception {
        new EventApplication().run(args);
    }

    @Override
    public String getName() {
        return "Event";
    }

    @Override
    public void initialize(final Bootstrap<EventConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final EventConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        DateFormat eventDateFormat=new SimpleDateFormat(configuration.getDateFormat());
        environment.getObjectMapper().setDateFormat(eventDateFormat);
        EventResources eventResource=new EventResources();
        environment.jersey().register(eventResource);
    }

}
