package l;

import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܶ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBFX */
/* JADX INFO: loaded from: classes5.dex */
public final class C15943 extends AbstractC12214 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C15943[] f51769 = new C15943[SecP521R1Field.P16];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C15943 f51767 = m37967(-1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C15943 f51773 = m37967(0);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C15943 f51771 = m37967(1);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C15943 f51766 = m37967(2);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C15943 f51768 = m37967(3);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C15943 f51772 = m37967(4);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C15943 f51770 = m37967(5);

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return ClassTransform.INTEGER;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15943 m37967(int i) {
        C15943[] c15943Arr = f51769;
        int length = (Integer.MAX_VALUE & i) % c15943Arr.length;
        C15943 c15943 = c15943Arr[length];
        if (c15943 != null && c15943.mo17877() == i) {
            return c15943;
        }
        C15943 c15944 = new C15943(i);
        c15943Arr[length] = c15944;
        return c15944;
    }

    public final String toString() {
        int iMo17877 = mo17877();
        return "int{0x" + C5306.m15938(iMo17877) + " / " + iMo17877 + '}';
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17753;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return Integer.toString(mo17877());
    }
}
