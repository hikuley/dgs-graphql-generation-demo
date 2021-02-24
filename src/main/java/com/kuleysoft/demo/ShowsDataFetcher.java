package com.kuleysoft.demo;

import com.kuleysoft.generated.types.Actor;
import com.kuleysoft.generated.types.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;

import java.util.Arrays;
import java.util.List;

@DgsComponent
public class ShowsDataFetcher {

    @DgsData(parentType = "Query", field = "shows")
    public List<Show> shows() {
        final Show show1 = new Show("Engineer", Arrays.asList(new Actor("Mehmet"), new Actor("Ertem"), new Actor("Muhammed"), new Actor("Zülküf")));
        final Show show2 = new Show("Doctor", Arrays.asList(new Actor("Ali"), new Actor("Ertem"), new Actor("Muhammed"), new Actor("Zülküf")));
        final Show show3 = new Show("Artis", Arrays.asList(new Actor("Ayşe"), new Actor("Ertem"), new Actor("Muhammed"), new Actor("Zülküf")));
        final Show show4 = new Show("QA", Arrays.asList(new Actor("Zeki"), new Actor("Ertem"), new Actor("Muhammed"), new Actor("Zülküf")));
        final Show show5 = new Show("Carpenter", Arrays.asList(new Actor("George"), new Actor("Ertem"), new Actor("Muhammed"), new Actor("Zülküf")));
        return Arrays.asList(show1, show2, show3, show4, show5);
    }

    @DgsData(parentType = "Query", field = "actors")
    public List<Actor> actors() {
        return Arrays.asList(new Actor("Mehmet"), new Actor("Ertem"), new Actor("Muhammed"), new Actor("Zülküf"));
    }

}
