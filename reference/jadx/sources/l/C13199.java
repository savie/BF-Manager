package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6BDA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13199 extends AbstractC19549 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13199 f43918 = new C13199(0);

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return ClassTransform.CHARACTER;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13199 m32669(int i) {
        char c = (char) i;
        if (c == i) {
            return new C13199(c);
        }
        throw new IllegalArgumentException(C8479.m22141(i, "bogus char value: "));
    }

    public final String toString() {
        int iMo21658 = mo21658();
        return "char{0x" + C22475.m49982(iMo21658) + " / " + iMo21658 + '}';
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12263;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return Integer.toString(mo21658());
    }
}
