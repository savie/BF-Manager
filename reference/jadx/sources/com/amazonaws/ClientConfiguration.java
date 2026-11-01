package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClientConfiguration {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final String f90 = VersionInfoUtils.m798();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f91 = PredefinedRetryPolicies.f451;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f92;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f93;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f98 = f90;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public RetryPolicy f96 = f91;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Protocol f97 = Protocol.HTTPS;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f95 = 15000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f94 = 15000;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Protocol m175() {
        return this.f97;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m171(Protocol protocol) {
        this.f97 = protocol;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m176() {
        return this.f98;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m167() {
        return this.f92;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m169() {
        this.f92 = "s3drive rclone s3 browser obsidian";
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final RetryPolicy m173() {
        return this.f96;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m172() {
        return this.f95;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m170() {
        return this.f94;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m168() {
        return this.f93;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m174() {
        this.f93 = "UnsignedPayloadSignerType";
    }
}
