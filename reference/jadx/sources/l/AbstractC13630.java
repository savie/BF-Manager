package l;

/* JADX INFO: renamed from: l.۬ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13630 implements InterfaceC1013 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4192 f43279;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f43280;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1083 f43281;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22010 f43282;

    public final String toString() {
        return "MethodCheckContext";
    }

    public AbstractC13630(C22010 c22010, boolean z, C4192 c4192, C1083 c1083) {
        this.f43282 = c22010;
        this.f43280 = z;
        this.f43279 = c4192;
        this.f43281 = c1083;
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public boolean mo3911(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C1083 c1083) {
        C2596 c2596 = this.f43279.f15335;
        boolean z = this.f43280;
        C22010 c22010 = this.f43282;
        if (z) {
            return c22010.f71021.m55150(c2596.m8710(abstractC22664), c2596.m8710(abstractC22665), c1083);
        }
        return c22010.f71021.m55170(c2596.m8710(abstractC22664), c2596.m8710(abstractC22665), c1083);
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public void mo3910(InterfaceC5075 interfaceC5075, C17007 c17007) {
        throw new C24074(c17007);
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final C1083 mo3909(InterfaceC5075 interfaceC5075, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        return this.f43281;
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ۙ */
    public final C2596 mo2276() {
        return this.f43279.f15335;
    }

    @Override // l.InterfaceC1013
    /* JADX INFO: renamed from: ᩷ */
    public final C4192 mo2277() {
        return this.f43279;
    }
}
