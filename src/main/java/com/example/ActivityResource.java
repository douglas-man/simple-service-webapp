package com.example;

import com.example.model.Activity;
import com.example.model.User;
import com.example.repository.ActivityRepository;
import com.example.repository.ActivityRepositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by dman on 1/15/17.
 */
@Path("activities")
public class ActivityResource {
    private ActivityRepository activityRepository = new ActivityRepositoryStub();


    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Activity> getAllActivities() {
        return activityRepository.findAllActivities();
    }


    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("{activityId}") //http:localhost:8080/exercise-services/webapi/activites/1234
    public Activity getActivity(@PathParam("activityId") String activityId) {
        return activityRepository.findActivity(activityId);
    }


    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("{activityId}/user") //http:localhost:8080/exercise-services/webapi/activites/1234/User
    public User getActivityUser(@PathParam ("activityId") String activityId) {
        return activityRepository.findActivity(activityId).getUser();
    }

}
