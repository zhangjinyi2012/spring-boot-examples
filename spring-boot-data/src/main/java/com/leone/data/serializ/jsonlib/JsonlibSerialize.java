package com.leone.data.serializ.jsonlib;

import com.leone.common.entity.User;
import com.leone.common.utils.EntityFactory;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.List;

/**
 * @author leone
 * @since 2018-05-11
 **/
public class JsonlibSerialize {

    @Test
    public void singleSerialize() {
        long start = System.currentTimeMillis();

        JSONObject userJson = JSONObject.fromObject(EntityFactory.getUser());

        long middle = System.currentTimeMillis();
        System.out.println("jsonlib single serialize time: " + (middle - start) + " millisecond!");

        User user = (User) JSONObject.toBean(userJson, User.class);

        long end = System.currentTimeMillis();
        System.out.println("jsonlib single deserialize time: " + (end - middle) + " millisecond!");
    }

    @Test
    public void listSerialize() {
        long start = System.currentTimeMillis();

        JSONArray userJson = JSONArray.fromObject(EntityFactory.getUsers(1000000));

        long middle = System.currentTimeMillis();
        System.out.println("jsonlib list serialize time: " + (middle - start) + " millisecond!");

        List userList = JSONArray.toList(userJson, User.class);

        long end = System.currentTimeMillis();
        System.out.println("jsonlib list deserialize time: " + (end - middle) + " millisecond!");
    }

}
