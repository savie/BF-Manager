package l;

/* JADX INFO: renamed from: l.ܰۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f45665;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f45666 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f45667;

    public C14516(int i) {
        this.f45667 = new int[i];
        this.f45665 = new int[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35034(int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.f45666;
            int[] iArr = this.f45665;
            int[] iArr2 = this.f45667;
            if (i2 < i3) {
                if (iArr2[i2] == i) {
                    iArr[i2] = iArr[i2] + 1;
                    return;
                }
                i2++;
            } else {
                iArr2[i3] = i;
                iArr[i3] = 1;
                this.f45666 = i3 + 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m35033() {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f45666;
            int[] iArr = this.f45665;
            if (i3 < i5) {
                int i6 = iArr[i3];
                if (i4 < i6) {
                    i2 = this.f45667[i3];
                    i = i3;
                    i4 = i6;
                }
                i3++;
            } else {
                iArr[i] = 0;
                return i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m35035() {
        return this.f45666;
    }
}
