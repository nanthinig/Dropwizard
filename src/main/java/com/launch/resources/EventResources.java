package com.launch.resources;

import com.launch.api.Event;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Path("events")
@Produces(MediaType.APPLICATION_JSON)
public class EventResources {

        @GET
        public List<Event> allEvents()
        {
            Event e = new Event();

            e.setDate(new Date());
            e.setName("Birthday");
            e.setId(1L);
            e.setDescription("Please be on time");
            e.setLocation("22,baker street, chenani");
            return Collections.singletonList(e);

        }

}
