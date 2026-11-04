package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public enum SignatureVersion {
    V1("1"),
    V2("2");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f151;

    SignatureVersion(String str) {
        this.f151 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f151;
    }
}
