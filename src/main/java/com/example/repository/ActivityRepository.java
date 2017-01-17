package com.example.repository;

import com.example.model.Activity;

import java.util.List;

/**
 * Created by dman on 1/15/17.
 */
public interface ActivityRepository {

    List<Activity> findAllActivities();

    Activity findActivity(String activityId);
}
