package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7K1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14468 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f47439 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f47440 = -1;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo16283();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo16284(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo16285(int i, float f, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34870(float f, int i) {
        float f2 = i + f;
        float fMo16283 = mo16283() - 1;
        if (f2 == fMo16283) {
            f2 = fMo16283 - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > fMo16283 || i2 < 0) {
            return;
        }
        mo16285(i2, f2 % 1, i3);
        int i4 = this.f47439;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator it = (i2 <= Integer.MIN_VALUE ? C16287.f52462 : new C16287(i4, i2 - 1, 1)).iterator();
                while (((C0058) it).hasNext()) {
                    mo16284(((C0058) it).nextInt());
                }
            }
            int i5 = this.f47440;
            if (i3 < i5) {
                mo16284(i5);
                Iterator it2 = new C16287(i2 + 2, this.f47440, 1).iterator();
                while (((C0058) it2).hasNext()) {
                    mo16284(((C0058) it2).nextInt());
                }
            }
        }
        this.f47439 = i2;
        this.f47440 = i3;
    }
}
