package com.amazonaws.services.s3.internal;

import com.amazonaws.auth.Signer;
import com.amazonaws.http.ExecutionContext;

/* JADX INFO: loaded from: classes.dex */
public class S3ExecutionContext extends ExecutionContext {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Signer f489;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m469(Signer signer) {
        this.f489 = signer;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Signer m470() {
        return this.f489;
    }
}
