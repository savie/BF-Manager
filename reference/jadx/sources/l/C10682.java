package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9W8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10682 implements InterfaceC2149 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f33910;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f33911;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22617[] f33912;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33913;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m27234() {
        return this.f33913;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m27231() {
        return this.f33911;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m27232() {
        return this.f33910;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22617[] m27233() {
        return this.f33912;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f33913 = C0481.m2318(i, bArr) / 2;
        this.f33911 = C0481.m2318(i + 2, bArr);
        this.f33910 = C0481.m2318(i + 4, bArr);
        int iMo6138 = i + 8;
        this.f33912 = new C22617[this.f33911];
        for (int i3 = 0; i3 < this.f33911; i3++) {
            C22617[] c22617Arr = this.f33912;
            C22617 c22617 = new C22617();
            c22617.f73092 = null;
            c22617.f73091 = null;
            c22617.f73088 = null;
            c22617.f73093 = new String[0];
            c22617Arr[i3] = c22617;
            iMo6138 += c22617.mo6138(iMo6138, i2, bArr);
        }
        return iMo6138 - i;
    }

    public final String toString() {
        return "pathConsumed=" + this.f33913 + ",numReferrals=" + this.f33911 + ",flags=" + this.f33910 + ",referrals=" + Arrays.toString(this.f33912);
    }
}
