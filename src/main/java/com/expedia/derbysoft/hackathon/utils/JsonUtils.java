package com.expedia.derbysoft.hackathon.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonUtils {

    public static String marshal(Object obj) {
        return JSON.toJSONString(obj, SerializerFeature.QuoteFieldNames);
    }

    public static <T> T unmarshal(String value, Class<T> clazz) {
        return JSONObject.parseObject(value, clazz);
    }

}
