package com.amazonaws.regions;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Region {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f396;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f398 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f395 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f397 = new HashMap();

    public Region(String str) {
        this.f396 = str;
    }

    public final int hashCode() {
        return this.f396.hashCode();
    }

    public final String toString() {
        return this.f396;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m409() {
        return this.f396;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap m410() {
        return this.f398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap m408() {
        return this.f395;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap m411() {
        return this.f397;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m412() {
        return (String) this.f398.get("s3");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Region) {
            return this.f396.equals(((Region) obj).f396);
        }
        return false;
    }
}
