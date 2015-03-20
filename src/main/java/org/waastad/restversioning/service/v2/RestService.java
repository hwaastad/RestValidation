package org.waastad.restversioning.service.v2;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.waastad.restversioning.util.MediaTypes;

@Path("/test")
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaTypes.V2_XML, MediaTypes.V2_JSON})
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaTypes.V2_XML, MediaTypes.V2_JSON})
public interface RestService {

    @GET
    @Path("/info")
    String getInfo();

}
