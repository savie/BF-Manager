package l;

/* JADX INFO: renamed from: l.֫ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P89T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1725 extends AbstractC20776 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC4588 f6832;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Long f6833;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract C3136 mo5739();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC4588 m5737() {
        return this.f6832;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Long m5738() {
        return this.f6833;
    }

    @Override // l.AbstractC20776
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo5740(C15132 c15132) {
        C3136 c3136Mo5739 = mo5739();
        this.f6832 = c3136Mo5739;
        c15132.m36285(c3136Mo5739);
        c15132.m36284(EnumC17953.FOUR);
        c15132.m36287();
        if (c15132.m36288() != 0) {
            this.f6833 = Long.valueOf(c15132.m36287());
        } else {
            this.f6833 = null;
        }
    }
}
