package com.zh.coherence.viewer.jmx;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JMXManager {
    private static JMXManager manager = new JMXManager();
    private MBeanServerConnection server = null;

    private JMXManager() {
    }

    public static JMXManager getInstance() {
        return manager;
    }

    public boolean isEnabled() {
        return server != null;
    }

    public MBeanServerConnection getServer() {
        return server;
    }

    public void connect(String url) {
        try {
            JMXServiceURL serviceUrl = new JMXServiceURL(url);
            JMXConnector connector = JMXConnectorFactory.newJMXConnector(
                    serviceUrl, null);
            connector.connect();
            server = connector.getMBeanServerConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Set<String> getCacheNamesList() {
        Set<String> ret = new HashSet<String>();
        try {
            Set<ObjectName> cacheNamesSet = server.queryNames(new ObjectName("Coherence:type=Cache,*"), null);
            for (Object aCacheNamesSet : cacheNamesSet) {
                ObjectName cacheNameObjName = (ObjectName) aCacheNamesSet;
                ret.add(cacheNameObjName.getKeyProperty("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public Map<String, String> getClusterInfo(){
        Map<String, String> data = new HashMap<String, String>();
        try{
            ObjectName oName = new ObjectName("Coherence:type=Cluster");
            data.put("Name", String.valueOf(server.getAttribute(oName, "ClusterName")));
            data.put("Size", String.valueOf(server.getAttribute(oName, "ClusterSize")));
            data.put("License Mode", String.valueOf(server.getAttribute(oName, "LicenseMode")));
            data.put("Coherence Version", String.valueOf(server.getAttribute(oName, "Version")));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
