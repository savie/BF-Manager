package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7K1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11641 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36505 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f36506 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo29247();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo29249(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo29250(int i, float f, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29248(float f, int i) {
        float f2 = i + f;
        float fMo29247 = mo29247() - 1;
        if (f2 == fMo29247) {
            f2 = fMo29247 - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > fMo29247 || i2 < 0) {
            return;
        }
        mo29250(i2, f2 % 1, i3);
        int i4 = this.f36505;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator it = (i2 <= Integer.MIN_VALUE ? C1074.f3854 : new C1074(i4, i2 - 1, 1)).iterator();
                while (((C10022) it).hasNext()) {
                    mo29249(((C10022) it).nextInt());
                }
            }
            int i5 = this.f36506;
            if (i3 < i5) {
                mo29249(i5);
                Iterator it2 = new C1074(i2 + 2, this.f36506, 1).iterator();
                while (((C10022) it2).hasNext()) {
                    mo29249(((C10022) it2).nextInt());
                }
            }
        }
        this.f36505 = i2;
        this.f36506 = i3;
    }
}
