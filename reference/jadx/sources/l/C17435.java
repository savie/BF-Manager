package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܽ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBBH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17435 extends AbstractC12214 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C17435 f56701 = new C17435(Float.floatToIntBits(0.0f));

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C17435 f56700 = new C17435(Float.floatToIntBits(1.0f));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C17435 f56699 = new C17435(Float.floatToIntBits(2.0f));

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return ClassTransform.FLOAT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17435 m40933(int i) {
        return new C17435(i);
    }

    public final String toString() {
        int iMo17877 = mo17877();
        return "float{0x" + C5306.m15938(iMo17877) + " / " + Float.intBitsToFloat(iMo17877) + '}';
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17729;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return Float.toString(Float.intBitsToFloat(mo17877()));
    }
}
