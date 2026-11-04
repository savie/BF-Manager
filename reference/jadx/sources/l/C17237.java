package l;

/* JADX INFO: renamed from: l.ܽ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17237 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24697[] f56165;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final double[] f56166;

    public C17237(int i) {
        this.f56166 = new double[i * 64];
        this.f56165 = new C24697[i];
        int i2 = 0;
        while (true) {
            C24697[] c24697Arr = this.f56165;
            if (i2 >= c24697Arr.length) {
                return;
            }
            c24697Arr[i2] = new C24697();
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40490(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C24697[] c24697Arr = this.f56165;
                if (i3 < c24697Arr.length) {
                    c24697Arr[i3].f79909[i2] = this.f56166[i];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m40491(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C24697[] c24697Arr = this.f56165;
                if (i3 < c24697Arr.length) {
                    this.f56166[i] = c24697Arr[i3].f79909[i2];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }
}
