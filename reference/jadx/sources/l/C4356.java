package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T19G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4356 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final short f15584;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f15585;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f15586;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f15587;

    public C4356(short s, int i, int i2, int i3) {
        this.f15584 = s;
        this.f15587 = i;
        this.f15585 = i2;
        this.f15586 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12198(int i) throws IOException {
        short s = this.f15584;
        if (s != i) {
            throw new IOException(String.format("Invalid chunk type: expected=0x%04x, got=0x%04x, offset=0x%04x", Integer.valueOf(i), Short.valueOf(s), Integer.valueOf(this.f15586)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4356 m12196(C23718 c23718) {
        int iM52234 = c23718.m52234();
        if (c23718.m52227() < 8) {
            return new C4356((short) -1, 0, 0, iM52234);
        }
        return new C4356(c23718.m52230(), c23718.m52224(), c23718.m52225(), iM52234);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4356 m12197(C17367 c17367) {
        int iM40445 = c17367.m40445();
        if (c17367.available() < 8) {
            return new C4356((short) -1, 0, 0, iM40445);
        }
        return new C4356(c17367.readShort(), c17367.m40462(), c17367.readInt(), iM40445);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4356 m12195(C1388 c1388) {
        int iM4862 = c1388.m4862();
        if (c1388.length() - ((long) iM4862) < 8) {
            return new C4356((short) -1, 0, 0, iM4862);
        }
        return new C4356((short) c1388.mo4872(), c1388.mo4872(), c1388.readInt(), iM4862);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12199(C17367 c17367) {
        c17367.seek(this.f15586 + this.f15585);
    }
}
