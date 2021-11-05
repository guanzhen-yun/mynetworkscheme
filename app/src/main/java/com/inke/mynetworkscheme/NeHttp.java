package com.inke.mynetworkscheme;

public class NeHttp {

    public static<T, M> void sendJsonRequest(String url, T requestData, Class<M> response,
                                             IJsonDataListener listener) {
        IHttpRequest httpRequest = new JsonHttpRequest();
        CallbackListener callbackListener = new JsonCallBackListener(response, listener);
        HttpTask ht = new HttpTask(url, requestData, httpRequest, callbackListener);
        ThreadPoopManager.getInstance().addTask(ht);
    }

}
