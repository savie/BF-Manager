package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6BDA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1774 extends AbstractC12214 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C1774 f6080 = new C1774(0);

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return ClassTransform.CHARACTER;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1774 m6229(int i) {
        char c = (char) i;
        if (c == i) {
            return new C1774(c);
        }
        throw new IllegalArgumentException(C13645.m33382(i, "bogus char value: "));
    }

    public final String toString() {
        int iMo17877 = mo17877();
        return "char{0x" + C5306.m15934(iMo17877) + " / " + iMo17877 + '}';
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17734;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return Integer.toString(mo17877());
    }
}
