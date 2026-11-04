package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public class S3RequesterChargedHeaderHandler implements HeaderHandler {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ۙ */
    public final void mo457(Object obj, HttpResponse httpResponse) {
        ((S3RequesterChargedResult) obj).mo459(httpResponse.m263().get("x-amz-request-charged") != null);
    }
}
