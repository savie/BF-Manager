package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.DateUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractS3ResponseHandler implements HttpResponseHandler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashSet f462;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Log f463 = LogFactory.m296(S3MetadataResponseHandler.class);

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ۙ */
    public boolean mo271() {
        return this instanceof S3ObjectResponseHandler;
    }

    static {
        HashSet hashSet = new HashSet();
        f462 = hashSet;
        hashSet.add("Date");
        hashSet.add("Server");
        hashSet.add("x-amz-request-id");
        hashSet.add("x-amz-id-2");
        hashSet.add("X-Amz-Cf-Id");
        hashSet.add("Connection");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AmazonWebServiceResponse m451(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
        String str = (String) httpResponse.m263().get("x-amz-request-id");
        String str2 = (String) httpResponse.m263().get("x-amz-id-2");
        String str3 = (String) httpResponse.m263().get("X-Amz-Cf-Id");
        HashMap map = new HashMap();
        map.put("AWS_REQUEST_ID", str);
        map.put("HOST_ID", str2);
        map.put("CLOUD_FRONT_ID", str3);
        amazonWebServiceResponse.m158(new S3ResponseMetadata(map));
        return amazonWebServiceResponse;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m450(HttpResponse httpResponse, ObjectMetadata objectMetadata) {
        for (Map.Entry entry : httpResponse.m263().entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("x-amz-meta-")) {
                objectMetadata.m615(str.substring(11), (String) entry.getValue());
            } else {
                boolean zContains = f462.contains(str);
                Log log = f463;
                if (zContains) {
                    log.mo291(str.concat(" is ignored."));
                } else if (str.equalsIgnoreCase("Last-Modified")) {
                    try {
                        String str2 = (String) entry.getValue();
                        int i = ServiceUtils.f502;
                        objectMetadata.m613(DateUtils.m763("EEE, dd MMM yyyy HH:mm:ss z", str2), str);
                    } catch (Exception e) {
                        log.mo289("Unable to parse last modified date: " + ((String) entry.getValue()), e);
                    }
                } else if (str.equalsIgnoreCase("Content-Length")) {
                    try {
                        objectMetadata.m613(Long.valueOf(Long.parseLong((String) entry.getValue())), str);
                    } catch (NumberFormatException e2) {
                        log.mo289("Unable to parse content length: " + ((String) entry.getValue()), e2);
                    }
                } else if (str.equalsIgnoreCase("ETag")) {
                    objectMetadata.m613((Object) ServiceUtils.m480((String) entry.getValue()), str);
                } else if (str.equalsIgnoreCase("Expires")) {
                    try {
                        objectMetadata.m620(DateUtils.m763("EEE, dd MMM yyyy HH:mm:ss z", (String) entry.getValue()));
                    } catch (Exception e3) {
                        log.mo289("Unable to parse http expiration date: " + ((String) entry.getValue()), e3);
                    }
                } else if (str.equalsIgnoreCase("x-amz-expiration")) {
                    new ObjectExpirationHeaderHandler();
                    ObjectExpirationHeaderHandler.m461((ObjectExpirationResult) objectMetadata, httpResponse);
                } else if (str.equalsIgnoreCase("x-amz-restore")) {
                    new ObjectRestoreHeaderHandler();
                    ObjectRestoreHeaderHandler.m464((ObjectRestoreResult) objectMetadata, httpResponse);
                } else if (str.equalsIgnoreCase("x-amz-request-charged")) {
                    new S3RequesterChargedHeaderHandler();
                    objectMetadata.mo459(httpResponse.m263().get("x-amz-request-charged") != null);
                } else if (str.equalsIgnoreCase("x-amz-mp-parts-count")) {
                    try {
                        objectMetadata.m613(Integer.valueOf(Integer.parseInt((String) entry.getValue())), str);
                    } catch (NumberFormatException e4) {
                        throw new AmazonClientException("Unable to parse part count. Header x-amz-mp-parts-count has corrupted data" + e4.getMessage(), e4);
                    }
                } else {
                    objectMetadata.m613(entry.getValue(), str);
                }
            }
        }
    }
}
