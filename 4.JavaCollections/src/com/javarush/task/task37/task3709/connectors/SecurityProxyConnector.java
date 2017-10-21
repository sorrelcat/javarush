package com.javarush.task.task37.task3709.connectors;

import com.javarush.task.task37.task3709.security.SecurityChecker;
import com.javarush.task.task37.task3709.security.SecurityCheckerImpl;

/**
 * Created by sorre on 09.10.2017.
 */
public class SecurityProxyConnector implements Connector {

    SecurityChecker securityChecker = new SecurityCheckerImpl();
    SimpleConnector simpleConnector;

    public SecurityProxyConnector(String s) {
        this.simpleConnector = new SimpleConnector(s);
    }


    @Override
    public void connect() {
        if(this.securityChecker.performSecurityCheck()) {
            this.simpleConnector.connect();
        }
    }
}
