package l;

/* JADX INFO: renamed from: l.ۚۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB9P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5568 implements InterfaceC6052, Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19738 f19346;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20946 f19347;

    /* JADX INFO: renamed from: ۗ */
    public abstract boolean mo4983();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4987(InterfaceC13025 interfaceC13025);

    /* JADX INFO: renamed from: ۚ */
    public abstract C18708 mo4988();

    /* JADX INFO: renamed from: ۛ */
    public abstract boolean mo4989();

    /* JADX INFO: renamed from: ۨ */
    public boolean mo4990() {
        return false;
    }

    /* JADX INFO: renamed from: ܶ */
    public abstract C0063 mo4992();

    /* JADX INFO: renamed from: ܺ */
    public abstract AbstractC17216 mo4993();

    /* JADX INFO: renamed from: ᩵ */
    public boolean mo4994() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo4995(AbstractC21976 abstractC21976);

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo4996();

    /* JADX INFO: renamed from: ᩺ */
    public abstract AbstractC17216 mo4997();

    public AbstractC5568(C20946 c20946, C19738 c19738) {
        if (c19738 == null) {
            throw new NullPointerException("block == null");
        }
        this.f19346 = c19738;
        this.f19347 = c20946;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1356 m16501(C23930 c23930, C19738 c19738) {
        return new C1356(c23930, c19738);
    }

    @Override // 
    public AbstractC5568 clone() {
        try {
            return (AbstractC5568) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20946 m16508() {
        return this.f19347;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16504(C20946 c20946) {
        this.f19347 = c20946;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19738 m16506() {
        return this.f19346;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m16507(int i) {
        C20946 c20946 = this.f19347;
        return c20946 != null && c20946.m47903() == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16502(int i) {
        C20946 c20946 = this.f19347;
        if (c20946 != null) {
            this.f19347 = c20946.m47899(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16503(C3046 c3046) {
        if (c3046 != this.f19347.m47896()) {
            if (c3046 == null || !c3046.equals(this.f19347.m47896())) {
                this.f19347 = C20946.m47886(this.f19347.m47903(), this.f19347.getType(), c3046);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16505(AbstractC21976 abstractC21976) {
        C20946 c20946 = this.f19347;
        this.f19347 = abstractC21976.mo21960(c20946);
        this.f19346.m45470().m55731(this, c20946);
        mo4995(abstractC21976);
    }

    /* JADX INFO: renamed from: ܳ */
    public C20946 mo4991() {
        C20946 c20946 = this.f19347;
        if (c20946 == null || c20946.m47896() == null) {
            return null;
        }
        return this.f19347;
    }
}
