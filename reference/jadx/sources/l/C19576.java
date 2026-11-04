package l;

/* JADX INFO: renamed from: l.ᩴۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public class C19576 extends C7175 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12863 f63131;

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ C23191 mo2231(C23191 c23191, Object obj) {
        return (C23191) mo2231(c23191, (AbstractC22664) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19576(C12863 c12863, EnumC16124 enumC16124, AbstractC11781 abstractC11781, EnumC20234 enumC20234) {
        super(c12863, enumC16124, abstractC11781, enumC20234 == null ? EnumC20234.f64933 : enumC20234);
        this.f63131 = c12863;
    }

    @Override // l.C7175
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public AbstractC22664 mo19749(C8666 c8666, AbstractC22664 abstractC22664) {
        AbstractC22664 abstractC22664Mo19749 = super.mo19749(c8666, (Object) abstractC22664);
        AbstractC22295 abstractC22295 = c8666.f28301;
        if (abstractC22664Mo19749 != AbstractC22664.f73590) {
            return abstractC22664Mo19749;
        }
        boolean z = abstractC22295.m21911(EnumC21461.f68454) || abstractC22295.m21911(EnumC21461.f68453);
        C12863 c12863 = this.f63131;
        if (abstractC22664 == null || (z && !c12863.f41178.m55087(abstractC22664))) {
            abstractC22664 = AbstractC22664.f73591;
        }
        C0310 c0310 = c12863.f41176;
        C17359.requireNonNull(c0310);
        c8666.m23334((C14479) new C22560(this, c0310, this.f23702, abstractC22664));
        return (AbstractC22664) c8666.mo9324(this, (Object) null);
    }

    @Override // l.AbstractC14239, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC22664 mo2231(C23191 c23191, AbstractC22664 abstractC22664) {
        EnumC21172 enumC21172 = EnumC21172.METHOD;
        if (c23191.m51067(enumC21172)) {
            C4192 c4192 = this.f23702;
            if (c4192.f15331 == EnumC16124.CHECK) {
                AbstractC22664 abstractC22665 = c4192.f15336.f38067;
                AbstractC22664 abstractC22664Mo31584 = abstractC22665.m51067(EnumC21172.ERROR) ? ((C12748) abstractC22665).mo31584() : null;
                if (abstractC22664Mo31584 != null && abstractC22664Mo31584.m51067(enumC21172)) {
                    C14769 c14769M45175 = m45175(c23191.f75155, abstractC22664Mo31584.mo50621());
                    AbstractC22664 abstractC22666 = (AbstractC22664) c23191.f75156.mo9324(this, abstractC22664Mo31584.mo31585());
                    C14769 c14769M45176 = m45175(c23191.f75157, abstractC22664Mo31584.mo50622());
                    return (c14769M45175 == c23191.f75155 && abstractC22666 == c23191.f75156 && c14769M45176 == c23191.f75157) ? c23191 : new C23191(c14769M45175, abstractC22666, c14769M45176, c23191.f73596);
                }
            }
        }
        return super.mo2231(c23191, (Object) abstractC22664);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14769 m45175(C14769 c14769, C14769 c147610) {
        if (!c14769.m35550()) {
            return c14769;
        }
        AbstractC22664 abstractC22664 = null;
        C14769 c14769M45175 = m45175(c14769.f48336, c147610 != null ? c147610.f48336 : null);
        AbstractC22664 abstractC22665 = (AbstractC22664) c14769.f48335;
        if (c147610 != null && c147610.m35550()) {
            abstractC22664 = (AbstractC22664) c147610.f48335;
        }
        AbstractC22664 abstractC22666 = (AbstractC22664) m34207(abstractC22664, abstractC22665);
        return (c14769M45175 == c14769.f48336 && abstractC22666 == c14769.f48335) ? c14769 : c14769M45175.m35552(abstractC22666);
    }
}
