package com.jiagouedu.spring;

import com.mysql.jdbc.Driver;
import org.springframework.beans.factory.FactoryBean;

import java.sql.DriverManager;

/**
 * Created by Enzo Cotter on 2019/1/9.
 */
public class SpringFactoryBean implements FactoryBean {
    private String jdbcUrl;

    @Override
    public Object getObject() throws Exception {
        return DriverManager.getDriver(jdbcUrl);
    }

    @Override
    public Class<?> getObjectType() {
        return Driver.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
