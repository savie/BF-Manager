package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l.C4681;

/* JADX INFO: loaded from: classes.dex */
public class JsonUtils {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AwsJsonFactory f857 = new GsonFactory();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m805(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        StringReader stringReader = new StringReader(str);
        ((GsonFactory) f857).getClass();
        GsonFactory.GsonReader gsonReader = new GsonFactory.GsonReader(stringReader);
        try {
            if (gsonReader.m798() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            gsonReader.m797();
            while (gsonReader.m804()) {
                String strM801 = gsonReader.m801();
                if (gsonReader.m802()) {
                    gsonReader.m796();
                } else {
                    map.put(strM801, gsonReader.m800());
                }
            }
            gsonReader.m799();
            gsonReader.m803();
            return C4681.unmodifiableMap(map);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse JSON String.", e);
        }
    }
}
