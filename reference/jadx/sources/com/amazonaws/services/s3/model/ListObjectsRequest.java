package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public class ListObjectsRequest extends AmazonWebServiceRequest {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f606;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f607;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f608;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f609;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Integer f610;

    public ListObjectsRequest(String str, String str2, String str3, String str4, Integer num) {
        this.f609 = str;
        this.f608 = str2;
        this.f607 = str3;
        this.f606 = str4;
        this.f610 = num;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m592() {
        return this.f609;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m590() {
        return this.f608;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m593() {
        return this.f607;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m594() {
        return this.f606;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Integer m591() {
        return this.f610;
    }
}
