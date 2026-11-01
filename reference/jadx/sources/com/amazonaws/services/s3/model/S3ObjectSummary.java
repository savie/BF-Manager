package com.amazonaws.services.s3.model;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectSummary {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f657;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Date f658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f659;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Owner f660;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f661;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f662;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f663;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m663(String str) {
        this.f659 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m660() {
        return this.f661;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m666(String str) {
        this.f661 = str;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m668(String str) {
        this.f662 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m665() {
        return this.f663;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m661(long j) {
        this.f663 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Date m667() {
        return this.f658;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m664(Date date) {
        this.f658 = date;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m662(Owner owner) {
        this.f660 = owner;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m659(String str) {
        this.f657 = str;
    }

    public final String toString() {
        return "S3ObjectSummary{bucketName='" + this.f659 + "', key='" + this.f661 + "', eTag='" + this.f662 + "', size=" + this.f663 + ", lastModified=" + this.f658 + ", storageClass='" + this.f657 + "', owner=" + this.f660 + '}';
    }
}
