package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f568;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f569;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f570;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f571;

    public CompleteMultipartUploadRequest(String str, String str2, String str3, ArrayList arrayList) {
        new ArrayList();
        this.f568 = str;
        this.f570 = str2;
        this.f571 = str3;
        this.f569 = arrayList;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m540() {
        return this.f568;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m541() {
        return this.f570;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m542() {
        return this.f571;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m543() {
        return this.f569;
    }
}
