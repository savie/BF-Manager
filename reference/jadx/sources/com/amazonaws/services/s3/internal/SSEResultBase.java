package com.amazonaws.services.s3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class SSEResultBase implements ServerSideEncryptionResult {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f499;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f500;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f501;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m474() {
        return this.f499;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo479(String str) {
        this.f499 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m477() {
        return this.f501;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo478(String str) {
        this.f501 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m475() {
        return this.f500;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo476(String str) {
        this.f500 = str;
    }
}
