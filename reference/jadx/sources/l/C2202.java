package l;

/* JADX INFO: renamed from: l.֫᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C2202 extends AbstractC15537 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20847 f7230;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4439 f7231;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2202(C4439 c4439, C25235 c25235, C20847 c20847) {
        super(c25235);
        this.f7231 = c4439;
        this.f7230 = c20847;
    }

    @Override // l.AbstractC15537
    /* JADX INFO: renamed from: ۙ */
    public final void mo7293(C24550 c24550) {
        this.f7231.m14125(c24550, this.f7230);
    }

    @Override // l.AbstractC15537
    /* JADX INFO: renamed from: ۙ */
    public final void mo7292(AbstractC11781 abstractC11781) {
        if (abstractC11781.f38066 == EnumC13603.f43205 && abstractC11781.f38069.f38066 == EnumC13603.f43218 && ((C5816) abstractC11781).m16959() == null) {
            C4439 c4439 = this.f7231;
            for (AbstractC24577 abstractC24577M14124 = c4439.m14124(); abstractC24577M14124 != null; abstractC24577M14124 = abstractC24577M14124.f79660) {
                if (abstractC24577M14124.f79657.mo2285() == EnumC21461.f68453) {
                    if (c4439.m14104(abstractC24577M14124.f79659, abstractC11781) == null) {
                        return;
                    } else {
                        ((C20847) abstractC24577M14124).m47674(abstractC11781, EnumC14879.CAPTURED_VAR);
                    }
                }
            }
        }
    }
}
