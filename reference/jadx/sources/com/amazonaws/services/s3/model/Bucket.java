package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class Bucket implements Serializable {
    public static final long serialVersionUID = -8646831898339939580L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f530 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Owner f529 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Date f528 = null;

    public final String toString() {
        return "S3Bucket [name=" + this.f530 + ", creationDate=" + this.f528 + ", owner=" + this.f529 + "]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m520(Owner owner) {
        this.f529 = owner;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m522(Date date) {
        this.f528 = date;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m521(String str) {
        this.f530 = str;
    }
}
