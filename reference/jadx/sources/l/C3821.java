package l;

/* JADX INFO: renamed from: l.ۘ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes3.dex */
public final class C3821 extends AbstractC14261 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0838 f13032;

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12356(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037, boolean z) {
        C12510 c12510 = (C12510) abstractC8036;
        C12510 c12511 = (C12510) abstractC8037;
        if (z) {
            return;
        }
        C0838 c0838 = this.f45070;
        if (c0838.f3154.m55149(c12510.f26659, c12511.f26659)) {
            c0838.f3151.m34531(c12510, C13146.f42050);
        }
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo12357(AbstractC8036 abstractC8036) {
        C12510 c12510 = (C12510) abstractC8036;
        if (c12510.f40168.f38069.f38066 != EnumC13603.f43218 || c12510.f40171 == null || c12510.f40166.f26658 == -1) {
            return false;
        }
        this.f13032.f3155.getClass();
        C20447 c20447 = new C20447();
        c20447.f65493 = null;
        c20447.f65494 = true;
        c20447.mo5474(c12510.f40171);
        return c20447.f65493 == null;
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14769 mo12358(AbstractC8036 abstractC8036) {
        C12510 c12510 = (C12510) this.f45070.f3153.mo23491(abstractC8036, (Object) null);
        c12510.f40166 = null;
        return C14769.of((Object) c12510);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3821(C0838 c0838) {
        super(c0838, EnumC21461.f68538);
        this.f13032 = c0838;
    }
}
