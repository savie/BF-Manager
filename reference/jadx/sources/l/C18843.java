package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BH4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18843 extends AbstractC9901 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6143 f61042;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1909 f61043;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f61044;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0498 f61045;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f61046 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22371 f61047;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return "InvokeDynamic";
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18843 m43476(int i, C0498 c0498) {
        return new C18843(i, c0498);
    }

    public C18843(int i, C0498 c0498) {
        this.f61044 = i;
        this.f61045 = c0498;
        this.f61043 = C1909.m6215(c0498.m2380().mo2376());
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1203 m43483() {
        ArrayList arrayList = this.f61046;
        C1203 c1203 = new C1203(this, arrayList.size());
        arrayList.add(c1203);
        return c1203;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList m43480() {
        return this.f61046;
    }

    public final String toString() {
        return mo2376();
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        C6143 c6143 = this.f61042;
        StringBuilder sbM30914 = C12441.m30914("InvokeDynamic(", c6143 != null ? c6143.mo2376() : "Unknown", ":");
        sbM30914.append(this.f61044);
        sbM30914.append(", ");
        sbM30914.append(this.f61045.mo2376());
        sbM30914.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sbM30914.toString();
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        C18843 c18843 = (C18843) abstractC9901;
        int iCompare = Integer.compare(this.f61044, c18843.f61044);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f61045.compareTo(c18843.f61045);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f61042.compareTo((AbstractC9901) c18843.f61042);
        return iCompareTo2 != 0 ? iCompareTo2 : this.f61047.compareTo(c18843.f61047);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m43484() {
        return this.f61044;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0498 m43481() {
        return this.f61045;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1909 m43482() {
        return this.f61043;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C3320 m43477() {
        return this.f61043.m6217();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43478(C6143 c6143) {
        if (this.f61042 != null) {
            throw new IllegalArgumentException("already added declaring class");
        }
        if (c6143 == null) {
            throw new NullPointerException("declaringClass == null");
        }
        this.f61042 = c6143;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43479(C22371 c22371) {
        if (this.f61047 != null) {
            throw new IllegalArgumentException("already added call site");
        }
        this.f61047 = c22371;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22371 m43485() {
        return this.f61047;
    }
}
