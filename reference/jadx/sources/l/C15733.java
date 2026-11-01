package l;

/* JADX INFO: renamed from: l.ܺۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15733 extends AbstractC10794 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f51029;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f51030;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 f51031;

    public C15733(C17143 c17143, C11312 c11312, C0727 c0727, AbstractC9901 abstractC9901) {
        super(c17143, c11312, c0727);
        if (abstractC9901 == null) {
            throw new NullPointerException("constant == null");
        }
        this.f51031 = abstractC9901;
        this.f51029 = -1;
        this.f51030 = -1;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8570(C17143 c17143) {
        C15733 c15733 = new C15733(c17143, m38701(), m38695(), this.f51031);
        int i = this.f51029;
        if (i >= 0) {
            c15733.m37455(i);
        }
        int i2 = this.f51030;
        if (i2 >= 0) {
            c15733.m37456(i2);
        }
        return c15733;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16438 mo8569(C0727 c0727) {
        C15733 c15733 = new C15733(m38693(), m38701(), c0727, this.f51031);
        int i = this.f51029;
        if (i >= 0) {
            c15733.m37455(i);
        }
        int i2 = this.f51030;
        if (i2 >= 0) {
            c15733.m37456(i2);
        }
        return c15733;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 m37458() {
        return this.f51031;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m37457() {
        int i = this.f51029;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("index not yet set for " + this.f51031);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۨ */
    public final String mo8573() {
        if (this.f51029 < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f51031.mo2375());
        sb.append('@');
        int i = this.f51029;
        if (i < 65536) {
            sb.append(C22475.m49982(i));
        } else {
            sb.append(C22475.m49978(i));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m37455(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f51029 >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f51029 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37456(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f51030 >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f51030 = i;
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final String mo8568() {
        return this.f51031.mo2376();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۖ */
    public final String mo8567() {
        AbstractC9901 abstractC9901 = this.f51031;
        if (abstractC9901 instanceof C17432) {
            return ((C17432) abstractC9901).m40637();
        }
        return abstractC9901.mo2376();
    }
}
