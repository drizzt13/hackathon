package com.expedia.derbysoft.hackathon.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.Map;

public class JsonUtils {

    public static String marshal(Object obj) {
        return JSON.toJSONString(obj, SerializerFeature.QuoteFieldNames);
    }

    public static Object unmarshal(String value) {
       return JSON.parse(value);
    }

    private static String getValue(Map<String, String[]> parameterMap, String key) {
        String[] values = parameterMap.get("dates");
        if (values == null) {
            return null;
        }
        return values[0];
    }
}
