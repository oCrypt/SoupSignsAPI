package com.cahrypt.me.soupsignsapi;

import com.cahrypt.me.soupsignsapi.data.IDataManager;
import com.cahrypt.me.soupsignsapi.manager.ISoupManager;

public interface SoupSignsAPI {

    IDataManager getDataManager();

    ISoupManager getSoupManager();
}
