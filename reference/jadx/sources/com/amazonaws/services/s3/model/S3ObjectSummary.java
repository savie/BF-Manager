package com.amazonaws.services.s3.model;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class S3ObjectSummary {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f647;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f648;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f649;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f650;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Owner f651;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f652;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Date f653;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m656(String str) {
        this.f647 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m653() {
        return this.f648;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m659(String str) {
        this.f648 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m661(String str) {
        this.f652 = str;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m658() {
        return this.f650;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m654(long j) {
        this.f650 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Date m660() {
        return this.f653;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m657(Date date) {
        this.f653 = date;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m655(Owner owner) {
        this.f651 = owner;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m662(String str) {
        this.f649 = str;
    }

    public final String toString() {
        return "S3ObjectSummary{bucketName='" + this.f647 + "', key='" + this.f648 + "', eTag='" + this.f652 + "', size=" + this.f650 + ", lastModified=" + this.f653 + ", storageClass='" + this.f649 + "', owner=" + this.f651 + '}';
    }
}
