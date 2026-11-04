package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۧ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB9W */
/* JADX INFO: loaded from: classes4.dex */
public final class C11468 extends AbstractC6249 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C11468 f36058 = new C11468(Double.doubleToLongBits(0.0d));

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C11468 f36057 = new C11468(Double.doubleToLongBits(1.0d));

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return ClassTransform.DOUBLE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11468 m28823(long j) {
        return new C11468(j);
    }

    public final String toString() {
        long jMo17876 = mo17876();
        return "double{0x" + C5306.m15937(jMo17876) + " / " + Double.longBitsToDouble(jMo17876) + '}';
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17751;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return Double.toString(Double.longBitsToDouble(mo17876()));
    }
}
