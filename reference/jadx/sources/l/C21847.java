package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V9W8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21847 implements InterfaceC7778 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C18319[] f70914;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70915;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f70916;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70917;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m48625() {
        return this.f70917;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m48626() {
        return this.f70915;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m48624() {
        return this.f70916;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18319[] m48627() {
        return this.f70914;
    }

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) {
        this.f70917 = C4850.m13545(i, bArr) / 2;
        this.f70915 = C4850.m13545(i + 2, bArr);
        this.f70916 = C4850.m13545(i + 4, bArr);
        int iMo1805 = i + 8;
        this.f70914 = new C18319[this.f70915];
        for (int i3 = 0; i3 < this.f70915; i3++) {
            C18319[] c18319Arr = this.f70914;
            C18319 c18319 = new C18319();
            c18319.f58447 = null;
            c18319.f58439 = null;
            c18319.f58449 = null;
            c18319.f58448 = new String[0];
            c18319Arr[i3] = c18319;
            iMo1805 += c18319.mo1805(iMo1805, i2, bArr);
        }
        return iMo1805 - i;
    }

    public final String toString() {
        return "pathConsumed=" + this.f70917 + ",numReferrals=" + this.f70915 + ",flags=" + this.f70916 + ",referrals=" + Arrays.toString(this.f70914);
    }
}
