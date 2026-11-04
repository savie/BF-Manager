package l;

/* JADX INFO: renamed from: l.۠ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8759 extends C10510 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f28468;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28469;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8759(C11172 c11172, AbstractC22664 abstractC22664, C14769 c14769, C24550 c24550) {
        super(c24550, abstractC22664, c14769);
        this.f28468 = c11172;
        this.f28469 = false;
    }

    @Override // l.C10510, l.AbstractC22664
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 mo23449() {
        C24705 c24705 = this.f28468.f35183;
        if (!this.f28469) {
            this.f28469 = true;
            this.f73596.m29583();
            AbstractC22664 abstractC22664Mo23449 = this.f73596.f38067.mo23449();
            C11256 c11256 = AbstractC22664.f73590;
            if (abstractC22664Mo23449 != c11256) {
                C14769 c14769Mo9323 = super.mo23449().mo9323();
                C14769 c14769Mo9324 = abstractC22664Mo23449.mo9323();
                if (c14769Mo9324.m35551() != c14769Mo9323.m35551()) {
                    super.mo23450(c24705.m55132(abstractC22664Mo23449));
                } else {
                    super.mo23450(c24705.m55103(abstractC22664Mo23449, c14769Mo9324, c14769Mo9323));
                }
            } else {
                super.mo23450(c11256);
            }
        }
        return super.mo23449();
    }

    @Override // l.C10510
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo23450(AbstractC22664 abstractC22664) {
        throw new UnsupportedOperationException();
    }
}
