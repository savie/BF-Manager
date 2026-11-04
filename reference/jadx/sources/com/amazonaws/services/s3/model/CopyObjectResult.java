package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class CopyObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult, Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f568;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Date f569;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Date f570;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f571;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f572;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f573;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m551() {
        return this.f568;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m548(String str) {
        this.f568 = str;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Date m546() {
        return this.f569;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m550(Date date) {
        this.f569 = date;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m545() {
        return this.f571;
    }

    @Override // com.amazonaws.services.s3.internal.S3VersionResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo472(String str) {
        this.f571 = str;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Date m549() {
        return this.f570;
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo462(Date date) {
        this.f570 = date;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m547() {
        return this.f573;
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ۤ */
    public final void mo463(String str) {
        this.f573 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m544() {
        return this.f572;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ۙ */
    public final void mo459(boolean z) {
        this.f572 = z;
    }
}
