package com.bojesenmark.thymeleafDemo.serviceimpl;

import com.bojesenmark.thymeleafDemo.model.Thing;
import com.bojesenmark.thymeleafDemo.service.ThingDAO;

import java.util.ArrayList;
import java.util.List;

public class ThingDAOImpl implements ThingDAO {

    List<Thing> listOfThings;

    public ThingDAOImpl() {
        listOfThings = new ArrayList<>();
        Thing thing1 = new Thing("Wolverine");
        Thing thing2 = new Thing("Hulk");
        Thing thing3 = new Thing("Batman");
        Thing thing4 = new Thing("Superman");
        Thing thing5 = new Thing("Deadpool");
        listOfThings.add(thing1);
        listOfThings.add(thing2);
        listOfThings.add(thing3);
        listOfThings.add(thing4);
        listOfThings.add(thing5);
    }

    @Override
    public List<Thing> getAllThings() {
        return listOfThings;
    }
}
