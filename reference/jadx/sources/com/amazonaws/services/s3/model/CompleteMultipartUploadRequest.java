package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f558;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f559;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f560;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f561;

    public CompleteMultipartUploadRequest(String str, String str2, String str3, ArrayList arrayList) {
        new ArrayList();
        this.f560 = str;
        this.f558 = str2;
        this.f561 = str3;
        this.f559 = arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m535() {
        return this.f560;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m537() {
        return this.f558;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m534() {
        return this.f561;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m536() {
        return this.f559;
    }
}
