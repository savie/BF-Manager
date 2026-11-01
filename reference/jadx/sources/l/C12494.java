package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBI7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12494 extends AbstractC19549 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C12494 f41786 = new C12494(0);

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return ClassTransform.SHORT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12494 m31036(int i) {
        short s = (short) i;
        if (s == i) {
            return new C12494(s);
        }
        throw new IllegalArgumentException(C8479.m22141(i, "bogus short value: "));
    }

    public final String toString() {
        int iMo21658 = mo21658();
        return "short{0x" + C22475.m49982(iMo21658) + " / " + iMo21658 + '}';
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12283;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return Integer.toString(mo21658());
    }
}
