package l;

/* JADX INFO: renamed from: l.᩹ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB9P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22454 implements InterfaceC19653, Cloneable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11871 f73307;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16251 f73308;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17420(InterfaceC5520 interfaceC5520);

    /* JADX INFO: renamed from: ۟ */
    public abstract AbstractC15546 mo17421();

    /* JADX INFO: renamed from: ۠ */
    public abstract boolean mo17422();

    /* JADX INFO: renamed from: ۡ */
    public boolean mo17423() {
        return false;
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract boolean mo17424();

    /* JADX INFO: renamed from: ۨ */
    public abstract boolean mo17425();

    /* JADX INFO: renamed from: ۬ */
    public abstract C12723 mo17426();

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo17427(AbstractC12568 abstractC12568);

    /* JADX INFO: renamed from: ܶ */
    public abstract AbstractC15546 mo17428();

    /* JADX INFO: renamed from: ᩳ */
    public abstract C0727 mo17429();

    /* JADX INFO: renamed from: ᩵ */
    public boolean mo17430() {
        return false;
    }

    public AbstractC22454(C16251 c16251, C11871 c11871) {
        if (c11871 == null) {
            throw new NullPointerException("block == null");
        }
        this.f73307 = c11871;
        this.f73308 = c16251;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6330 m49948(C10607 c10607, C11871 c11871) {
        return new C6330(c10607, c11871);
    }

    @Override // 
    public AbstractC22454 clone() {
        try {
            return (AbstractC22454) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16251 m49955() {
        return this.f73308;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49952(C16251 c16251) {
        this.f73308 = c16251;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11871 m49949() {
        return this.f73307;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m49954(int i) {
        C16251 c16251 = this.f73308;
        return c16251 != null && c16251.m38400() == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49950(int i) {
        C16251 c16251 = this.f73308;
        if (c16251 != null) {
            this.f73308 = c16251.m38397(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49953(C19073 c19073) {
        if (c19073 != this.f73308.m38386()) {
            if (c19073 == null || !c19073.equals(this.f73308.m38386())) {
                this.f73308 = C16251.m38384(this.f73308.m38400(), this.f73308.getType(), c19073);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49951(AbstractC12568 abstractC12568) {
        C16251 c16251 = this.f73308;
        this.f73308 = abstractC12568.mo15518(c16251);
        this.f73307.m29609().m11677(this, c16251);
        mo17427(abstractC12568);
    }

    /* JADX INFO: renamed from: ᩹ */
    public C16251 mo17432() {
        C16251 c16251 = this.f73308;
        if (c16251 == null || c16251.m38386() == null) {
            return null;
        }
        return this.f73308;
    }
}
