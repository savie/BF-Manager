package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public enum Permission {
    FullControl("FULL_CONTROL", "x-amz-grant-full-control"),
    Read("READ", "x-amz-grant-read"),
    Write("WRITE", "x-amz-grant-write"),
    ReadAcp("READ_ACP", "x-amz-grant-read-acp"),
    WriteAcp("WRITE_ACP", "x-amz-grant-write-acp");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f638;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f639;

    Permission(String str, String str2) {
        this.f639 = str;
        this.f638 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m641() {
        return this.f638;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f639;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Permission m640(String str) {
        for (Permission permission : values()) {
            if (permission.f639.equals(str)) {
                return permission;
            }
        }
        return null;
    }
}
