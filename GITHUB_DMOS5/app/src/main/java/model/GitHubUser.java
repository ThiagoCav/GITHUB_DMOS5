package model;

import com.google.gson.annotations.SerializedName;

public class GitHubUser {

    @SerializedName("login")
    private String login;

    @SerializedName("name")
    private String name;


    public GitHubUser(
                      String name,
                      String login) {
        this.setName(name);
        this.setLogin(login);
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
