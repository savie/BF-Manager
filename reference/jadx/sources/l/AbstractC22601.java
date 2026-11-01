package l;

/* JADX INFO: renamed from: l.᩹᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22601 extends AbstractC15546 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 f73656;

    public AbstractC22601(C12723 c12723, C11312 c11312, C16251 c16251, C0727 c0727, AbstractC9901 abstractC9901) {
        super(c12723, c11312, c16251, c0727);
        if (abstractC9901 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f73656 = abstractC9901;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۖ */
    public String mo6696() {
        return this.f73656.mo2376();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 m50100() {
        return this.f73656;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo37182(AbstractC15546 abstractC15546) {
        if (super.mo37182(abstractC15546)) {
            return this.f73656.equals(((AbstractC22601) abstractC15546).f73656);
        }
        return false;
    }
}
