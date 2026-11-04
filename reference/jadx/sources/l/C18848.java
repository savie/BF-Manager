package l;

/* JADX INFO: renamed from: l.ᩳۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18848 implements InterfaceC12314 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f61225;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f61226;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f61227;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0203 f61228;

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo29776(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo29777(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo29778(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ void mo29779(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo29781(InterfaceC11217 interfaceC11217) {
    }

    public C18848(DialogInterfaceC8327 dialogInterfaceC8327, AbstractActivityC17204 abstractActivityC17204, C0203 c0203, Runnable runnable) {
        this.f61227 = dialogInterfaceC8327;
        this.f61226 = abstractActivityC17204;
        this.f61228 = c0203;
        this.f61225 = runnable;
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩷ */
    public final void mo29780(InterfaceC11217 interfaceC11217) {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f61227;
        boolean zM22434 = dialogInterfaceC8327.m22434();
        AbstractActivityC17204 abstractActivityC17204 = this.f61226;
        if (!zM22434) {
            abstractActivityC17204.getLifecycle().mo23078(this);
            return;
        }
        C0203 c0203 = this.f61228;
        if (c0203.m1604()) {
            if (!c0203.f1363) {
                c0203.f1363 = true;
                dialogInterfaceC8327.dismiss();
                ServiceC17530.m41157();
                C20340.m46730();
                this.f61225.run();
                return;
            }
            abstractActivityC17204.getLifecycle().mo23078(this);
        }
    }
}
