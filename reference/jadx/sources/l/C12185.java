package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12185 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f40779;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f40780;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] f40781;

    public C12185(String str, char[] cArr, String str2) {
        this.f40780 = str;
        this.f40781 = Arrays.copyOf(cArr, cArr.length);
        this.f40779 = str2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m30291() {
        return this.f40780;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final char[] m30292() {
        return this.f40781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30289() {
        return this.f40779;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m30288() {
        return this.f40780.isEmpty() && this.f40781.length == 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m30290() {
        return this.f40780.equals("Guest") && this.f40781.length == 0;
    }

    public final String toString() {
        return "AuthenticationContext[" + this.f40780 + '@' + this.f40779 + ']';
    }
}
