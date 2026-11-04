package l;

/* JADX INFO: renamed from: l.ۗܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes3.dex */
public final class C3578 implements InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14764 f12253;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22664 f12254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14852 f12255;

    public C3578(C14764 c14764, InterfaceC14852 interfaceC14852, AbstractC22664 abstractC22664) {
        this.f12253 = c14764;
        this.f12255 = interfaceC14852;
        this.f12254 = abstractC22664;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11629(AbstractC11781 abstractC11781) {
        C14764 c14764 = this.f12253;
        C24550 c24550 = c14764.f48275;
        try {
            this.f12255.mo11629(abstractC11781);
        } catch (C21566 unused) {
            abstractC11781.f38071 |= 1;
            ((C10510) abstractC11781.f38067).f33442 = c14764.f48286;
            AbstractC19728 abstractC19728 = c14764.f48247.f49817;
            AbstractC22664 abstractC22664 = this.f12254;
            abstractC11781.mo29571().mo7481(new C10377(9L, abstractC19728, new C23191(C14769.of((Object) abstractC22664), abstractC11781.f38067, C14769.m35543(), c24550), abstractC11781));
            abstractC11781.mo29571().mo7481(new C10377(1L, abstractC22664.f73596.f38072.m45430(c14764.f48247.f49867), new C23191(C14769.m35543(), abstractC22664, C14769.m35543(), c24550), abstractC11781));
        }
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo11630() {
        return this.f12255.mo11630();
    }
}
