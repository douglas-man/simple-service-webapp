package com.example.repository;

import com.example.model.Activity;
import com.example.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dman on 1/15/17.
 */
public class ActivityRepositoryStub implements ActivityRepository {

    public List<Activity> findAllActivities () {
        List<Activity> activities = new ArrayList<Activity>();

        Activity activity1 = new Activity();

        activity1.setDescription("Swimming");
        activity1.setDuration(55);

        activities.add(activity1);

        Activity activity2 = new Activity();

        activity2.setDescription("Cycling");
        activity2.setDuration(120);

        activities.add(activity2);

        return activities;
    }

    @Override
    public Activity findActivity(String activityId) {

        Activity activity1 = new Activity();

        activity1.setId("1234");
        activity1.setDescription("Swimming");
        activity1.setDuration(55);

        User user = new User();
        user.setId("5678");
        user.setName("Bryan");

        activity1.setUser(user);

        return activity1;
    }


}
