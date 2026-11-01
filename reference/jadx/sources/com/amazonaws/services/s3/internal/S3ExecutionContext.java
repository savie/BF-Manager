package com.amazonaws.services.s3.internal;

import com.amazonaws.auth.Signer;
import com.amazonaws.http.ExecutionContext;

/* JADX INFO: loaded from: classes.dex */
public class S3ExecutionContext extends ExecutionContext {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Signer f499;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m476(Signer signer) {
        this.f499 = signer;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Signer m475() {
        return this.f499;
    }
}
