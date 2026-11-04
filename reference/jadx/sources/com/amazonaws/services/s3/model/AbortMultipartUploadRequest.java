package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class AbortMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f510;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f511;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f512;

    public AbortMultipartUploadRequest(String str, String str2, String str3) {
        this.f512 = str;
        this.f510 = str2;
        this.f511 = str3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m488() {
        return this.f512;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m490() {
        return this.f510;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m489() {
        return this.f511;
    }
}
