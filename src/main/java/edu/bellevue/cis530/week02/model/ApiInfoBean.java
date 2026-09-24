package edu.bellevue.cis530.week02.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ApiInfoBean {
    private static final Logger logger = LoggerFactory.getLogger(ApiInfoBean.class);

    private String status = "UNKNOWN";

    public ApiInfoBean() {
        logger.info("ApiInfoBean instance created: {}", this);
    }

    @PostConstruct
    public void init() {
        this.status = "ACTIVE";
        logger.info("ApiInfoBean initialized. Status set to: {}.", this.status);
    }

    @PreDestroy
    public void cleanup() {
        logger.info("ApiInfoBean instance: {} @PreDestroy called due to bean being destroyed", this);
    }
}
