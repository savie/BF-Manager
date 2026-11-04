package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtility {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Log f368 = LogFactory.m296(TransferUtility.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f366 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f367 = "";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m397() {
        synchronized (f366) {
            String str = f367;
            if (str != null && !str.trim().isEmpty()) {
                return str.trim() + "/";
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m399(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestClientOptions requestClientOptionsM155 = amazonWebServiceRequest.m155();
        StringBuilder sb = new StringBuilder("TransferService/");
        sb.append(m397());
        int i = VersionInfoUtils.f839;
        sb.append("2.81.1");
        requestClientOptionsM155.m191(sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m398(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestClientOptions requestClientOptionsM155 = amazonWebServiceRequest.m155();
        StringBuilder sb = new StringBuilder("TransferService_multipart/");
        sb.append(m397());
        int i = VersionInfoUtils.f839;
        sb.append("2.81.1");
        requestClientOptionsM155.m191(sb.toString());
    }
}
