package l;

/* JADX INFO: renamed from: l.ᩴᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1570 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20022 extends AbstractC3614 {
    @Override // l.AbstractC12563
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12563 mo2797(C5194 c5194) {
        return new C20022(this.f40344, this.f12388.mo5237(c5194), this.f12387.mo5237(c5194));
    }

    public final String toString() {
        int i = C23006.f74667[this.f40344.ordinal()];
        if (i == 1) {
            return this.f12388 + " = " + this.f12387;
        }
        if (i == 2 || i == 3) {
            return this.f12388 + " := " + this.f12387;
        }
        if (i == 4) {
            return this.f12388 + " <- " + this.f12387;
        }
        return super.toString();
    }

    public C20022(EnumC20768 enumC20768, AbstractC11071 abstractC11071, AbstractC11071 abstractC11072) {
        super(enumC20768, EnumC7080.E2);
        this.f12388 = abstractC11071;
        this.f12387 = abstractC11072;
    }
}
