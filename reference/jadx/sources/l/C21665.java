package l;

import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩸ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBFX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21665 extends AbstractC19549 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C21665[] f70268 = new C21665[SecP521R1Field.P16];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C21665 f70263 = m48398(-1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C21665 f70267 = m48398(0);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C21665 f70261 = m48398(1);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C21665 f70265 = m48398(2);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C21665 f70264 = m48398(3);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C21665 f70266 = m48398(4);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C21665 f70262 = m48398(5);

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return ClassTransform.INTEGER;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21665 m48398(int i) {
        C21665[] c21665Arr = f70268;
        int length = (Integer.MAX_VALUE & i) % c21665Arr.length;
        C21665 c21665 = c21665Arr[length];
        if (c21665 != null && c21665.mo21658() == i) {
            return c21665;
        }
        C21665 c21666 = new C21665(i);
        c21665Arr[length] = c21666;
        return c21666;
    }

    public final String toString() {
        int iMo21658 = mo21658();
        return "int{0x" + C22475.m49978(iMo21658) + " / " + iMo21658 + '}';
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12281;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return Integer.toString(mo21658());
    }
}
