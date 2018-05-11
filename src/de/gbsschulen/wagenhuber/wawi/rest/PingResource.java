package de.gbsschulen.wagenhuber.wawi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("/ping")
public class PingResource {

    private Date date = new Date();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTime() {
        long timeValue = date.getTime();
        int stunden = date.getHours();
        int minuten = date.getMinutes();
        int sekunden = date.getSeconds();
        String time = String.valueOf(stunden)+ " "+ String.valueOf(minuten) +" " + String.valueOf(sekunden);
        return time;
    }


}
