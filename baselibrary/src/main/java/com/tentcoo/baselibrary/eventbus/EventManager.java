package com.tentcoo.baselibrary.eventbus;

import com.tentcoo.baselibrary.baseBean.Event;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by huangdiudiu on 2018/4/4.
 */

public class EventManager {
    public static void register(Object object) {
        if (!EventBus.getDefault().isRegistered(object)) {
            EventBus.getDefault().register(object);
        }
    }

    public static void unregister(Object object) {
        if (EventBus.getDefault().isRegistered(object)) {
            EventBus.getDefault().unregister(object);
        }
    }

    public static void post(Event mEvent) {
        EventBus.getDefault().post(mEvent);
    }
    public static void post(Object mEvent) {
        EventBus.getDefault().post(mEvent);
    }
}
