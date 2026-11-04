package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.Unmarshaller;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class S3XmlResponseHandler extends AbstractS3ResponseHandler {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Log f496 = LogFactory.m297("com.amazonaws.request");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Map f497;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Unmarshaller f498;

    public S3XmlResponseHandler(Unmarshaller unmarshaller) {
        this.f498 = unmarshaller;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    /* JADX INFO: renamed from: ۙ */
    public AmazonWebServiceResponse mo270(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponseM451 = AbstractS3ResponseHandler.m451(httpResponse);
        this.f497 = httpResponse.m263();
        Unmarshaller unmarshaller = this.f498;
        if (unmarshaller != null) {
            Log log = f496;
            log.mo290("Beginning to parse service response XML");
            Object objMo700 = unmarshaller.mo700(httpResponse.m260());
            log.mo290("Done parsing service response XML");
            amazonWebServiceResponseM451.m159(objMo700);
        }
        return amazonWebServiceResponseM451;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map m473() {
        return this.f497;
    }
}
