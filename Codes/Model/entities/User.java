package Codes.Model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User{
    private String name;
    private String userName;
    private String password;
    private boolean admin;
    protected List<User> friends;
    protected List<User> friendsRequest;
    protected List<Post> posts;
    protected List<Comment> messages;


    public User(String name, String userName, String password, boolean admin) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.admin = admin;
        friends = new ArrayList<>();
        friendsRequest = new ArrayList<>();
        posts = new ArrayList<>();
        messages = new ArrayList<>();
    }

    public boolean getAdmin() {
      return this.admin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<User> getFriendsRequest() {
        return friendsRequest;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Comment> getMessages() {
        return messages;
    }

    public int sizeFriends() {
        return friends.size();
    }
    public int sizeFriendsRequest() {
        return friendsRequest.size();
    }
    public int sizePosts() {
        return posts.size();
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
