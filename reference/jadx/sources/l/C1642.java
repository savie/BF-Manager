package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.֫ۗܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9CL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1642 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f5675;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f5676;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char[] f5677;

    public C1642(String str, char[] cArr, String str2) {
        this.f5676 = str;
        this.f5677 = Arrays.copyOf(cArr, cArr.length);
        this.f5675 = str2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m5811() {
        return this.f5676;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char[] m5813() {
        return this.f5677;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m5810() {
        return this.f5675;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m5814() {
        return this.f5676.isEmpty() && this.f5677.length == 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m5812() {
        return this.f5676.equals("Guest") && this.f5677.length == 0;
    }

    public final String toString() {
        return "AuthenticationContext[" + this.f5676 + '@' + this.f5675 + ']';
    }
}
