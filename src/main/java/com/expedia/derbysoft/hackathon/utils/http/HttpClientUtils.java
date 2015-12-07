package com.expedia.derbysoft.hackathon.utils.http;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by zhupan on 12/8/15.
 */
public abstract class HttpClientUtils {

    private static final int TIMEOUT = 120 * 1000;

    private static final Charset UTF_8 = Consts.UTF_8;

    protected static Log logger = LogFactory.getLog(HttpClientUtils.class);

    public static String getResult(String url) {
        return getContent(HttpClients.createDefault(), httpGet(url));
    }

    private static String getContent(CloseableHttpClient httpclient, HttpGet httpPost) {
        try {
            HttpResponse httpResponse = httpclient.execute(httpPost);
            return EntityUtils.toString(httpResponse.getEntity(), UTF_8);
        } catch (Exception e) {
            logger.error("HttpClientUtils getResult error", e);
            throw new RuntimeException(e);
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                logger.error("httpclient.close() error", e);
            }
        }
    }

    protected static HttpGet httpGet(String url) {
        HttpGet httpPost = new HttpGet(url);
        httpPost.setConfig(requestConfig());
        return httpPost;
    }

    private static RequestConfig requestConfig() {
        return RequestConfig.custom().setSocketTimeout(TIMEOUT).setConnectTimeout(TIMEOUT).setConnectionRequestTimeout(TIMEOUT).build();
    }

}