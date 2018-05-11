package com.launch;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class EventConfiguration extends Configuration {
    // TODO: implement service configuration
    @NotEmpty

    public String getDateFormat()
    {
        String dateFormat = new String();
        return dateFormat;
    }

}
