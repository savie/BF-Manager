package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: KIY5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8517 extends AbstractC5820 implements InterfaceC24181, InterfaceC16874, Comparable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f27837 = new ArrayList();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f27838 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1610 f27839;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10776 f27840;

    @Override // l.InterfaceC24181
    public final String typeName() {
        return "package";
    }

    public C8517(C1610 c1610, C10776 c10776) {
        this.f27839 = c1610;
        this.f27840 = c10776;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27840.m27469().compareTo(((C8517) obj).f27840.m27469());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8517 m22833(C1610 c1610, String str, C24927 c24927) {
        C8517 c8517M22832 = m22832(c1610, str);
        c8517M22832.f27838.add(c24927);
        return c8517M22832;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8517 m22832(C1610 c1610, String str) {
        C8517 c8517M5669 = c1610.m5669(str);
        if (c8517M5669 != null) {
            return c8517M5669;
        }
        C10776 c10776M27468 = C10776.m27468(c1610, str);
        C10776 c10776M27470 = c10776M27468.m27470();
        C8517 c8517M22832 = c10776M27470 == null ? null : m22832(c1610, c10776M27470.m27469());
        C8517 c8517 = new C8517(c1610, c10776M27468);
        if (c8517M22832 != null) {
            c8517M22832.f27837.add(c8517);
        }
        c1610.m5674(c8517);
        return c8517;
    }

    public final String toString() {
        return this.f27840.m27469();
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C10776 m22834() {
        return this.f27840;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m22835() {
        return this.f27838;
    }

    @Override // l.InterfaceC11653
    /* JADX INFO: renamed from: ۘ */
    public final EnumC1959 mo8493() {
        return EnumC1959.PKG;
    }

    @Override // l.InterfaceC24181
    /* JADX INFO: renamed from: ܰ */
    public final C1610 mo8527() {
        return this.f27839;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8517)) {
            return false;
        }
        return this.f27840.equals(((C8517) obj).f27840);
    }

    public final int hashCode() {
        return this.f27840.hashCode();
    }
}
