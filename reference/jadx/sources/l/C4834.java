package l;

/* JADX INFO: renamed from: l.ۙۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public final class C4834 extends C7175 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14528 f16891;

    @Override // l.C7175, l.C23475, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        return m14865(abstractC22664);
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1768(C10510 c10510, Object obj) {
        return this.f16891.f45697.m55132(c10510);
    }

    @Override // l.C7175, l.C23475, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC22664 mo1766(Object obj, AbstractC22664 abstractC22664) {
        return m14865(abstractC22664);
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo1768(C10510 c10510, Object obj) {
        return this.f16891.f45697.m55132(c10510);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4834(C14528 c14528, AbstractC11781 abstractC11781, EnumC20234 enumC20234) {
        this.f16891 = c14528;
        C12863 c12863 = c14528.f45698.f71035;
        C17359.requireNonNull(c12863);
        super(c12863, EnumC16124.SPECULATIVE, abstractC11781, enumC20234);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m14865(AbstractC22664 abstractC22664) {
        if (abstractC22664.m51067(EnumC21172.DEFERRED)) {
            return m52682(super.mo1766((Object) null, abstractC22664));
        }
        if (!abstractC22664.m51067(EnumC21172.BOT)) {
            return abstractC22664;
        }
        C14528 c14528 = this.f16891;
        return c14528.f45697.m55108(c14528.f45699.f48251).f38067;
    }
}
