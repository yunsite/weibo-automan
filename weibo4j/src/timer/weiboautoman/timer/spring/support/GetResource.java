package weiboautoman.timer.spring.support;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import org.springframework.core.io.Resource;

import java.io.IOException;

public abstract class GetResource implements FactoryBean, InitializingBean {
    private Resource resource;
    private String   resourceName;
    private boolean  parent;

    public void setParent(boolean parent) {
        this.parent = parent;
    }

    public void setLocation(Resource location) throws IOException {
        resource = location;
    }

    public void afterPropertiesSet() throws Exception {
        resourceName = getLocation(resource, parent);
    }

    protected abstract String getLocation(Resource location, boolean parent)
            throws IOException;

    public Object getObject() {
        return resourceName;
    }

    public Class getObjectType() {
        return String.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
