package l;

/* JADX INFO: renamed from: l.֡֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0097 extends AbstractC8410 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12598 f1036;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC0097 mo1197(C2596 c2596) {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract EnumC20803 mo1199(AbstractC11781 abstractC11781);

    public AbstractC0097(AbstractC22664 abstractC22664, EnumC20234 enumC20234, C12598 c12598, C14769 c14769, C14769 c147610, AbstractC19728 abstractC19728) {
        super(abstractC19728, abstractC22664, c14769, c147610, enumC20234);
        this.f1036 = c12598;
    }

    @Override // l.AbstractC8410
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 mo1198(C3168 c3168, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC11781 abstractC11782) {
        if (abstractC11782.f38066 != EnumC13603.f43209) {
            return abstractC11782;
        }
        C11393 c11393 = (C11393) abstractC11782.mo10410();
        AbstractC22664 abstractC22664 = this.f27563;
        return (AbstractC11781) c11393.f35853.f71021.m55099(c11393.f35854.m35554(), abstractC22664, true).orElse(c11393);
    }
}
