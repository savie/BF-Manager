package l;

/* JADX INFO: renamed from: l.ᩴܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBEW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19869 extends AbstractC15393 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16689 f63899;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f63899.compareTo(((C19869) obj).f63899);
    }

    public C19869(C16689 c16689, int i) {
        super(i);
        this.f63899 = c16689;
    }

    public final int hashCode() {
        return this.f63899.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C19869) && this.f63899.compareTo(((C19869) obj).f63899) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C19869.class.getName());
        sb.append('{');
        sb.append(C5306.m15934(m36861()));
        sb.append(' ');
        sb.append(this.f63899);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45724(C10918 c10918) {
        c10918.m27705().m29339(this.f63899);
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return this.f63899.mo1843();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16689 m45725() {
        return this.f63899;
    }

    @Override // l.AbstractC15393
    /* JADX INFO: renamed from: ۙ */
    public final int mo32683(C10918 c10918, C15000 c15000, int i, int i2) {
        C11664 c11664M27705 = c10918.m27705();
        C16689 c16689 = this.f63899;
        int iM29336 = c11664M27705.m29336(c16689);
        int i3 = iM29336 - i;
        int iM36861 = m36861();
        if (c15000.m36116()) {
            c15000.m36111(0, String.format("  [%x] %s", Integer.valueOf(i2), c16689.mo1843()));
            c15000.m36111(C24018.m53570(i3), "    field_idx:    ".concat(C5306.m15938(iM29336)));
            c15000.m36111(C24018.m53570(iM36861), "    access_flags: " + C5596.m16577(iM36861));
        }
        c15000.m36117(i3);
        c15000.m36117(iM36861);
        return iM29336;
    }
}
