package l;

/* JADX INFO: renamed from: l.ۢ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 66T2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9762 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31479;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31480;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31481;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25436(char[] cArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (this.f31479 * 31) + cArr[i2];
            this.f31479 = i3;
            int i4 = this.f31480 + 1;
            this.f31480 = i4;
            if (i4 == 14740) {
                this.f31481 = (this.f31481 * 31) + i3;
                this.f31480 = 0;
                this.f31479 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25435(int i) {
        return (i * 31) + (this.f31480 == 0 ? this.f31481 : (this.f31481 * 31) + this.f31479);
    }
}
