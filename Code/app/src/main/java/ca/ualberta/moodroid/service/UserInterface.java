package ca.ualberta.moodroid.service;

import java.util.List;

import ca.ualberta.moodroid.model.FollowRequestModel;
import ca.ualberta.moodroid.model.UserModel;

public interface UserInterface {

    /**
     * Set the username of the current user, useful for a one time
     *
     * @param name
     */
    public void setCurrentUserUsername(String name);


    /**
     * Get a list of all your pending follow requests
     *
     * @return
     */
    public List<FollowRequestModel> getAllPendingFollowRequests();

    /**
     * Create a new follow request for a specified user
     *
     * @param user
     */
    public FollowRequestModel createFollowRequest(UserModel user);

    /**
     * Accept a follow request from another user
     *
     * @param request
     */
    public void acceptFollowRequest(FollowRequestModel request);

    /**
     * Deny a follow request from another user
     *
     * @param request
     */
    public void denyFollowRequest(FollowRequestModel request);

    /**
     * Get a user by his username and return a full UserModel
     *
     * @param username
     * @return
     */
    public UserModel getUserByUsername(String username);

}
