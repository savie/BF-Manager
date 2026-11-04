package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩳ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBI7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18927 extends AbstractC12214 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C18927 f61399 = new C18927(0);

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return ClassTransform.SHORT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18927 m43944(int i) {
        short s = (short) i;
        if (s == i) {
            return new C18927(s);
        }
        throw new IllegalArgumentException(C13645.m33382(i, "bogus short value: "));
    }

    public final String toString() {
        int iMo17877 = mo17877();
        return "short{0x" + C5306.m15934(iMo17877) + " / " + iMo17877 + '}';
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17726;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return Integer.toString(mo17877());
    }
}
