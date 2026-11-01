package l;

/* JADX INFO: renamed from: l.ۢᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9755 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14694[] f32808;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final double[] f32809;

    public C9755(int i) {
        this.f32809 = new double[i * 64];
        this.f32808 = new C14694[i];
        int i2 = 0;
        while (true) {
            C14694[] c14694Arr = this.f32808;
            if (i2 >= c14694Arr.length) {
                return;
            }
            c14694Arr[i2] = new C14694();
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24747(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C14694[] c14694Arr = this.f32808;
                if (i3 < c14694Arr.length) {
                    c14694Arr[i3].f48013[i2] = this.f32809[i];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m24748(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C14694[] c14694Arr = this.f32808;
                if (i3 < c14694Arr.length) {
                    this.f32809[i] = c14694Arr[i3].f48013[i2];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }
}
