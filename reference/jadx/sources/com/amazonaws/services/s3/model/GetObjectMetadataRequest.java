package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectMetadataRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f581;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f582;

    public GetObjectMetadataRequest(String str, String str2) {
        this.f582 = str;
        this.f581 = str2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m560() {
        return this.f582;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m561() {
        return this.f581;
    }
}
