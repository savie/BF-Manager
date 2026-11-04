package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClientConfiguration {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String f80 = VersionInfoUtils.m792();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f81 = PredefinedRetryPolicies.f440;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f84;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f88;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f85 = f80;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public RetryPolicy f83 = f81;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Protocol f87 = Protocol.HTTPS;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f86 = 15000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f82 = 15000;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Protocol m169() {
        return this.f87;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m163(Protocol protocol) {
        this.f87 = protocol;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m167() {
        return this.f85;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m166() {
        return this.f84;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m161() {
        this.f84 = "s3drive rclone s3 browser obsidian";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final RetryPolicy m165() {
        return this.f83;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m168() {
        return this.f86;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m162() {
        return this.f82;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m170() {
        return this.f88;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m164() {
        this.f88 = "UnsignedPayloadSignerType";
    }
}
