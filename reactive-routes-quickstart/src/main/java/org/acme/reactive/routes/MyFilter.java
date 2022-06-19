package org.acme.reactive.routes;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.quarkus.vertx.http.runtime.filters.Filters;

@ApplicationScoped
public class MyFilter { //created a filter class with the public specifier 

    public void registerMyFilter(@Observes Filters filters) {// function of registermyfilter register operation is used  
        filters.register(rc -> {
            rc.response().putHeader("X-Header", "intercepting the request"); //function call back method is used for getting the response as putting header "x-header","intercepting the request"
            rc.next();
        }, 100);
    }
}
