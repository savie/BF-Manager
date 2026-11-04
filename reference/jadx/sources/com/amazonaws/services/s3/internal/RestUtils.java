package com.amazonaws.services.s3.internal;

import com.alipay.sdk.m.t.e;
import com.amazonaws.DefaultRequest;
import com.amazonaws.util.StringUtils;
import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class RestUtils {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final List f487 = Arrays.asList("acl", "torrent", "logging", "location", am.bp, "requestPayment", "versioning", "versions", "versionId", "notification", "uploadId", "uploads", "partNumber", "website", "delete", "lifecycle", "tagging", "cors", "restore", "replication", "accelerate", "inventory", "analytics", "metrics", "response-cache-control", "response-content-disposition", "response-content-encoding", "response-content-language", "response-content-type", "response-expires");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m467(String str, String str2, DefaultRequest defaultRequest, Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append(str + "\n");
        HashMap mapM182 = defaultRequest.m182();
        TreeMap treeMap = new TreeMap();
        if (mapM182 != null && mapM182.size() > 0) {
            for (Map.Entry entry : mapM182.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (str3 != null) {
                    String strM783 = StringUtils.m783(str3);
                    if (e.f.equals(strM783) || "content-md5".equals(strM783) || "date".equals(strM783) || strM783.startsWith("x-amz-")) {
                        treeMap.put(strM783, str4);
                    }
                }
            }
        }
        if (treeMap.containsKey("x-amz-date")) {
            treeMap.put("date", "");
        }
        if (!treeMap.containsKey(e.f)) {
            treeMap.put(e.f, "");
        }
        if (!treeMap.containsKey("content-md5")) {
            treeMap.put("content-md5", "");
        }
        for (Map.Entry entry2 : defaultRequest.m185().entrySet()) {
            if (((String) entry2.getKey()).startsWith("x-amz-")) {
                treeMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            String str5 = (String) entry3.getKey();
            String str6 = (String) entry3.getValue();
            if (str5.startsWith("x-amz-")) {
                sb.append(str5);
                sb.append(':');
                if (str6 != null) {
                    sb.append(str6);
                }
            } else if (str6 != null) {
                sb.append(str6);
            }
            sb.append("\n");
        }
        sb.append(str2);
        String[] strArr = (String[]) defaultRequest.m185().keySet().toArray(new String[defaultRequest.m185().size()]);
        Arrays.sort(strArr);
        char c = '?';
        for (String str7 : strArr) {
            if (f487.contains(str7) || (collection != null && collection.contains(str7))) {
                if (sb.length() == 0) {
                    sb.append(c);
                }
                sb.append(str7);
                String str8 = (String) defaultRequest.m185().get(str7);
                if (str8 != null) {
                    sb.append("=");
                    sb.append(str8);
                }
                c = '&';
            }
        }
        return sb.toString();
    }
}
