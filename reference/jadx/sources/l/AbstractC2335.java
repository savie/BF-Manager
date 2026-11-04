package l;

/* JADX INFO: renamed from: l.ۖ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2335 extends AbstractC11781 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f7552;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f7553;

    /* JADX INFO: renamed from: ۙ */
    public abstract C17007 mo3799(EnumC22229 enumC22229, InterfaceC5075 interfaceC5075, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728, C14769 c14769, C14769 c147610);

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean mo7873() {
        return this instanceof C11393;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7874() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2335(C22010 c22010, EnumC13603 enumC13603, String str) {
        super(enumC13603, 0L, null, null, null);
        this.f7552 = c22010;
        this.f7553 = str;
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo7871(AbstractC9024 abstractC9024, Object obj) {
        throw new AssertionError();
    }

    @Override // l.AbstractC11781
    public String toString() {
        return this.f7553;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 mo7872(AbstractC19728 abstractC19728, AbstractC22970 abstractC22970) {
        C22010 c22010 = this.f7552;
        C24705 c24705 = c22010.f71021;
        AbstractC22664 abstractC22664 = c22010.f71034.f48237.f38067;
        c24705.getClass();
        return C24705.m55061(abstractC19728, abstractC22970, abstractC22664).f73596;
    }
}
