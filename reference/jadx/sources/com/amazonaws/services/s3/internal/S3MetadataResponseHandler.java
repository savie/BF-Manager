package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.ObjectMetadata;

/* JADX INFO: loaded from: classes.dex */
public class S3MetadataResponseHandler extends AbstractS3ResponseHandler {
    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ۙ */
    public final Object mo270(HttpResponse httpResponse) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        AbstractS3ResponseHandler.m450(httpResponse, objectMetadata);
        AmazonWebServiceResponse amazonWebServiceResponseM451 = AbstractS3ResponseHandler.m451(httpResponse);
        amazonWebServiceResponseM451.m159(objectMetadata);
        return amazonWebServiceResponseM451;
    }
}
