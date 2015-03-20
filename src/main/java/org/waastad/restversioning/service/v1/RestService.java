package org.waastad.restversioning.service.v1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.waastad.restversioning.util.MediaTypes;

@Path("/test")
@Consumes({MediaTypes.V1_XML, MediaTypes.V1_JSON})
@Produces({MediaTypes.V1_XML, MediaTypes.V1_JSON})
public interface RestService {

    @GET
    @Path("/info")
    String getInfo();

}
