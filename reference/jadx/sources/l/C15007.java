package l;

/* JADX INFO: renamed from: l.ܳ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C15007 extends C13777 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f49019;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12770 f49020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10510 f49021;

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1769(C10729 c10729, Object obj) {
        EnumC0354 enumC0354 = (EnumC0354) obj;
        C12770 c12770 = this.f49020;
        C24705 c24705 = c12770.f40867;
        C14764 c14764 = c24705.f79947;
        AbstractC22664 abstractC22664 = c24705.f79947.f48241;
        EnumC18670 enumC18670 = c10729.f34073;
        int i = C3600.f12305[enumC18670.ordinal()];
        if (i == 1) {
            AbstractC22664 abstractC22665 = c10729.f34074;
            abstractC22665.getClass();
            abstractC22664 = (AbstractC22664) abstractC22665.mo9324(c12770, enumC0354);
            if (abstractC22664.m51067(EnumC21172.BOT)) {
                return c14764.f48241;
            }
        } else if (i == 2) {
            AbstractC22664 abstractC22666 = c10729.f34074;
            EnumC0354 enumC0354Mo2126 = enumC0354.mo2126();
            abstractC22666.getClass();
            abstractC22664 = (AbstractC22664) abstractC22666.mo9324(c12770, enumC0354Mo2126);
            if (abstractC22664.m51067(EnumC21172.BOT)) {
                abstractC22664 = c14764.f48286;
                enumC18670 = EnumC18670.UNBOUND;
            }
        }
        return new C19483(abstractC22664, enumC18670, c12770.f40867.f79947.f48274);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    @Override // l.C23475, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC22664 mo1766(AbstractC22664 abstractC22664, EnumC0354 enumC0354) {
        EnumC18670 enumC18670;
        C12770 c12770 = this.f49020;
        C24705 c24705 = c12770.f40867;
        Object obj = EnumC0354.f1862;
        if (enumC0354 == obj) {
            return c24705.f79947.f48241;
        }
        Object obj2 = EnumC0354.f1861;
        abstractC22664.getClass();
        AbstractC22664 abstractC22665 = (AbstractC22664) abstractC22664.mo9324(c12770, obj2);
        AbstractC22664 abstractC22666 = (AbstractC22664) abstractC22664.mo9324(c12770, obj);
        C14769 c14769Mo15882 = this.f49021.f73596.f38067.mo15882();
        if (!c24705.m55149(abstractC22665, c24705.f79947.f48286)) {
            AbstractC22664 abstractC22667 = this.f49019;
            if (abstractC22667.m51073(c14769Mo15882) || !c24705.m55131(abstractC22667, abstractC22665, true)) {
                enumC18670 = EnumC18670.EXTENDS;
            } else if (!abstractC22666.m51067(EnumC21172.BOT)) {
                abstractC22665 = abstractC22666;
                enumC18670 = EnumC18670.SUPER;
            } else {
                abstractC22665 = c24705.f79947.f48286;
                enumC18670 = EnumC18670.UNBOUND;
            }
        } else if (!abstractC22666.m51067(EnumC21172.BOT)) {
            abstractC22665 = abstractC22666;
            enumC18670 = EnumC18670.SUPER;
        } else {
            abstractC22665 = c24705.f79947.f48286;
            enumC18670 = EnumC18670.UNBOUND;
        }
        return new C19483(abstractC22665, enumC18670, c12770.f40867.f79947.f48274);
    }

    public C15007(C12770 c12770, C10510 c10510, AbstractC22664 abstractC22664) {
        this.f49020 = c12770;
        this.f49021 = c10510;
        this.f49019 = abstractC22664;
    }
}
