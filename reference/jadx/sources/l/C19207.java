package l;

/* JADX INFO: renamed from: l.ᩳܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19207 extends C22937 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f62123;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2799 f62124;

    public C19207(AbstractC17715 abstractC17715, int i, AbstractC12450 abstractC12450) {
        super(abstractC17715, i, abstractC12450, C10212.f32654);
        this.f62123 = false;
        this.f62124 = null;
    }

    public C19207(C19207 c19207, AbstractC17715 abstractC17715) {
        super(c19207, abstractC17715, c19207.f74515, c19207.f74516);
        this.f62124 = c19207.f62124;
        this.f62123 = m44519(c19207, abstractC17715);
    }

    public C19207(C19207 c19207, AbstractC17715 abstractC17715, C2799 c2799) {
        super(c19207, abstractC17715, c19207.f74515, c19207.f74516);
        this.f62124 = c2799;
        this.f62123 = m44519(c19207, abstractC17715);
    }

    public C19207(C19207 c19207, AbstractC17715 abstractC17715, AbstractC12450 abstractC12450) {
        super(c19207, abstractC17715, abstractC12450, c19207.f74516);
        this.f62124 = c19207.f62124;
        this.f62123 = m44519(c19207, abstractC17715);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2799 m44520() {
        return this.f62124;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m44522() {
        return this.f62123;
    }

    @Override // l.C22937
    public final int hashCode() {
        return C7103.m19444(C7103.m19445(C7103.m19447(C7103.m19445(C7103.m19445(C7103.m19447(C7103.m19447(7, this.f74514.f58209), this.f74512), this.f74515), this.f74516), this.f62123 ? 1 : 0), this.f62124), 6);
    }

    @Override // l.C22937
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo44521(C22937 c22937) {
        boolean zEquals = true;
        if (this == c22937) {
            return true;
        }
        if (!(c22937 instanceof C19207)) {
            return false;
        }
        C19207 c19207 = (C19207) c22937;
        if (this.f62123 != c19207.f62123) {
            return false;
        }
        C2799 c2799 = c19207.f62124;
        C2799 c27910 = this.f62124;
        if (c27910 != null) {
            zEquals = c27910.equals(c2799);
        } else if (c2799 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.mo44521(c22937);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44519(C19207 c19207, AbstractC17715 abstractC17715) {
        if (c19207.f62123) {
            return true;
        }
        return (abstractC17715 instanceof AbstractC21445) && ((AbstractC21445) abstractC17715).f68397;
    }
}
