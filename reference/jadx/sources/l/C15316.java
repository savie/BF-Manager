package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܶܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBBH */
/* JADX INFO: loaded from: classes5.dex */
public final class C15316 extends AbstractC19549 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C15316 f49899 = new C15316(Float.floatToIntBits(0.0f));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C15316 f49897 = new C15316(Float.floatToIntBits(1.0f));

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C15316 f49898 = new C15316(Float.floatToIntBits(2.0f));

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return ClassTransform.FLOAT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15316 m36677(int i) {
        return new C15316(i);
    }

    public final String toString() {
        int iMo21658 = mo21658();
        return "float{0x" + C22475.m49978(iMo21658) + " / " + Float.intBitsToFloat(iMo21658) + '}';
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12262;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return Float.toString(Float.intBitsToFloat(mo21658()));
    }
}
