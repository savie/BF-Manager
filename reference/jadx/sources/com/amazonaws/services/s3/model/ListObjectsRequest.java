package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public class ListObjectsRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f616;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f617;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f618;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f619;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Integer f620;

    public ListObjectsRequest(String str, String str2, String str3, String str4, Integer num) {
        this.f616 = str;
        this.f617 = str2;
        this.f618 = str3;
        this.f619 = str4;
        this.f620 = num;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m596() {
        return this.f616;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m597() {
        return this.f617;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m600() {
        return this.f618;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m598() {
        return this.f619;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Integer m599() {
        return this.f620;
    }
}
