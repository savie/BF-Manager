package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۖܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBDG */
/* JADX INFO: loaded from: classes3.dex */
public final class C2614 extends AbstractC19549 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C2614 f10224 = new C2614(0);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C2614 f10223 = new C2614(1);

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return ClassTransform.BOOLEAN;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2614 m8088(int i) {
        if (i == 0) {
            return f10224;
        }
        if (i == 1) {
            return f10223;
        }
        throw new IllegalArgumentException(C8479.m22141(i, "bogus value: "));
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12273;
    }

    public final String toString() {
        return mo21658() == 0 ? "boolean{false}" : "boolean{true}";
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return mo21658() == 0 ? "false" : "true";
    }
}
