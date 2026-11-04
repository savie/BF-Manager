package l;

/* JADX INFO: renamed from: l.ܿۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18138 extends AbstractC2476 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f59314;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 f59315;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f59316;

    public C18138(C0985 c0985, C9012 c9012, C0063 c0063, AbstractC13487 abstractC13487) {
        super(c0985, c9012, c0063);
        if (abstractC13487 == null) {
            throw new NullPointerException("constant == null");
        }
        this.f59315 = abstractC13487;
        this.f59314 = -1;
        this.f59316 = -1;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo14214(C0985 c0985) {
        C18138 c18138 = new C18138(c0985, m43799(), m43795(), this.f59315);
        int i = this.f59314;
        if (i >= 0) {
            c18138.m42256(i);
        }
        int i2 = this.f59316;
        if (i2 >= 0) {
            c18138.m42253(i2);
        }
        return c18138;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo18813(C0063 c0063) {
        C18138 c18138 = new C18138(m43802(), m43799(), c0063, this.f59315);
        int i = this.f59314;
        if (i >= 0) {
            c18138.m42256(i);
        }
        int i2 = this.f59316;
        if (i2 >= 0) {
            c18138.m42253(i2);
        }
        return c18138;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 m42255() {
        return this.f59315;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m42254() {
        int i = this.f59314;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("index not yet set for " + this.f59315);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۤ */
    public final String mo37450() {
        if (this.f59314 < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f59315.mo1845());
        sb.append('@');
        int i = this.f59314;
        if (i < 65536) {
            sb.append(C5306.m15934(i));
        } else {
            sb.append(C5306.m15938(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m42256(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f59314 >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f59314 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m42253(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f59316 >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f59316 = i;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final String mo18812() {
        return this.f59315.mo1843();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ᩸ */
    public final String mo37455() {
        AbstractC13487 abstractC13487 = this.f59315;
        if (abstractC13487 instanceof C9976) {
            return ((C9976) abstractC13487).m25818();
        }
        return abstractC13487.mo1843();
    }
}
