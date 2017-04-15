package camt.cbsd.config;

import camt.cbsd.controller.ProductController;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("camt.cbsd.controller");
        register(MultiPartFeature.class);
    }
}
