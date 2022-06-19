package org.acme.reactive.routes;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.vertx.ext.web.Router;

@ApplicationScoped
public class MyRouteRegistar {//MyRouteRegister class used 

    public void init(@Observes Router router) {//init method created 
        router.get("/my-route").handler(rc -> rc.response().end("Hello from my route"));//get method called for getting /my-route that will handle teh response hello from mjy route
    }

}
