package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ResponseHeaderHandlerChain extends S3XmlResponseHandler {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f486;

    public ResponseHeaderHandlerChain(Unmarshaller unmarshaller, HeaderHandler... headerHandlerArr) {
        super(unmarshaller);
        this.f486 = Arrays.asList(headerHandlerArr);
    }

    @Override // com.amazonaws.services.s3.internal.S3XmlResponseHandler, com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ۙ */
    public final AmazonWebServiceResponse mo270(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponseMo270 = super.mo270(httpResponse);
        Object objM160 = amazonWebServiceResponseMo270.m160();
        if (objM160 != null) {
            Iterator it = this.f486.iterator();
            while (it.hasNext()) {
                ((HeaderHandler) it.next()).mo457(objM160, httpResponse);
            }
        }
        return amazonWebServiceResponseMo270;
    }
}
