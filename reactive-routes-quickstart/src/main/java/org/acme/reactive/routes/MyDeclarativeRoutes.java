package org.acme.reactive.routes;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.vertx.web.Route;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.RoutingContext;

@ApplicationScoped
public class MyDeclarativeRoutes { //created a public class with the name of MyDeclarativeRoutes

    @Route(path = "/", methods = Route.HttpMethod.GET)//methods we used ofr using the http method so we called the get operation 
    public void handle(RoutingContext rc) {//function created for handling the context will get a response with a hello message 
        rc.response().end("hello");
    }

    @Route(path = "/hello", methods = Route.HttpMethod.GET)
    public void greetings(RoutingContext rc) {
        String name = rc.request().getParam("name");// will make a request to get the name of the parameter as name name is nothing then print world otherwise respond with a name 
        if (name == null) {
            name = "world";
        }
        rc.response().end("hello " + name);
    }
}
