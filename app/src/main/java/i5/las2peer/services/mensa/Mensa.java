package i5.las2peer.services.mensa;


import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import i5.las2peer.api.Context;
import i5.las2peer.api.ManualDeployment;
import i5.las2peer.api.ServiceException;
import i5.las2peer.api.logging.MonitoringEvent;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;

import java.util.HashMap;
import java.util.Map;
 

/**
 *
 * 284
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("mensa")
@ManualDeployment
public class Mensa extends RESTService {





  public Mensa() {
	super();
    // read and set properties values
    setFieldValues();
    
  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "284", version = "0.0.0",
          description = "",
          termsOfService = "",
          contact = @Contact(name = "", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/GHProjectsTest/microservice-284/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final Mensa service = (Mensa) Context.getCurrent().getService();

      /**
   * 
   * postDishRating
   *
   * 
   * @param body  a JSONObject
   * @param id  a String

   * 
   * @return Response 
   * 
   */
  @POST
  @Path("/dishes/{id}/ratings")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_CREATED, message = "created"),
       @ApiResponse(code = HttpURLConnection.HTTP_BAD_REQUEST, message = "badreq"),
       @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "notfound")
  })
  @ApiOperation(value = "postDishRating", notes = " ")
  public Response postDishRating(String body, @PathParam("id") String id) {
    JSONObject body_JSON = (JSONObject) JSONValue.parse(body);




     
    // service method invocations

     




    // created
    boolean created_condition = true;
    if(created_condition) {
      JSONObject created = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_CREATED).entity(created.toJSONString()).build();
    }
    // badreq
    boolean badreq_condition = true;
    if(badreq_condition) {
      JSONObject badreq = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_BAD_REQUEST).entity(badreq.toJSONString()).build();
    }
    // notfound
    boolean notfound_condition = true;
    if(notfound_condition) {
      JSONObject notfound = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_NOT_FOUND).entity(notfound.toJSONString()).build();
    }
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

  // //////////////////////////////////////////////////////////////////////////////////////
  // Custom monitoring message descriptions (can be called via RMI)
  // //////////////////////////////////////////////////////////////////////////////////////

  public Map<String, String> getCustomMessageDescriptions() {
    Map<String, String> descriptions = new HashMap<>();
    
    return descriptions;
  }

}
