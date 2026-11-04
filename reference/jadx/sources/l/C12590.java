package l;

/* JADX INFO: renamed from: l.ۨ᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 38I8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12590 implements InterfaceC0658 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15648 f40420;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1150 f40421;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f40422;

    public C12590(String str) {
        C20124 c20124 = new C20124();
        c20124.m46327("video/mp2t");
        c20124.m46315(str);
        this.f40420 = c20124.m46295();
    }

    @Override // l.InterfaceC0658
    /* JADX INFO: renamed from: ۙ */
    public final void mo2878(C1150 c1150, InterfaceC12789 interfaceC12789, C10857 c10857) {
        this.f40421 = c1150;
        c10857.m27594();
        InterfaceC22024 interfaceC22024Mo16658 = interfaceC12789.mo16658(c10857.m27595(), 5);
        this.f40422 = interfaceC22024Mo16658;
        interfaceC22024Mo16658.mo14384(this.f40420);
    }

    @Override // l.InterfaceC0658
    /* JADX INFO: renamed from: ۙ */
    public final void mo2879(C21287 c21287) {
        C20782.m47566(this.f40421);
        String str = C7116.f23455;
        long jM4248 = this.f40421.m4248();
        long jM4246 = this.f40421.m4246();
        if (jM4248 == -9223372036854775807L || jM4246 == -9223372036854775807L) {
            return;
        }
        C15648 c15648 = this.f40420;
        if (jM4246 != c15648.f50837) {
            C20124 c20124M37397 = c15648.m37397();
            c20124M37397.m46298(jM4246);
            C15648 c15648M46295 = c20124M37397.m46295();
            this.f40420 = c15648M46295;
            this.f40422.mo14384(c15648M46295);
        }
        int iM48486 = c21287.m48486();
        this.f40422.mo14381(iM48486, c21287);
        this.f40422.mo14383(jM4248, 1, iM48486, 0, null);
    }
}
