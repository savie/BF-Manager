package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۚܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBB6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5437 extends AbstractC19549 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C5437 f18751 = new C5437(0);

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return ClassTransform.BYTE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5437 m15038(int i) {
        byte b = (byte) i;
        if (b == i) {
            return new C5437(b);
        }
        throw new IllegalArgumentException(C8479.m22141(i, "bogus byte value: "));
    }

    public final String toString() {
        int iMo21658 = mo21658();
        return "byte{0x" + C22475.m49983(iMo21658) + " / " + iMo21658 + '}';
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12258;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return Integer.toString(mo21658());
    }
}
