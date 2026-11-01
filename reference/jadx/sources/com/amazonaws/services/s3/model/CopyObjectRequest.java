package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class CopyObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f572;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f573;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f576;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f575 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f577 = new ArrayList();

    public CopyObjectRequest(String str, String str2, String str3, String str4) {
        this.f573 = str;
        this.f574 = str2;
        this.f572 = str3;
        this.f576 = str4;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m545() {
        return this.f573;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m547() {
        return this.f574;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m544() {
        return this.f572;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m546() {
        return this.f576;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList m549() {
        return this.f575;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList m548() {
        return this.f577;
    }
}
