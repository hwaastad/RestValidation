package org.waastad.it;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.openejb.jee.WebApp;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Classes;
import org.apache.openejb.testing.EnableServices;
import org.apache.openejb.testing.Module;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.waastad.restversioning.activation.AppConfig;
import org.waastad.restversioning.service.impl.RestServiceV1;
import org.waastad.restversioning.service.impl.RestServiceV2;
import org.waastad.restversioning.service.v1.RestService;
import org.waastad.restversioning.util.MediaTypes;

@EnableServices(value = "jaxrs")
@RunWith(ApplicationComposer.class)
public class RestIT {

    public RestIT() {
    }

    @Module
    @Classes({RestService.class, org.waastad.restversioning.service.v2.RestService.class, AppConfig.class})
    public WebApp myWebApp() {
        return new WebApp();
    }

    @Test
    public void testV1() throws Exception {
        WebClient client = WebClient.create("http://127.0.0.1:4204/openejb/rest/test/info");
        client.accept(MediaTypes.V1_JSON);
        client.type(MediaTypes.V1_JSON);
        String get = client.get(String.class);
        assertEquals(MediaTypes.V1_JSON, get);
        System.out.println("Response V1: " + get);
    }

    @Test
    public void testV2() throws Exception {
        WebClient client = WebClient.create("http://127.0.0.1:4204/openejb/rest/test/info");
        client.accept(MediaTypes.V2_JSON);
        client.type(MediaTypes.V2_JSON);
        String get = client.get(String.class);
        assertEquals(MediaTypes.V2_JSON, get);
        System.out.println("Response V2: " + get);
    }

}
