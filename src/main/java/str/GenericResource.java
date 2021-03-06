package str;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Olga Grazhdanova <dvl.java@gmail.com>
 */
@Path("/hello")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of str.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getXml() {
        return "Hello";
    }

    @GET
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser() {
        return new User(1, "Ghost");
    }

    @POST
    @Path("/inc")
    @Produces(MediaType.APPLICATION_JSON)
    public Integer inc(Integer num) {
        if (num != null) {
            return ++num;
        }
        return -1;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
