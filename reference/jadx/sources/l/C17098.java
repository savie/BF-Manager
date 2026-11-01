package l;

/* JADX INFO: renamed from: l.ܿۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5AJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17098 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14277 f54555;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14277[] f54556;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54557;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15313 f54558;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f54559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14277[] f54560;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5809 f54561;

    public C17098(C5809 c5809, C0164 c0164, boolean z) {
        this.f54561 = c5809;
        C14277[] c14277Arr = new C14277[c5809.f19730];
        this.f54556 = c14277Arr;
        if (z) {
            this.f54560 = c14277Arr;
            c0164.f1251 = c14277Arr;
        } else {
            this.f54560 = c0164.f1251;
        }
        this.f54558 = c0164.f1249;
        this.f54557 = 0;
        this.f54559 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39917() {
        C5809 c5809 = this.f54561;
        int i = (c5809.f19729[this.f54557 + 3] << 24) | ((c5809.f19729[this.f54557 + 2] & 255) << 16) | ((c5809.f19729[this.f54557 + 1] & 255) << 8);
        byte[] bArr = c5809.f19729;
        int i2 = this.f54557;
        int i3 = (bArr[i2] & 255) | i;
        this.f54557 = i2 + 4;
        return i3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final short m39918() {
        C5809 c5809 = this.f54561;
        int i = (c5809.f19729[this.f54557 + 1] & 255) << 8;
        byte[] bArr = c5809.f19729;
        int i2 = this.f54557;
        short s = (short) ((bArr[i2] & 255) | i);
        this.f54557 = i2 + 2;
        return s;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m39919() {
        C5809 c5809 = this.f54561;
        long j = (((long) c5809.f19729[this.f54557 + 7]) << 56) | ((((long) c5809.f19729[this.f54557 + 6]) & 255) << 48) | ((((long) c5809.f19729[this.f54557 + 5]) & 255) << 40) | ((((long) c5809.f19729[this.f54557 + 4]) & 255) << 32) | ((((long) c5809.f19729[this.f54557 + 3]) & 255) << 24) | ((((long) c5809.f19729[this.f54557 + 2]) & 255) << 16) | ((((long) c5809.f19729[this.f54557 + 1]) & 255) << 8);
        byte[] bArr = c5809.f19729;
        int i = this.f54557;
        long j2 = j | (((long) bArr[i]) & 255);
        this.f54557 = i + 8;
        return j2;
    }
}
