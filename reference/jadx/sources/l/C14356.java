package l;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܰۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes4.dex */
public final class C14356 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f45264;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f45265;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f45266;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f45267;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f45268;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f45269;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f45271;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C5320 f45272;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f45263 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f45270 = new LinkedHashSet();

    public C14356(String str, int i, int i2, boolean z) {
        this.f45269 = str;
        this.f45268 = i;
        this.f45265 = z;
        this.f45264 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14356 m34783(int i, String str) {
        return new C14356(str, i, -1, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14356 m34782(int i, int i2, String str) {
        C14356 c14356 = new C14356(str, i, i2, false);
        c14356.f45272 = C5320.m15974(i2);
        return c14356;
    }
}
