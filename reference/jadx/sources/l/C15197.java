package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܳ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBB6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15197 extends AbstractC12214 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C15197 f49609 = new C15197(0);

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return ClassTransform.BYTE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15197 m36548(int i) {
        byte b = (byte) i;
        if (b == i) {
            return new C15197(b);
        }
        throw new IllegalArgumentException(C13645.m33382(i, "bogus byte value: "));
    }

    public final String toString() {
        int iMo17877 = mo17877();
        return "byte{0x" + C5306.m15936(iMo17877) + " / " + iMo17877 + '}';
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17740;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return Integer.toString(mo17877());
    }
}
