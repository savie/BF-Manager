package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f574;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f575;

    public DeleteObjectRequest(String str, String str2) {
        this.f575 = str;
        this.f574 = str2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m552() {
        return this.f575;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m553() {
        return this.f574;
    }
}
