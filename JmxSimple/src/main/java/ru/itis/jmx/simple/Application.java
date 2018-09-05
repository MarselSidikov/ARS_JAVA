package ru.itis.jmx.simple;

import ru.itis.jmx.simple.StringsCache;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * 04.09.2018
 * ru.itis.jmx.simple.Application
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Application {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("ru.itis.jmx.simple:type=StringCache");
        StringsCache stringsCache = new StringsCache();
        mBeanServer.registerMBean(stringsCache, name);
        Thread.sleep(Long.MAX_VALUE);
    }
}
