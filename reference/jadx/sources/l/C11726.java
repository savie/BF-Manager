package l;

/* JADX INFO: renamed from: l.ۨ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBEW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11726 extends AbstractC2552 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23077 f39418;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f39418.compareTo(((C11726) obj).f39418);
    }

    public C11726(C23077 c23077, int i) {
        super(i);
        this.f39418 = c23077;
    }

    public final int hashCode() {
        return this.f39418.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11726) && this.f39418.compareTo(((C11726) obj).f39418) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C11726.class.getName());
        sb.append('{');
        sb.append(C22475.m49982(m7960()));
        sb.append(' ');
        sb.append(this.f39418);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29307(C4669 c4669) {
        c4669.m12889().m32497(this.f39418);
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return this.f39418.mo2376();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23077 m29308() {
        return this.f39418;
    }

    @Override // l.AbstractC2552
    /* JADX INFO: renamed from: ۙ */
    public final int mo7959(C4669 c4669, C2718 c2718, int i, int i2) {
        C13137 c13137M12889 = c4669.m12889();
        C23077 c23077 = this.f39418;
        int iM32494 = c13137M12889.m32494(c23077);
        int i3 = iM32494 - i;
        int iM7960 = m7960();
        if (c2718.m8288()) {
            c2718.m8283(0, String.format("  [%x] %s", Integer.valueOf(i2), c23077.mo2376()));
            c2718.m8283(C10336.m26220(i3), "    field_idx:    ".concat(C22475.m49978(iM32494)));
            c2718.m8283(C10336.m26220(iM7960), "    access_flags: " + C4961.m13749(iM7960));
        }
        c2718.m8293(i3);
        c2718.m8293(iM7960);
        return iM32494;
    }
}
