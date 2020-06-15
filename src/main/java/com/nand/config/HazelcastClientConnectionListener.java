package com.nand.config;


import com.hazelcast.core.LifecycleEvent;
import com.hazelcast.core.LifecycleListener;

/**
 * Listens Lifecycle Events for client instance, if client is in shutdown state
 */

public class HazelcastClientConnectionListener implements LifecycleListener {

    @Override
    public void stateChanged(LifecycleEvent event) {
        System.out.println("LifecycleEvent.getState: " + event.getState());
    }
}
