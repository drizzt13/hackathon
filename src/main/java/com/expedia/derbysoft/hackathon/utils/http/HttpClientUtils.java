package com.expedia.derbysoft.hackathon.utils.http;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zhupan on 12/8/15.
 */
public abstract class HttpClientUtils {

    private static final int TIMEOUT = 120 * 1000;

    private static final Charset UTF_8 = Consts.UTF_8;

    protected static Log logger = LogFactory.getLog(HttpClientUtils.class);

    public static String getResult(String url, Map<String, String[]> parameters) {
        return getContent(HttpClients.createDefault(), httpPost(url, parameters));
    }

    private static String getContent(CloseableHttpClient httpclient, HttpPost httpPost) {
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

    private static HttpPost httpPost(String url, Map<String, String[]> parameters) {
        return httpPost(url, createParams(parameters));
    }

    private static HttpEntity createParams(Map<String, String[]> parameterMap) {
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            parameters.add(new BasicNameValuePair(entry.getKey(), ArrayUtils.isEmpty(entry.getValue()) ? "" : entry.getValue()[0]));
        }
        return new UrlEncodedFormEntity(parameters, UTF_8);
    }


    protected static HttpPost httpPost(String url, HttpEntity httpEntity) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(httpEntity);
        httpPost.setConfig(requestConfig());
        return httpPost;
    }

    private static RequestConfig requestConfig() {
        return RequestConfig.custom().setSocketTimeout(TIMEOUT).setConnectTimeout(TIMEOUT).setConnectionRequestTimeout(TIMEOUT).build();
    }

}