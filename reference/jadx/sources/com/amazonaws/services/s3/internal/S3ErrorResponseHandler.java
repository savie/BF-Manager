package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.XpathUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes.dex */
public class S3ErrorResponseHandler implements HttpResponseHandler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Log f488 = LogFactory.m296(S3ErrorResponseHandler.class);

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo271() {
        return false;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ۙ */
    public final Object mo270(HttpResponse httpResponse) {
        Log log = f488;
        InputStream inputStreamM260 = httpResponse.m260();
        if (inputStreamM260 == null) {
            return m468(httpResponse.m262(), httpResponse);
        }
        try {
            String strM775 = IOUtils.m775(inputStreamM260);
            try {
                Document documentM795 = XpathUtils.m795(strM775);
                String strM794 = XpathUtils.m794("Error/Message", documentM795);
                String strM795 = XpathUtils.m794("Error/Code", documentM795);
                String strM796 = XpathUtils.m794("Error/RequestId", documentM795);
                String strM797 = XpathUtils.m794("Error/HostId", documentM795);
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strM794);
                amazonS3Exception.m137(httpResponse.m264());
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.m138(strM795);
                amazonS3Exception.m140(strM796);
                amazonS3Exception.m519(strM797);
                return amazonS3Exception;
            } catch (Exception e) {
                if (log.mo287()) {
                    log.mo286("Failed in parsing the response as XML: " + strM775, e);
                }
                return m468(strM775, httpResponse);
            }
        } catch (IOException e2) {
            if (log.mo287()) {
                log.mo286("Failed in reading the error response", e2);
            }
            return m468(httpResponse.m262(), httpResponse);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AmazonS3Exception m468(String str, HttpResponse httpResponse) {
        AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str);
        int iM264 = httpResponse.m264();
        amazonS3Exception.m138(iM264 + " " + httpResponse.m262());
        amazonS3Exception.m137(iM264);
        AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
        Map mapM263 = httpResponse.m263();
        amazonS3Exception.m140((String) mapM263.get("x-amz-request-id"));
        amazonS3Exception.m519((String) mapM263.get("x-amz-id-2"));
        HashMap map = new HashMap();
        map.put("x-amz-bucket-region", mapM263.get("x-amz-bucket-region"));
        amazonS3Exception.m517(map);
        return amazonS3Exception;
    }
}
