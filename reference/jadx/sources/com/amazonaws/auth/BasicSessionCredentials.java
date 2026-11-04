package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f134;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f135;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f136;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f134 = str;
        this.f136 = str2;
        this.f135 = str3;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ۙ */
    public final String mo200() {
        return this.f134;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    /* JADX INFO: renamed from: ۤ */
    public final String mo201() {
        return this.f136;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    /* JADX INFO: renamed from: ᩷ */
    public final String mo203() {
        return this.f135;
    }
}
