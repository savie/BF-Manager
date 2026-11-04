package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class UploadPartRequest extends AmazonWebServiceRequest implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public File f662;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f663;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f664;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f665;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f666;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f667;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient InputStream f668;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f669;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f670;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m680() {
        return this.f670;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m670(int i) {
        this.f670 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m673(InputStream inputStream) {
        this.f668 = inputStream;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InputStream m675() {
        return this.f668;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m676() {
        return this.f669;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m674(String str) {
        this.f669 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m668() {
        return this.f663;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m684(String str) {
        this.f663 = str;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m681() {
        return this.f666;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m678(String str) {
        this.f666 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m679() {
        return this.f667;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m677(int i) {
        this.f667 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m685() {
        return this.f664;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m683(long j) {
        this.f664 = j;
    }

    /* JADX INFO: renamed from: ۘ᩷, reason: not valid java name and contains not printable characters */
    public final File m669() {
        return this.f662;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m672(File file) {
        this.f662 = file;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m682() {
        return this.f665;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m671(long j) {
        this.f665 = j;
    }
}
