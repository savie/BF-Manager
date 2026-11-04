package l;

/* JADX INFO: renamed from: l.۫ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBF6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13156 extends AbstractC15393 implements Comparable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18181 f42081;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2410 f42082;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f42081.compareTo(((C13156) obj).f42081);
    }

    public C13156(C18181 c18181, int i, C7697 c7697, InterfaceC11050 interfaceC11050) {
        super(i);
        this.f42081 = c18181;
        if (c7697 == null) {
            this.f42082 = null;
        } else {
            this.f42082 = new C2410(c18181, c7697, (i & 8) != 0, interfaceC11050);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13156) && this.f42081.compareTo(((C13156) obj).f42081) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C13156.class.getName());
        sb.append('{');
        sb.append(C5306.m15934(m36861()));
        sb.append(' ');
        sb.append(this.f42081);
        C2410 c2410 = this.f42082;
        if (c2410 != null) {
            sb.append(' ');
            sb.append(c2410);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32684(C10918 c10918) {
        C18377 c18377M27707 = c10918.m27707();
        C19123 c19123M27703 = c10918.m27703();
        c18377M27707.m42875(this.f42081);
        C2410 c2410 = this.f42082;
        if (c2410 != null) {
            c19123M27703.m44244((AbstractC10172) c2410);
        }
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return this.f42081.mo1843();
    }

    @Override // l.AbstractC15393
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo32683(C10918 c10918, C15000 c15000, int i, int i2) {
        C18377 c18377M27707 = c10918.m27707();
        C18181 c18181 = this.f42081;
        int iM42872 = c18377M27707.m42872((AbstractC22657) c18181);
        int i3 = iM42872 - i;
        int iM36861 = m36861();
        C2410 c2410 = this.f42082;
        int iM26285 = c2410 == null ? 0 : c2410.m26285();
        if ((iM26285 != 0) != ((iM36861 & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c15000.m36116()) {
            c15000.m36111(0, String.format("  [%x] %s", Integer.valueOf(i2), c18181.mo1843()));
            c15000.m36111(C24018.m53570(i3), "    method_idx:   ".concat(C5306.m15938(iM42872)));
            c15000.m36111(C24018.m53570(iM36861), "    access_flags: " + C5596.m16573(iM36861));
            c15000.m36111(C24018.m53570(iM26285), "    code_off:     ".concat(C5306.m15938(iM26285)));
        }
        c15000.m36117(i3);
        c15000.m36117(iM36861);
        c15000.m36117(iM26285);
        return iM42872;
    }
}
