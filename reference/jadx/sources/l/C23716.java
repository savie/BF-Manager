package l;

/* JADX INFO: renamed from: l.᩹ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 843X */
/* JADX INFO: loaded from: classes.dex */
public final class C23716 implements InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14764 f76861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14852 f76862;

    public C23716(C14764 c14764, InterfaceC14852 interfaceC14852) {
        this.f76861 = c14764;
        this.f76862 = interfaceC14852;
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public final void mo11629(AbstractC11781 abstractC11781) {
        try {
            this.f76862.mo11629(abstractC11781);
        } catch (C21566 unused) {
            abstractC11781.f38071 |= 513;
            ((C10510) abstractC11781.f38067).f33442 = this.f76861.f48286;
        }
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo11630() {
        return this.f76862.mo11630();
    }
}
