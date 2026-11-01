package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABB0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7554 extends AbstractC8966 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C7554 f25057 = new C7554(0);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C7554 f25056 = new C7554(1);

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return ClassTransform.LONG;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7554 m20068(long j) {
        return new C7554(j);
    }

    public final String toString() {
        long jMo21659 = mo21659();
        return "long{0x" + C22475.m49980(jMo21659) + " / " + jMo21659 + '}';
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12268;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return Long.toString(mo21659());
    }
}
