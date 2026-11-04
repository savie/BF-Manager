package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;

/* JADX INFO: loaded from: classes.dex */
public class ServerSideEncryptionHeaderHandler implements HeaderHandler {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* JADX INFO: renamed from: ۙ */
    public final void mo457(Object obj, HttpResponse httpResponse) {
        ServerSideEncryptionResult serverSideEncryptionResult = (ServerSideEncryptionResult) obj;
        serverSideEncryptionResult.mo479((String) httpResponse.m263().get("x-amz-server-side-encryption"));
        serverSideEncryptionResult.mo478((String) httpResponse.m263().get("x-amz-server-side-encryption-customer-algorithm"));
        serverSideEncryptionResult.mo476((String) httpResponse.m263().get("x-amz-server-side-encryption-customer-key-MD5"));
    }
}
