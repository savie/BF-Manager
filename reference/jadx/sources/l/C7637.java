package l;

/* JADX INFO: renamed from: l.۟ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7637 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f25208;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f25209 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f25210;

    public C7637(int i) {
        this.f25210 = new int[i];
        this.f25208 = new int[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20184(int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.f25209;
            int[] iArr = this.f25208;
            int[] iArr2 = this.f25210;
            if (i2 < i3) {
                if (iArr2[i2] == i) {
                    iArr[i2] = iArr[i2] + 1;
                    return;
                }
                i2++;
            } else {
                iArr2[i3] = i;
                iArr[i3] = 1;
                this.f25209 = i3 + 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20183() {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f25209;
            int[] iArr = this.f25208;
            if (i3 < i5) {
                int i6 = iArr[i3];
                if (i4 < i6) {
                    i2 = this.f25210[i3];
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m20185() {
        return this.f25209;
    }
}
