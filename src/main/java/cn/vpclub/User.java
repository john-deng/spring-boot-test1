package cn.vpclub;

/**
 * Created by XTL on 8/14/2014.
 */
public class User {

    private String name;

    private long id;

    public User(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
