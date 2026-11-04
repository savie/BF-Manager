package l;

/* JADX INFO: renamed from: l.ۨ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12033 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38768;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f38769;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14270 f38770;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6068 f38771;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19929 f38772;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14270[] f38773;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14270[] f38774;

    public C12033(C6068 c6068, C23222 c23222, boolean z) {
        this.f38771 = c6068;
        C14270[] c14270Arr = new C14270[c6068.f20716];
        this.f38774 = c14270Arr;
        if (z) {
            this.f38773 = c14270Arr;
            c23222.f75228 = c14270Arr;
        } else {
            this.f38773 = c23222.f75228;
        }
        this.f38772 = c23222.f75230;
        this.f38768 = 0;
        this.f38769 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30221() {
        C6068 c6068 = this.f38771;
        int i = (c6068.f20713[this.f38768 + 3] << 24) | ((c6068.f20713[this.f38768 + 2] & 255) << 16) | ((c6068.f20713[this.f38768 + 1] & 255) << 8);
        byte[] bArr = c6068.f20713;
        int i2 = this.f38768;
        int i3 = (bArr[i2] & 255) | i;
        this.f38768 = i2 + 4;
        return i3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final short m30222() {
        C6068 c6068 = this.f38771;
        int i = (c6068.f20713[this.f38768 + 1] & 255) << 8;
        byte[] bArr = c6068.f20713;
        int i2 = this.f38768;
        short s = (short) ((bArr[i2] & 255) | i);
        this.f38768 = i2 + 2;
        return s;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m30223() {
        C6068 c6068 = this.f38771;
        long j = (((long) c6068.f20713[this.f38768 + 7]) << 56) | ((((long) c6068.f20713[this.f38768 + 6]) & 255) << 48) | ((((long) c6068.f20713[this.f38768 + 5]) & 255) << 40) | ((((long) c6068.f20713[this.f38768 + 4]) & 255) << 32) | ((((long) c6068.f20713[this.f38768 + 3]) & 255) << 24) | ((((long) c6068.f20713[this.f38768 + 2]) & 255) << 16) | ((((long) c6068.f20713[this.f38768 + 1]) & 255) << 8);
        byte[] bArr = c6068.f20713;
        int i = this.f38768;
        long j2 = j | (((long) bArr[i]) & 255);
        this.f38768 = i + 8;
        return j2;
    }
}
