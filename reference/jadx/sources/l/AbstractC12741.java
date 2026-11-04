package l;

/* JADX INFO: renamed from: l.۫֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12741 extends AbstractC17216 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 f40777;

    public AbstractC12741(C18708 c18708, C9012 c9012, C20946 c20946, C0063 c0063, AbstractC13487 abstractC13487) {
        super(c18708, c9012, c20946, c0063);
        if (abstractC13487 == null) {
            throw new NullPointerException("cst == null");
        }
        this.f40777 = abstractC13487;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ᩸ */
    public String mo7782() {
        return this.f40777.mo1843();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 m31552() {
        return this.f40777;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7780(AbstractC17216 abstractC17216) {
        if (super.mo7780(abstractC17216)) {
            return this.f40777.equals(((AbstractC12741) abstractC17216).f40777);
        }
        return false;
    }
}
