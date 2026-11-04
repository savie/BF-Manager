package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CopyObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f562;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f563;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f565;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f566;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f564 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f567 = new ArrayList();

    public CopyObjectRequest(String str, String str2, String str3, String str4) {
        this.f565 = str;
        this.f563 = str2;
        this.f566 = str3;
        this.f562 = str4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m538() {
        return this.f565;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m541() {
        return this.f563;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m540() {
        return this.f566;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m543() {
        return this.f562;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m542() {
        return this.f564;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m539() {
        return this.f567;
    }
}
