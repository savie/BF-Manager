package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۘ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABB0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4011 extends AbstractC6249 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C4011 f13701 = new C4011(0);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4011 f13700 = new C4011(1);

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return ClassTransform.LONG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4011 m12971(long j) {
        return new C4011(j);
    }

    public final String toString() {
        long jMo17876 = mo17876();
        return "long{0x" + C5306.m15937(jMo17876) + " / " + jMo17876 + '}';
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17732;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return Long.toString(mo17876());
    }
}
