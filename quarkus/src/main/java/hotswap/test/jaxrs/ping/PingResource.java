package hotswap.test.jaxrs.ping;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class PingResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("simple")
    public Response getSimple() {
        return Response.ok().build();
    }
}
