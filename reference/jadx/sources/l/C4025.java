package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۘܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB9W */
/* JADX INFO: loaded from: classes3.dex */
public final class C4025 extends AbstractC8966 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C4025 f14888 = new C4025(Double.doubleToLongBits(0.0d));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C4025 f14887 = new C4025(Double.doubleToLongBits(1.0d));

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return ClassTransform.DOUBLE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4025 m11530(long j) {
        return new C4025(j);
    }

    public final String toString() {
        long jMo21659 = mo21659();
        return "double{0x" + C22475.m49980(jMo21659) + " / " + Double.longBitsToDouble(jMo21659) + '}';
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12291;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return Double.toString(Double.longBitsToDouble(mo21659()));
    }
}
