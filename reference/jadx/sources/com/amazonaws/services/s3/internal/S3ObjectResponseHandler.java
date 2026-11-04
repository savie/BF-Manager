package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ۙ */
    public final Object mo270(HttpResponse httpResponse) {
        S3Object s3Object = new S3Object();
        AmazonWebServiceResponse amazonWebServiceResponseM451 = AbstractS3ResponseHandler.m451(httpResponse);
        if (httpResponse.m263().get("x-amz-website-redirect-location") != null) {
        }
        httpResponse.m263().get("x-amz-request-charged");
        if (httpResponse.m263().get("x-amz-tagging-count") != null) {
            Integer.parseInt((String) httpResponse.m263().get("x-amz-tagging-count"));
        }
        AbstractS3ResponseHandler.m450(httpResponse, s3Object.m647());
        s3Object.m645(new S3ObjectInputStream(httpResponse.m260()));
        amazonWebServiceResponseM451.m159(s3Object);
        return amazonWebServiceResponseM451;
    }
}
