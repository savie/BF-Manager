package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class UploadPartRequest extends AmazonWebServiceRequest implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f672;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f673;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient InputStream f674;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f675;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f676;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f677;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public File f678;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f679;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f680;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m690() {
        return this.f679;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m676(int i) {
        this.f679 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m679(InputStream inputStream) {
        this.f674 = inputStream;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InputStream m685() {
        return this.f674;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m674() {
        return this.f672;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m680(String str) {
        this.f672 = str;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m675() {
        return this.f675;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m687(String str) {
        this.f675 = str;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m688() {
        return this.f673;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m684(String str) {
        this.f673 = str;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m682() {
        return this.f680;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m683(int i) {
        this.f680 = i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long m691() {
        return this.f677;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m686(long j) {
        this.f677 = j;
    }

    /* JADX INFO: renamed from: ᩷ܰ, reason: not valid java name and contains not printable characters */
    public final File m689() {
        return this.f678;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m678(File file) {
        this.f678 = file;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m681() {
        return this.f676;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m677(long j) {
        this.f676 = j;
    }
}
