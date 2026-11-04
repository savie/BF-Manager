package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18577 implements Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f60354;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60355;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60356;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f60357;

    public C18577(int i, int i2, int i3, String str) {
        this.f60356 = i;
        this.f60354 = i2;
        this.f60355 = i3;
        this.f60357 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m43157() {
        return this.f60356;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char m43156() {
        return C6790.m18964(this.f60356);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m43155() {
        return this.f60356 & 4095;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m43154() {
        return this.f60354;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43152() {
        return this.f60355;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m43153() {
        return this.f60357;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtExtras{mode=");
        sb.append(this.f60356);
        sb.append(", uid=");
        sb.append(this.f60354);
        sb.append(", gid=");
        sb.append(this.f60355);
        sb.append(", link='");
        return C8947.m23910(sb, this.f60357, "'}");
    }
}
