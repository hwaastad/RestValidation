package org.waastad.restversioning.service.impl;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.waastad.restversioning.service.v1.RestService;
import org.waastad.restversioning.util.MediaTypes;

@Named
@RequestScoped
public class RestServiceV1 implements RestService {

    @Override
    public String getInfo() {
        return MediaTypes.V1_JSON;
    }

}
