package l;

/* JADX INFO: renamed from: l.ܿ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C17991 extends AbstractC7550 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0838 f58929;

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ */
    public final void mo12356(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037, boolean z) {
        C24533 c24533 = (C24533) abstractC8036;
        if (z) {
            return;
        }
        this.f58929.f3151.m34531(c24533, C13146.f42066);
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12357(AbstractC8036 abstractC8036) {
        C14769 c14769 = ((C24533) abstractC8036).f79552;
        return c14769 != null && c14769.m35550();
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ᩷ */
    public final C14769 mo12358(AbstractC8036 abstractC8036) {
        C24533 c24533 = (C24533) this.f58929.f3153.mo23491(abstractC8036, (Object) null);
        c24533.f79552 = C14769.m35543();
        return C14769.of((Object) c24533);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17991(C0838 c0838) {
        super(c0838, EnumC20229.METHOD, EnumC21461.f68526);
        this.f58929 = c0838;
    }
}
