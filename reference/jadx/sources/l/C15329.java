package l;

/* JADX INFO: renamed from: l.ܶܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes5.dex */
public class C15329 implements InterfaceC7296 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f49926;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f49927;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f49928;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6861 f49929;

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ void mo10182(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo10183(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ void mo10184(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ void mo10185(InterfaceC1423 interfaceC1423) {
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ void mo10187(InterfaceC1423 interfaceC1423) {
    }

    public C15329(DialogInterfaceC19356 dialogInterfaceC19356, AbstractActivityC12483 abstractActivityC12483, C6861 c6861, Runnable runnable) {
        this.f49926 = dialogInterfaceC19356;
        this.f49927 = abstractActivityC12483;
        this.f49929 = c6861;
        this.f49928 = runnable;
    }

    @Override // l.InterfaceC7296
    /* JADX INFO: renamed from: ܰ */
    public final void mo10186(InterfaceC1423 interfaceC1423) {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f49926;
        boolean zM44375 = dialogInterfaceC19356.m44375();
        AbstractActivityC12483 abstractActivityC12483 = this.f49927;
        if (!zM44375) {
            abstractActivityC12483.getLifecycle().mo9172(this);
            return;
        }
        C6861 c6861 = this.f49929;
        if (c6861.m18483()) {
            if (!c6861.f23142) {
                c6861.f23142 = true;
                dialogInterfaceC19356.dismiss();
                ServiceC2046.m6541();
                C4744.m13120();
                this.f49928.run();
                return;
            }
            abstractActivityC12483.getLifecycle().mo9172(this);
        }
    }
}
