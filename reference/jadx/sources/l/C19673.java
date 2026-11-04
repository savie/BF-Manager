package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩴ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBDG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19673 extends AbstractC12214 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C19673 f63356 = new C19673(0);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C19673 f63355 = new C19673(1);

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return ClassTransform.BOOLEAN;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19673 m45339(int i) {
        if (i == 0) {
            return f63356;
        }
        if (i == 1) {
            return f63355;
        }
        throw new IllegalArgumentException(C13645.m33382(i, "bogus value: "));
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17727;
    }

    public final String toString() {
        return mo17877() == 0 ? "boolean{false}" : "boolean{true}";
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return mo17877() == 0 ? "false" : "true";
    }
}
