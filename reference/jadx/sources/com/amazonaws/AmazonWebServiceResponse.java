package com.amazonaws;

import com.amazonaws.services.s3.S3ResponseMetadata;

/* JADX INFO: loaded from: classes.dex */
public class AmazonWebServiceResponse {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public S3ResponseMetadata f78;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f79;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m160() {
        return this.f79;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m159(Object obj) {
        this.f79 = obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m158(S3ResponseMetadata s3ResponseMetadata) {
        this.f78 = s3ResponseMetadata;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m157() {
        S3ResponseMetadata s3ResponseMetadata = this.f78;
        if (s3ResponseMetadata == null) {
            return null;
        }
        return (String) s3ResponseMetadata.f107.get("AWS_REQUEST_ID");
    }
}
