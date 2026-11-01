package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.util.DateUtils;
import l.C20630;

/* JADX INFO: loaded from: classes.dex */
public class ServiceUtils {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f512 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Log f513 = LogFactory.m302(ServiceUtils.class);

    static {
        new DateUtils();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m486(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("\"")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith("\"") ? C20630.m46498(1, 0, strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m487(AmazonWebServiceRequest amazonWebServiceRequest) {
        if (System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }
        if (amazonWebServiceRequest instanceof GetObjectRequest) {
            return ((GetObjectRequest) amazonWebServiceRequest).m569() != null;
        }
        if (!(amazonWebServiceRequest instanceof PutObjectRequest)) {
            return false;
        }
        PutObjectRequest putObjectRequest = (PutObjectRequest) amazonWebServiceRequest;
        ObjectMetadata objectMetadataM499 = putObjectRequest.m499();
        if (objectMetadataM499 != null && objectMetadataM499.m632() != null) {
            return true;
        }
        if (putObjectRequest.m519() == null) {
            return false;
        }
        putObjectRequest.m519().getClass();
        return (SSEAlgorithm.KMS.getAlgorithm() == null && putObjectRequest.m519().m671() == null) ? false : true;
    }
}
