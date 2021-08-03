package com.bag.kingkong_android;

import com.bag.kingkong_android.rest.TestRest;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        register(TestRest.class);
    }
}
