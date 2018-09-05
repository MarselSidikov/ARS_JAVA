package ru.itis.jmx.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.support.MBeanServerFactoryBean;

import java.util.Collections;

/**
 * 05.09.2018
 * AppConfig
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Configuration
public class AppConfig {

    @Bean
    public MBeanExporter exporter() {
        MBeanExporter mBeanExporter = new MBeanExporter();
        mBeanExporter.setBeans(Collections.singletonMap("bean:name=stringsCache", stringsCache()));
        return mBeanExporter;
    }

    @Bean
    public StringsCache stringsCache() {
        return new StringsCacheListImpl();
    }

    @Bean
    public MBeanServerFactoryBean mBeanServer() {
        return new MBeanServerFactoryBean();
    }
}
