package org.waastad.restversioning.activation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.waastad.restversioning.service.impl.RestServiceV1;
import org.waastad.restversioning.service.impl.RestServiceV2;

@ApplicationPath("/rest")
public class AppConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<>(Arrays.asList(RestServiceV1.class, RestServiceV2.class));
    }

}
