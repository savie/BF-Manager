package l;

/* JADX INFO: renamed from: l.᩶֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C20975 extends AbstractC14261 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0838 f67067;

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ */
    public final void mo12356(AbstractC8036 abstractC8036, AbstractC8036 abstractC8037, boolean z) {
        C12510 c12510 = ((C7180) abstractC8036).f23710;
        C12510 c12511 = ((C7180) abstractC8037).f23710;
        if (z) {
            return;
        }
        C0838 c0838 = this.f45070;
        if (c0838.f3154.m55149(c12510.f26659, c12511.f26659)) {
            c0838.f3151.m34531(c12510, C13146.f42050);
        }
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12357(AbstractC8036 abstractC8036) {
        return !(((C7180) abstractC8036).f23710.f40166.f26658 == -1);
    }

    @Override // l.AbstractC7550
    /* JADX INFO: renamed from: ᩷ */
    public final C14769 mo12358(AbstractC8036 abstractC8036) {
        C7180 c7180 = (C7180) abstractC8036;
        C0838 c0838 = this.f67067;
        C7180 c7181 = (C7180) c0838.f3153.mo23491((AbstractC8036) c7180, (Object) null);
        C12510 c12510 = (C12510) this.f45070.f3153.mo23491((AbstractC8036) c7180.f23710, (Object) null);
        c12510.f40166 = null;
        c7181.f23710 = c12510;
        C15714 c15714 = c0838.f3158;
        c15714.m37552((InterfaceC5075) c7180.f23709);
        c7181.f23709 = c15714.m37506(0L, C14769.m35543());
        return C14769.of((Object) c7181);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20975(C0838 c0838) {
        super(c0838, EnumC21461.f68473);
        this.f67067 = c0838;
    }
}
