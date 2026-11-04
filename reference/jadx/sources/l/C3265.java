package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BH4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3265 extends AbstractC13487 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0282 f10606;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C6994 f10607;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f10608;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1028 f10609;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10610 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12960 f10611;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return "InvokeDynamic";
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3265 m10659(int i, C0282 c0282) {
        return new C3265(i, c0282);
    }

    public C3265(int i, C0282 c0282) {
        this.f10608 = i;
        this.f10606 = c0282;
        this.f10607 = C6994.m19303(c0282.m1846().mo1843());
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5503 m10665() {
        ArrayList arrayList = this.f10610;
        C5503 c5503 = new C5503(this, arrayList.size());
        arrayList.add(c5503);
        return c5503;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList m10668() {
        return this.f10610;
    }

    public final String toString() {
        return mo1843();
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        C1028 c1028 = this.f10609;
        StringBuilder sbM51387 = C22783.m51387("InvokeDynamic(", c1028 != null ? c1028.mo1843() : "Unknown", ":");
        sbM51387.append(this.f10608);
        sbM51387.append(", ");
        sbM51387.append(this.f10606.mo1843());
        sbM51387.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sbM51387.toString();
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        C3265 c3265 = (C3265) abstractC13487;
        int iCompare = Integer.compare(this.f10608, c3265.f10608);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f10606.compareTo(c3265.f10606);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f10609.compareTo((AbstractC13487) c3265.f10609);
        return iCompareTo2 != 0 ? iCompareTo2 : this.f10611.compareTo(c3265.f10611);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m10667() {
        return this.f10608;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0282 m10664() {
        return this.f10606;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C6994 m10662() {
        return this.f10607;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5085 m10663() {
        return this.f10607.m19308();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10660(C1028 c1028) {
        if (this.f10609 != null) {
            throw new IllegalArgumentException("already added declaring class");
        }
        if (c1028 == null) {
            throw new NullPointerException("declaringClass == null");
        }
        this.f10609 = c1028;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10661(C12960 c12960) {
        if (this.f10611 != null) {
            throw new IllegalArgumentException("already added call site");
        }
        this.f10611 = c12960;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C12960 m10666() {
        return this.f10611;
    }
}
