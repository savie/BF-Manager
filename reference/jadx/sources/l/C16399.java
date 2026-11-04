package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAS0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16399 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5783 f53210;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f53211;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f53212;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f53213;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f53214;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17891[] f53215;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C16399[] f53216;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2799 f53217;

    public C16399() {
        this.f53211 = -1;
        this.f53210 = new C5783();
        this.f53212 = false;
    }

    public C16399(C5783 c5783) {
        this.f53211 = -1;
        new C5783();
        this.f53212 = false;
        this.f53210 = c5783;
    }

    public final int hashCode() {
        return C7103.m19444(C7103.m19447(7, this.f53210.hashCode()), 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16399) {
            return this.f53210.equals(((C16399) obj).f53210);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53211);
        sb.append(":");
        sb.append(this.f53210);
        if (this.f53212) {
            sb.append("=>");
            C17891[] c17891Arr = this.f53215;
            if (c17891Arr != null) {
                sb.append(Arrays.toString(c17891Arr));
            } else {
                sb.append(this.f53214);
            }
        }
        return sb.toString();
    }
}
